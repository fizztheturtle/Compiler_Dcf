// Generated from /Users/Fizztheturtle/GoogleDrive/ThirdYear_UNI/Programming/Term2/Skeleton/src/decaf/DecafParser.g4 by ANTLR 4.7
package decaf;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#field_name}.
	 * @param ctx the parse tree
	 */
	void enterField_name(DecafParser.Field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_name}.
	 * @param ctx the parse tree
	 */
	void exitField_name(DecafParser.Field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#field_dec}.
	 * @param ctx the parse tree
	 */
	void enterField_dec(DecafParser.Field_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_dec}.
	 * @param ctx the parse tree
	 */
	void exitField_dec(DecafParser.Field_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_dec_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_dec_name(DecafParser.Method_dec_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_dec_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_dec_name(DecafParser.Method_dec_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_dec}.
	 * @param ctx the parse tree
	 */
	void enterMethod_dec(DecafParser.Method_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_dec}.
	 * @param ctx the parse tree
	 */
	void exitMethod_dec(DecafParser.Method_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DecafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(DecafParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(DecafParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(DecafParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(DecafParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DecafParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DecafParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DecafParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DecafParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MC}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMC(DecafParser.MCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MC}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMC(DecafParser.MCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(DecafParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(DecafParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(DecafParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(DecafParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(DecafParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(DecafParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak(DecafParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak(DecafParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue(DecafParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue(DecafParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code B1}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterB1(DecafParser.B1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code B1}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitB1(DecafParser.B1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(DecafParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(DecafParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(DecafParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(DecafParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(DecafParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(DecafParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(DecafParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(DecafParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DecafParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DecafParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(DecafParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(DecafParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op(DecafParser.Relational_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op(DecafParser.Relational_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#cond_and}.
	 * @param ctx the parse tree
	 */
	void enterCond_and(DecafParser.Cond_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#cond_and}.
	 * @param ctx the parse tree
	 */
	void exitCond_and(DecafParser.Cond_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#cond_or}.
	 * @param ctx the parse tree
	 */
	void enterCond_or(DecafParser.Cond_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#cond_or}.
	 * @param ctx the parse tree
	 */
	void exitCond_or(DecafParser.Cond_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DecafParser.LiteralContext ctx);
}