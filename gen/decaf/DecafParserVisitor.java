// Generated from /Users/Fizztheturtle/GoogleDrive/ThirdYear_UNI/Programming/Term2/Skeleton/src/decaf/DecafParser.g4 by ANTLR 4.7
package decaf;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DecafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecafParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#field_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_name(DecafParser.Field_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#field_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_dec(DecafParser.Field_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_dec_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_dec_name(DecafParser.Method_dec_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_dec(DecafParser.Method_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DecafParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(DecafParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(DecafParser.Var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DecafParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DecafParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MC}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMC(DecafParser.MCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(DecafParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(DecafParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(DecafParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(DecafParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(DecafParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code B1}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB1(DecafParser.B1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(DecafParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(DecafParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(DecafParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(DecafParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DecafParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout_arg(DecafParser.Callout_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#relational_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_op(DecafParser.Relational_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#cond_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_and(DecafParser.Cond_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#cond_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_or(DecafParser.Cond_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DecafParser.LiteralContext ctx);
}