// Generated from C:/Alaa Data/CSE8/Compilers/Labs/PA2/grammars/P_COOL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class P_COOLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, INHERITS=2, IF=3, THEN=4, ELSE=5, FI=6, DO=7, WHILE=8, LOOP=9, 
		POOL=10, LET=11, IN=12, CASE=13, ESAC=14, OF=15, NEW=16, ISVOID=17, NOT=18, 
		TRUE=19, FALSE=20, INTEGERS=21, SELF=22, SELF_TYPE=23, TYPE_IDENTIFIER=24, 
		OBJECT_IDENTIFIER=25, LPAREN=26, RPAREN=27, SEMI=28, COLON=29, ATSYM=30, 
		COMMA=31, PLUS_OP=32, MINUS_OP=33, MULT_OP=34, DIV_OP=35, TILDE_OP=36, 
		LT_OP=37, EQUALS_OP=38, LBRACE=39, RBRACE=40, DOT_OP=41, LE_OP=42, ASSIGN_OP=43, 
		RES=44, STRING=45, SINGLECOMMENT=46, COMMENT=47, OCOMMENT=48, CCOMMENT=49, 
		INCOMMENT_T=50, WS=51;
	public static final int
		RULE_program = 0, RULE_class = 1, RULE_feature = 2, RULE_formal = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'self'", 
			"'SELF_TYPE'", null, null, "'('", "')'", "';'", "':'", "'@'", "','", 
			"'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", "'}'", "'.'", 
			"'<='", "'<-'", "'=>'", null, null, null, null, "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "INHERITS", "IF", "THEN", "ELSE", "FI", "DO", "WHILE", 
			"LOOP", "POOL", "LET", "IN", "CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT", 
			"TRUE", "FALSE", "INTEGERS", "SELF", "SELF_TYPE", "TYPE_IDENTIFIER", 
			"OBJECT_IDENTIFIER", "LPAREN", "RPAREN", "SEMI", "COLON", "ATSYM", "COMMA", 
			"PLUS_OP", "MINUS_OP", "MULT_OP", "DIV_OP", "TILDE_OP", "LT_OP", "EQUALS_OP", 
			"LBRACE", "RBRACE", "DOT_OP", "LE_OP", "ASSIGN_OP", "RES", "STRING", 
			"SINGLECOMMENT", "COMMENT", "OCOMMENT", "CCOMMENT", "INCOMMENT_T", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "P_COOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public P_COOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ProgramContext {
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public StartContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new StartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				class_();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	 
		public ClassContext() { }
		public void copyFrom(ClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassdefContext extends ClassContext {
		public TerminalNode CLASS() { return getToken(P_COOLParser.CLASS, 0); }
		public List<TerminalNode> TYPE_IDENTIFIER() { return getTokens(P_COOLParser.TYPE_IDENTIFIER); }
		public TerminalNode TYPE_IDENTIFIER(int i) {
			return getToken(P_COOLParser.TYPE_IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(P_COOLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(P_COOLParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(P_COOLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(P_COOLParser.SEMI, i);
		}
		public TerminalNode INHERITS() { return getToken(P_COOLParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ClassdefContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class);
		int _la;
		try {
			_localctx = new ClassdefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(CLASS);
			setState(16);
			match(TYPE_IDENTIFIER);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(17);
				match(INHERITS);
				setState(18);
				match(TYPE_IDENTIFIER);
				}
			}

			setState(21);
			match(LBRACE);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECT_IDENTIFIER) {
				{
				{
				setState(22);
				feature();
				setState(23);
				match(SEMI);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(RBRACE);
			setState(31);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends FeatureContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(P_COOLParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(P_COOLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(P_COOLParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(P_COOLParser.COLON, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(P_COOLParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(P_COOLParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(P_COOLParser.RBRACE, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(P_COOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(P_COOLParser.COMMA, i);
		}
		public FunctionContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends FeatureContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(P_COOLParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(P_COOLParser.COLON, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(P_COOLParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(P_COOLParser.ASSIGN_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(OBJECT_IDENTIFIER);
				setState(34);
				match(LPAREN);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJECT_IDENTIFIER) {
					{
					setState(35);
					formal();
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(36);
						match(COMMA);
						setState(37);
						formal();
						}
						}
						setState(42);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(45);
				match(RPAREN);
				setState(46);
				match(COLON);
				setState(47);
				match(TYPE_IDENTIFIER);
				setState(48);
				match(LBRACE);
				setState(49);
				expr(0);
				setState(50);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(OBJECT_IDENTIFIER);
				setState(53);
				match(COLON);
				setState(54);
				match(TYPE_IDENTIFIER);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP) {
					{
					setState(55);
					match(ASSIGN_OP);
					setState(56);
					expr(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalContext extends ParserRuleContext {
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	 
		public FormalContext() { }
		public void copyFrom(FormalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends FormalContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(P_COOLParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(P_COOLParser.COLON, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(P_COOLParser.TYPE_IDENTIFIER, 0); }
		public ParameterContext(FormalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			_localctx = new ParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(OBJECT_IDENTIFIER);
			setState(62);
			match(COLON);
			setState(63);
			match(TYPE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectcallContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT_OP() { return getToken(P_COOLParser.DOT_OP, 0); }
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(P_COOLParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(P_COOLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(P_COOLParser.RPAREN, 0); }
		public TerminalNode ATSYM() { return getToken(P_COOLParser.ATSYM, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(P_COOLParser.TYPE_IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(P_COOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(P_COOLParser.COMMA, i);
		}
		public ObjectcallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterObjectcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitObjectcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitObjectcall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS_OP() { return getToken(P_COOLParser.MINUS_OP, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT_OP() { return getToken(P_COOLParser.MULT_OP, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE_OP() { return getToken(P_COOLParser.LE_OP, 0); }
		public LqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterLq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitLq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitLq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ExprContext {
		public TerminalNode INTEGERS() { return getToken(P_COOLParser.INTEGERS, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT_OP() { return getToken(P_COOLParser.LT_OP, 0); }
		public LtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(P_COOLParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode POOL() { return getToken(P_COOLParser.POOL, 0); }
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DowhileContext extends ExprContext {
		public TerminalNode DO() { return getToken(P_COOLParser.DO, 0); }
		public TerminalNode LOOP() { return getToken(P_COOLParser.LOOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POOL() { return getToken(P_COOLParser.POOL, 0); }
		public TerminalNode WHILE() { return getToken(P_COOLParser.WHILE, 0); }
		public DowhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV_OP() { return getToken(P_COOLParser.DIV_OP, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(P_COOLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ExprContext {
		public TerminalNode LBRACE() { return getToken(P_COOLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(P_COOLParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(P_COOLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(P_COOLParser.SEMI, i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ExprContext {
		public TerminalNode LET() { return getToken(P_COOLParser.LET, 0); }
		public List<TerminalNode> OBJECT_IDENTIFIER() { return getTokens(P_COOLParser.OBJECT_IDENTIFIER); }
		public TerminalNode OBJECT_IDENTIFIER(int i) {
			return getToken(P_COOLParser.OBJECT_IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(P_COOLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(P_COOLParser.COLON, i);
		}
		public List<TerminalNode> TYPE_IDENTIFIER() { return getTokens(P_COOLParser.TYPE_IDENTIFIER); }
		public TerminalNode TYPE_IDENTIFIER(int i) {
			return getToken(P_COOLParser.TYPE_IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(P_COOLParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASSIGN_OP() { return getTokens(P_COOLParser.ASSIGN_OP); }
		public TerminalNode ASSIGN_OP(int i) {
			return getToken(P_COOLParser.ASSIGN_OP, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(P_COOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(P_COOLParser.COMMA, i);
		}
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewobjectContext extends ExprContext {
		public TerminalNode NEW() { return getToken(P_COOLParser.NEW, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(P_COOLParser.TYPE_IDENTIFIER, 0); }
		public NewobjectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterNewobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitNewobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitNewobject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(P_COOLParser.OBJECT_IDENTIFIER, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ExprContext {
		public TerminalNode STRING() { return getToken(P_COOLParser.STRING, 0); }
		public TextContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ExprContext {
		public TerminalNode IF() { return getToken(P_COOLParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(P_COOLParser.THEN, 0); }
		public TerminalNode FI() { return getToken(P_COOLParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(P_COOLParser.ELSE, 0); }
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ExprContext {
		public TerminalNode CASE() { return getToken(P_COOLParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(P_COOLParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(P_COOLParser.ESAC, 0); }
		public List<TerminalNode> OBJECT_IDENTIFIER() { return getTokens(P_COOLParser.OBJECT_IDENTIFIER); }
		public TerminalNode OBJECT_IDENTIFIER(int i) {
			return getToken(P_COOLParser.OBJECT_IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(P_COOLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(P_COOLParser.COLON, i);
		}
		public List<TerminalNode> TYPE_IDENTIFIER() { return getTokens(P_COOLParser.TYPE_IDENTIFIER); }
		public TerminalNode TYPE_IDENTIFIER(int i) {
			return getToken(P_COOLParser.TYPE_IDENTIFIER, i);
		}
		public List<TerminalNode> RES() { return getTokens(P_COOLParser.RES); }
		public TerminalNode RES(int i) {
			return getToken(P_COOLParser.RES, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(P_COOLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(P_COOLParser.SEMI, i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParexprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(P_COOLParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(P_COOLParser.RPAREN, 0); }
		public ParexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterParexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitParexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitParexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS_OP() { return getToken(P_COOLParser.PLUS_OP, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(P_COOLParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvertContext extends ExprContext {
		public TerminalNode TILDE_OP() { return getToken(P_COOLParser.TILDE_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InvertContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterInvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitInvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitInvert(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(P_COOLParser.FALSE, 0); }
		public FalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS_OP() { return getToken(P_COOLParser.EQUALS_OP, 0); }
		public EqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(P_COOLParser.TRUE, 0); }
		public TrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ExprContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(P_COOLParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(P_COOLParser.ASSIGN_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StaticcallContext extends ExprContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(P_COOLParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(P_COOLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(P_COOLParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(P_COOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(P_COOLParser.COMMA, i);
		}
		public StaticcallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).enterStaticcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P_COOLListener ) ((P_COOLListener)listener).exitStaticcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P_COOLVisitor ) return ((P_COOLVisitor<? extends T>)visitor).visitStaticcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				match(OBJECT_IDENTIFIER);
				setState(67);
				match(ASSIGN_OP);
				setState(68);
				expr(26);
				}
				break;
			case 2:
				{
				_localctx = new StaticcallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(OBJECT_IDENTIFIER);
				setState(70);
				match(LPAREN);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35802952182152L) != 0)) {
					{
					setState(71);
					expr(0);
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(72);
						match(COMMA);
						setState(73);
						expr(0);
						}
						}
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(81);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(IF);
				setState(83);
				expr(0);
				setState(84);
				match(THEN);
				setState(85);
				expr(0);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(86);
					match(ELSE);
					setState(87);
					expr(0);
					}
				}

				setState(90);
				match(FI);
				}
				break;
			case 4:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(WHILE);
				setState(93);
				expr(0);
				setState(94);
				match(POOL);
				}
				break;
			case 5:
				{
				_localctx = new DowhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(DO);
				setState(97);
				match(LOOP);
				setState(98);
				expr(0);
				setState(99);
				match(POOL);
				setState(100);
				match(WHILE);
				setState(101);
				expr(20);
				}
				break;
			case 6:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(LBRACE);
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					expr(0);
					setState(105);
					match(SEMI);
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35802952182152L) != 0) );
				setState(111);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(LET);
				setState(114);
				match(OBJECT_IDENTIFIER);
				setState(115);
				match(COLON);
				setState(116);
				match(TYPE_IDENTIFIER);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP) {
					{
					setState(117);
					match(ASSIGN_OP);
					setState(118);
					expr(0);
					}
				}

				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(121);
					match(COMMA);
					setState(122);
					match(OBJECT_IDENTIFIER);
					setState(123);
					match(COLON);
					setState(124);
					match(TYPE_IDENTIFIER);
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN_OP) {
						{
						setState(125);
						match(ASSIGN_OP);
						setState(126);
						expr(0);
						}
					}

					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(IN);
				setState(135);
				expr(18);
				}
				break;
			case 8:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(CASE);
				setState(137);
				expr(0);
				setState(138);
				match(OF);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					match(OBJECT_IDENTIFIER);
					setState(140);
					match(COLON);
					setState(141);
					match(TYPE_IDENTIFIER);
					setState(142);
					match(RES);
					setState(143);
					expr(0);
					setState(144);
					match(SEMI);
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECT_IDENTIFIER );
				setState(150);
				match(ESAC);
				}
				break;
			case 9:
				{
				_localctx = new NewobjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(NEW);
				setState(153);
				match(TYPE_IDENTIFIER);
				}
				break;
			case 10:
				{
				_localctx = new VoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(ISVOID);
				setState(155);
				expr(15);
				}
				break;
			case 11:
				{
				_localctx = new InvertContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(TILDE_OP);
				setState(157);
				expr(10);
				}
				break;
			case 12:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(NOT);
				setState(159);
				expr(7);
				}
				break;
			case 13:
				{
				_localctx = new ParexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(LPAREN);
				setState(161);
				expr(0);
				setState(162);
				match(RPAREN);
				}
				break;
			case 14:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(OBJECT_IDENTIFIER);
				}
				break;
			case 15:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(INTEGERS);
				}
				break;
			case 16:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(STRING);
				}
				break;
			case 17:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(TRUE);
				}
				break;
			case 18:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(172);
						match(LT_OP);
						setState(173);
						expr(24);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(175);
						match(PLUS_OP);
						setState(176);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(178);
						match(MINUS_OP);
						setState(179);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(181);
						match(MULT_OP);
						setState(182);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(184);
						match(DIV_OP);
						setState(185);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new LqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(187);
						match(LE_OP);
						setState(188);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new EqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(190);
						match(EQUALS_OP);
						setState(191);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ObjectcallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ATSYM) {
							{
							setState(193);
							match(ATSYM);
							setState(194);
							match(TYPE_IDENTIFIER);
							}
						}

						setState(197);
						match(DOT_OP);
						setState(198);
						match(OBJECT_IDENTIFIER);
						setState(199);
						match(LPAREN);
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35802952182152L) != 0)) {
							{
							setState(200);
							expr(0);
							setState(205);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(201);
								match(COMMA);
								setState(202);
								expr(0);
								}
								}
								setState(207);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(210);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 25);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u00d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001\u001d"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*"+
		"\t\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002:\b\u0002\u0003\u0002<\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0003\u0004"+
		"P\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004Y\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004l\b\u0004\u000b\u0004"+
		"\f\u0004m\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0080\b\u0004\u0005\u0004\u0082\b\u0004\n\u0004\f\u0004\u0085\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u0093\b\u0004\u000b\u0004\f\u0004\u0094\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00aa\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00c4\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00cc\b\u0004\n"+
		"\u0004\f\u0004\u00cf\t\u0004\u0003\u0004\u00d1\b\u0004\u0001\u0004\u0005"+
		"\u0004\u00d4\b\u0004\n\u0004\f\u0004\u00d7\t\u0004\u0001\u0004\u0000\u0001"+
		"\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000\u00fe\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004;\u0001\u0000"+
		"\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\b\u00a9\u0001\u0000\u0000"+
		"\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r"+
		"\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0005"+
		"\u0001\u0000\u0000\u0010\u0013\u0005\u0018\u0000\u0000\u0011\u0012\u0005"+
		"\u0002\u0000\u0000\u0012\u0014\u0005\u0018\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u001b\u0005\'\u0000\u0000\u0016\u0017\u0003\u0004"+
		"\u0002\u0000\u0017\u0018\u0005\u001c\u0000\u0000\u0018\u001a\u0001\u0000"+
		"\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005(\u0000\u0000\u001f \u0005\u001c\u0000\u0000"+
		" \u0003\u0001\u0000\u0000\u0000!\"\u0005\u0019\u0000\u0000\"+\u0005\u001a"+
		"\u0000\u0000#(\u0003\u0006\u0003\u0000$%\u0005\u001f\u0000\u0000%\'\u0003"+
		"\u0006\u0003\u0000&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000),\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+#\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u001b\u0000\u0000./\u0005"+
		"\u001d\u0000\u0000/0\u0005\u0018\u0000\u000001\u0005\'\u0000\u000012\u0003"+
		"\b\u0004\u000023\u0005(\u0000\u00003<\u0001\u0000\u0000\u000045\u0005"+
		"\u0019\u0000\u000056\u0005\u001d\u0000\u000069\u0005\u0018\u0000\u0000"+
		"78\u0005+\u0000\u00008:\u0003\b\u0004\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;!\u0001\u0000\u0000"+
		"\u0000;4\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005"+
		"\u0019\u0000\u0000>?\u0005\u001d\u0000\u0000?@\u0005\u0018\u0000\u0000"+
		"@\u0007\u0001\u0000\u0000\u0000AB\u0006\u0004\uffff\uffff\u0000BC\u0005"+
		"\u0019\u0000\u0000CD\u0005+\u0000\u0000D\u00aa\u0003\b\u0004\u001aEF\u0005"+
		"\u0019\u0000\u0000FO\u0005\u001a\u0000\u0000GL\u0003\b\u0004\u0000HI\u0005"+
		"\u001f\u0000\u0000IK\u0003\b\u0004\u0000JH\u0001\u0000\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OG\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u00aa\u0005"+
		"\u001b\u0000\u0000RS\u0005\u0003\u0000\u0000ST\u0003\b\u0004\u0000TU\u0005"+
		"\u0004\u0000\u0000UX\u0003\b\u0004\u0000VW\u0005\u0005\u0000\u0000WY\u0003"+
		"\b\u0004\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0006\u0000\u0000[\u00aa\u0001\u0000\u0000"+
		"\u0000\\]\u0005\b\u0000\u0000]^\u0003\b\u0004\u0000^_\u0005\n\u0000\u0000"+
		"_\u00aa\u0001\u0000\u0000\u0000`a\u0005\u0007\u0000\u0000ab\u0005\t\u0000"+
		"\u0000bc\u0003\b\u0004\u0000cd\u0005\n\u0000\u0000de\u0005\b\u0000\u0000"+
		"ef\u0003\b\u0004\u0014f\u00aa\u0001\u0000\u0000\u0000gk\u0005\'\u0000"+
		"\u0000hi\u0003\b\u0004\u0000ij\u0005\u001c\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000kh\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005"+
		"(\u0000\u0000p\u00aa\u0001\u0000\u0000\u0000qr\u0005\u000b\u0000\u0000"+
		"rs\u0005\u0019\u0000\u0000st\u0005\u001d\u0000\u0000tw\u0005\u0018\u0000"+
		"\u0000uv\u0005+\u0000\u0000vx\u0003\b\u0004\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u0083\u0001\u0000\u0000\u0000yz\u0005"+
		"\u001f\u0000\u0000z{\u0005\u0019\u0000\u0000{|\u0005\u001d\u0000\u0000"+
		"|\u007f\u0005\u0018\u0000\u0000}~\u0005+\u0000\u0000~\u0080\u0003\b\u0004"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u0001\u0000\u0000\u0000\u0081y\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005\f\u0000\u0000\u0087\u00aa"+
		"\u0003\b\u0004\u0012\u0088\u0089\u0005\r\u0000\u0000\u0089\u008a\u0003"+
		"\b\u0004\u0000\u008a\u0092\u0005\u000f\u0000\u0000\u008b\u008c\u0005\u0019"+
		"\u0000\u0000\u008c\u008d\u0005\u001d\u0000\u0000\u008d\u008e\u0005\u0018"+
		"\u0000\u0000\u008e\u008f\u0005,\u0000\u0000\u008f\u0090\u0003\b\u0004"+
		"\u0000\u0090\u0091\u0005\u001c\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000e\u0000"+
		"\u0000\u0097\u00aa\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0010\u0000"+
		"\u0000\u0099\u00aa\u0005\u0018\u0000\u0000\u009a\u009b\u0005\u0011\u0000"+
		"\u0000\u009b\u00aa\u0003\b\u0004\u000f\u009c\u009d\u0005$\u0000\u0000"+
		"\u009d\u00aa\u0003\b\u0004\n\u009e\u009f\u0005\u0012\u0000\u0000\u009f"+
		"\u00aa\u0003\b\u0004\u0007\u00a0\u00a1\u0005\u001a\u0000\u0000\u00a1\u00a2"+
		"\u0003\b\u0004\u0000\u00a2\u00a3\u0005\u001b\u0000\u0000\u00a3\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a4\u00aa\u0005\u0019\u0000\u0000\u00a5\u00aa\u0005"+
		"\u0015\u0000\u0000\u00a6\u00aa\u0005-\u0000\u0000\u00a7\u00aa\u0005\u0013"+
		"\u0000\u0000\u00a8\u00aa\u0005\u0014\u0000\u0000\u00a9A\u0001\u0000\u0000"+
		"\u0000\u00a9E\u0001\u0000\u0000\u0000\u00a9R\u0001\u0000\u0000\u0000\u00a9"+
		"\\\u0001\u0000\u0000\u0000\u00a9`\u0001\u0000\u0000\u0000\u00a9g\u0001"+
		"\u0000\u0000\u0000\u00a9q\u0001\u0000\u0000\u0000\u00a9\u0088\u0001\u0000"+
		"\u0000\u0000\u00a9\u0098\u0001\u0000\u0000\u0000\u00a9\u009a\u0001\u0000"+
		"\u0000\u0000\u00a9\u009c\u0001\u0000\u0000\u0000\u00a9\u009e\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00d5\u0001\u0000\u0000\u0000\u00ab\u00ac\n\u0017\u0000"+
		"\u0000\u00ac\u00ad\u0005%\u0000\u0000\u00ad\u00d4\u0003\b\u0004\u0018"+
		"\u00ae\u00af\n\u000e\u0000\u0000\u00af\u00b0\u0005 \u0000\u0000\u00b0"+
		"\u00d4\u0003\b\u0004\u000f\u00b1\u00b2\n\r\u0000\u0000\u00b2\u00b3\u0005"+
		"!\u0000\u0000\u00b3\u00d4\u0003\b\u0004\u000e\u00b4\u00b5\n\f\u0000\u0000"+
		"\u00b5\u00b6\u0005\"\u0000\u0000\u00b6\u00d4\u0003\b\u0004\r\u00b7\u00b8"+
		"\n\u000b\u0000\u0000\u00b8\u00b9\u0005#\u0000\u0000\u00b9\u00d4\u0003"+
		"\b\u0004\f\u00ba\u00bb\n\t\u0000\u0000\u00bb\u00bc\u0005*\u0000\u0000"+
		"\u00bc\u00d4\u0003\b\u0004\n\u00bd\u00be\n\b\u0000\u0000\u00be\u00bf\u0005"+
		"&\u0000\u0000\u00bf\u00d4\u0003\b\u0004\t\u00c0\u00c3\n\u0019\u0000\u0000"+
		"\u00c1\u00c2\u0005\u001e\u0000\u0000\u00c2\u00c4\u0005\u0018\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005)\u0000\u0000\u00c6"+
		"\u00c7\u0005\u0019\u0000\u0000\u00c7\u00d0\u0005\u001a\u0000\u0000\u00c8"+
		"\u00cd\u0003\b\u0004\u0000\u00c9\u00ca\u0005\u001f\u0000\u0000\u00ca\u00cc"+
		"\u0003\b\u0004\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0005"+
		"\u001b\u0000\u0000\u00d3\u00ab\u0001\u0000\u0000\u0000\u00d3\u00ae\u0001"+
		"\u0000\u0000\u0000\u00d3\u00b1\u0001\u0000\u0000\u0000\u00d3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00d3\u00b7\u0001\u0000\u0000\u0000\u00d3\u00ba\u0001"+
		"\u0000\u0000\u0000\u00d3\u00bd\u0001\u0000\u0000\u0000\u00d3\u00c0\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\t\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u0015\r\u0013\u001b("+
		"+9;LOXmw\u007f\u0083\u0094\u00a9\u00c3\u00cd\u00d0\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}