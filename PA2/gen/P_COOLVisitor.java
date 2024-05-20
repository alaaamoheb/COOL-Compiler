// Generated from C:/Alaa Data/CSE8/Compilers/Labs/PA2/grammars/P_COOL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link P_COOLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface P_COOLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code start}
	 * labeled alternative in {@link P_COOLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(P_COOLParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classdef}
	 * labeled alternative in {@link P_COOLParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(P_COOLParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link P_COOLParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(P_COOLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link P_COOLParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(P_COOLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link P_COOLParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(P_COOLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectcall}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectcall(P_COOLParser.ObjectcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(P_COOLParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(P_COOLParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lq}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLq(P_COOLParser.LqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(P_COOLParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(P_COOLParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(P_COOLParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(P_COOLParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(P_COOLParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(P_COOLParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(P_COOLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(P_COOLParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newobject}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewobject(P_COOLParser.NewobjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(P_COOLParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(P_COOLParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(P_COOLParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(P_COOLParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(P_COOLParser.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(P_COOLParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid(P_COOLParser.VoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invert}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvert(P_COOLParser.InvertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(P_COOLParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(P_COOLParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(P_COOLParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(P_COOLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticcall}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticcall(P_COOLParser.StaticcallContext ctx);
}