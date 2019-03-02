package decaf;
import org.antlr.v4.runtime.Token;
//
import java.util.List;
import java.util.Stack;
//
public class ScopeListener extends DecafParserBaseListener{
//
//    private Stack<Scope> scopes;
//
//    public ScopeListener(){
//        scopes = new Stack<Scope>();
//        scopes.push(new Scope(null));
//    }
//
//
//    public void enterVar_name(DecafParser.Var_nameContext ctx){
//
//        String name = ctx.ID().getText();
//
////        System.out.print(name);
//        Token token =ctx.getStart();
//        int line= token.getLine();
//        System.out.print(token.getText());
//        DecafParser.TypeContext tctx = ((DecafParser.Var_decContext)ctx.getParent()).type();
//
//        int type = (tctx.INT()==null)? DecafParser.BOOLEAN:DecafParser.INT;
//        scopes.peek().put(name,new ScopeElement(name,type,line));
//
//        ScopeElement found = scopes.peek().get(name);
//        if (found !=null) {
//            System.err.println("Error Line" + token.getLine()
//                    + ": Variable \"" +name
//                    + "\" is declared more than once in the same scope");
//        }
//    }
//
//    public void enterAssign(DecafParser.AssignContext ctx) {
//        DecafParser.LocationContext lctx = ctx.location();
//        String varName = lctx.ID().getText();
//
//        Token token = ctx.getStart();
//        Scope scope = scopes.peek();
//        ScopeElement found = scope.find(varName);
//        if (found == null) {
//            System.err.println("Error Line" + token.getLine()
//                    + ": Variable \"" + varName
//                    + "\" used without prior declaration");
//                            }
//    }
//
//    public void enterMethod_dec_name(DecafParser.Method_dec_nameContext ctx) {
//        String name = ctx.ID().getText();
//        Token token = ctx.getStart();
//        int line = token.getLine();
//
//        DecafParser.TypeContext tctx = ((DecafParser.Method_dec_nameContext)ctx.getParent()).type();
//
//        int type = (tctx.INT()==null)? DecafParser.BOOLEAN:DecafParser.INT;
//
//        scopes.peek().put(name,new ScopeElement(name,type,line));
//
//    }
//
//    public void enterMethod_dec(DecafParser.Method_decContext ctx) {
//        scopes.push(new Scope(null));
//        String methodName = ctx.ID().getText();
//
//        Token token=ctx.getStart();
////
//        int listSize= ctx.method_dec_name().size();
//        int type;
//        if(ctx.type()==null){
//            type=DecafParser.VOID;
//        }
//        else {
//             type = (ctx.type().INT()==null)? DecafParser.BOOLEAN:DecafParser.INT;
//        }
////
//
//        int line =token.getLine();
//
//        int[] type2 =new int[listSize];
//        for (int i=0; i<listSize ;i++)
//        {
//           if(ctx.method_dec_name(i).type().INT()!=null){
//               type2[i] = DecafParser.INT;
//           }
//           else{
//                type2[i] = DecafParser.BOOLEAN;
//            }
//        }
//        scopes.peek().put(methodName,new ScopeElement(methodName,type,line,type2));
////        exitMethod_dec(ctx);
////find block then exit
//    }
//    public void exitMethod_dec(DecafParser.Method_decContext ctx){
//         scopes.pop();
//    }
//
//}
//package decaf;
//
//        import org.antlr.v4.runtime.ParserRuleContext;
//        import org.antlr.v4.runtime.tree.ParseTreeProperty;
//        import org.antlr.v4.runtime.tree.TerminalNode;
//
//        import java.lang.reflect.Array;
//        import java.util.HashMap;
//        import java.util.List;
//        import java.util.Stack;
//
//        import static decaf.DecafParser.ruleNames;
//
//public class ScopeListener extends DecafParserBaseListener {

    private Stack<Scope> scopes;
    private Scope currentScope;
//    private ParseTreeProperty<Symbol> annotations = new ParseTreeProperty<Symbol>();
    private String[] returnTypes = {"void", "int", "boolean"};

    public ScopeListener() {
        scopes = new Stack<Scope>();
        scopes.push(new Scope(null));
    }

    @Override
    public void enterProgram(DecafParser.ProgramContext ctx) {
        //keep track of the scope we are currently in
        scopes.push(new Scope(scopes.peek()));
        this.currentScope = scopes.peek();

        //Get all the method within the global 'class' scope
        List<DecafParser.Method_declContext> methods = ctx.method_decl();

        //Check to ensure the last defined method is main()
        if (! methods.isEmpty()) {
            if (! methods.get(methods.size() - 1).ID().getText().equals("main")) {
                System.out.println("Warning: Methods defined after Main will not run");
            }
        }
    }

    @Override
    public void enterField_decl(DecafParser.Field_declContext ctx) {
        for (DecafParser.Field_nameContext field_nameContext : ctx.field_name()) {
            //check to see if its in the current global scope
            //as field declarations will only ever be valid in the global scope
            if (field_nameContext.ID() != null && !this.currentScope.inScope(field_nameContext.ID().getText())) {
                //check to see if we are looking at an array
                if(field_nameContext.LSQUARE() != null && field_nameContext.RSQUARE() != null) {
                    //add this to the current scope
                    this.currentScope.put(field_nameContext.ID().getText(), new Location(ctx.type().getText(), Integer.parseInt(field_nameContext.INTLITERAL().getText())));
                    //annotate the parse tree with the type for later use
                    this.annotations.put(ctx, new Symbol(ctx.type().getText()));
                } //otherwise create a global variable
                else if(field_nameContext.ID() != null) {
                    this.currentScope.put(field_nameContext.ID().getText(), new Symbol((ctx.type().getText())));
                    this.annotations.put(ctx, new Symbol(ctx.type().getText()));
                } else {
                    printError("Unrecognised field declaration");
                }
            } else {
                printError(field_nameContext.ID().getText() + " has already been declared");
            }

            //ensure it is initialised with a correct size
            if(field_nameContext.INTLITERAL() != null && Integer.parseInt(field_nameContext.INTLITERAL().getText()) == 0) {
                printError(field_nameContext.ID().getText() + " must be initialised greater than " + field_nameContext.INTLITERAL().getText());
            }

        }
    }

    @Override
    public void enterVar_decl(DecafParser.Var_declContext ctx) {
        String type = ctx.type().toString();

        for (TerminalNode node : ctx.ID()) {
            if (node != null && checkVar(node.getText())) {
                printError("Variable " + node.getText() + " has already been defined");
            } else {
                this.currentScope.put(node.toString(), new Symbol(type));
                this.annotations.put(ctx, new Symbol(type));
            }
        }
    }

    //implements Expr checks including all <expr> annotations
    @Override
    public void enterLocationExpr(DecafParser.LocationExprContext ctx) {
        Symbol type = this.currentScope.get(ctx.location().ID().getText());
        this.annotations.put(ctx, new Symbol(type.Type));

    }

    @Override
    public void enterMethodExpr(DecafParser.MethodExprContext ctx) {
        Symbol type = this.currentScope.get(ctx.method_call().ID().getText());

        if(this.currentScope.get(ctx.method_call().ID().getText()) instanceof Method) {
            printError("is method");
        } else {
            printError("not method");
        }

        if(type instanceof Method) {
            printError("hello");
        } else {
            printError(":(");
        }
        this.annotations.put(ctx, new Symbol(type.Type));
    }

    @Override
    public void enterMethod_decl(DecafParser.Method_declContext ctx) {
        //keep track of the scope we are currently in
        scopes.push(new Scope(scopes.peek()));
        this.currentScope = scopes.peek();

        if (this.currentScope.inScope(ctx.ID().getText())) {
            printError("Method " + ctx.ID().getText() + " has already been defined");
        } else {
            this.currentScope.put(ctx.ID().getText(), new Method(ctx.methodReturnType().getText(), new HashMap<String, Symbol>())); //TODO: Add methods inputs
            this.annotations.put(ctx, new Method(ctx.methodReturnType().getText(), new HashMap<String, Symbol>()));
        }

        if ("main".equals(ctx.ID().toString())) {
            if (!ctx.methodParms().ID().isEmpty()) {
                System.out.println("Error: " + ctx.ID() + " Should have 0 parameters, has " + ctx.methodParms().ID().size());
            }
        }

        if (this.returnTypes[0].equals(ctx.methodReturnType().getText())) {
            for (DecafParser.StatementContext statementContext : ctx.block().statement()) {
                if (statementContext.returnStatement() != null && !statementContext.returnStatement().expr().isEmpty()) {
                    printError("Method " + ctx.ID().getText() + " :is " + ctx.methodReturnType().getText() + " but returns " + statementContext.returnStatement().expr().getText());
                }
            }
        } else if(this.returnTypes[1].equals(ctx.methodReturnType().getText())) {
        } else if(this.returnTypes[2].equals(ctx.methodReturnType().getText())) {
        }

    }

    @Override
    public void exitMethod_decl(DecafParser.Method_declContext ctx) {
        //Remove this scope off and return back to the previous
        scopes.pop();
        this.currentScope = scopes.peek();
    }

    public void printError(String token) {
        System.err.println("ERROR FOUND: " + token);
    }

    public boolean checkVar(String ID) {
        return this.currentScope.inScope(ID);
    }
}