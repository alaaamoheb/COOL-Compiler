// Generated from C:/Alaa Data/CSE8/Compilers/Labs/PA2/grammars/P_COOL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link P_COOLParser}.
 */
public interface P_COOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code start}
	 * labeled alternative in {@link P_COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterStart(P_COOLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code start}
	 * labeled alternative in {@link P_COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitStart(P_COOLParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classdef}
	 * labeled alternative in {@link P_COOLParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(P_COOLParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classdef}
	 * labeled alternative in {@link P_COOLParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(P_COOLParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link P_COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFunction(P_COOLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link P_COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFunction(P_COOLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link P_COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterVariable(P_COOLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link P_COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitVariable(P_COOLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link P_COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterParameter(P_COOLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link P_COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitParameter(P_COOLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectcall}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectcall(P_COOLParser.ObjectcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectcall}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectcall(P_COOLParser.ObjectcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(P_COOLParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(P_COOLParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(P_COOLParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(P_COOLParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lq}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLq(P_COOLParser.LqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lq}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLq(P_COOLParser.LqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(P_COOLParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(P_COOLParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLt(P_COOLParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLt(P_COOLParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(P_COOLParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(P_COOLParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(P_COOLParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(P_COOLParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(P_COOLParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(P_COOLParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(P_COOLParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(P_COOLParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock(P_COOLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock(P_COOLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLet(P_COOLParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLet(P_COOLParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newobject}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewobject(P_COOLParser.NewobjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newobject}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewobject(P_COOLParser.NewobjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(P_COOLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(P_COOLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterText(P_COOLParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitText(P_COOLParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(P_COOLParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(P_COOLParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase(P_COOLParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase(P_COOLParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParexpr(P_COOLParser.ParexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParexpr(P_COOLParser.ParexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(P_COOLParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(P_COOLParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVoid(P_COOLParser.VoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVoid(P_COOLParser.VoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invert}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInvert(P_COOLParser.InvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invert}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInvert(P_COOLParser.InvertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(P_COOLParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(P_COOLParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEq(P_COOLParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEq(P_COOLParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(P_COOLParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(P_COOLParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(P_COOLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(P_COOLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticcall}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStaticcall(P_COOLParser.StaticcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticcall}
	 * labeled alternative in {@link P_COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStaticcall(P_COOLParser.StaticcallContext ctx);
}