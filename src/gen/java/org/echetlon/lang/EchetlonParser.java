// Generated from C:/projects/java/echetlon-lang\Echetlon.g4 by ANTLR 4.8
package org.echetlon.lang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EchetlonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, OBJ=2, INT=3, STR=4, NEW=5, LOOP=6, RETURN=7, EQ=8, STRING=9, IDENTIFIER=10, 
		SEMIC=11, COLON=12, LCPAREN=13, RCPAREN=14, LPAREN=15, RPAREN=16, LSPAREN=17, 
		RSPAREN=18, COMMA=19, DOT=20, MINUS=21, PLUS=22, INT_LIT=23;
	public static final int
		RULE_singleType = 0, RULE_array = 1, RULE_type = 2, RULE_fieldDecl = 3, 
		RULE_fieldAlloc = 4, RULE_argument = 5, RULE_methodDecl = 6, RULE_objDecl = 7, 
		RULE_objAlloc = 8, RULE_varObjDec = 9, RULE_fieldDeref = 10, RULE_varAss = 11, 
		RULE_loop = 12, RULE_methodCallStmt = 13, RULE_returnStmt = 14, RULE_statement = 15, 
		RULE_expression = 16, RULE_file = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleType", "array", "type", "fieldDecl", "fieldAlloc", "argument", 
			"methodDecl", "objDecl", "objAlloc", "varObjDec", "fieldDeref", "varAss", 
			"loop", "methodCallStmt", "returnStmt", "statement", "expression", "file"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'obj'", "'int'", "'string'", "'new'", "'loop'", "'return'", 
			"'='", null, null, "';'", "':'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"','", "'.'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "OBJ", "INT", "STR", "NEW", "LOOP", "RETURN", "EQ", "STRING", 
			"IDENTIFIER", "SEMIC", "COLON", "LCPAREN", "RCPAREN", "LPAREN", "RPAREN", 
			"LSPAREN", "RSPAREN", "COMMA", "DOT", "MINUS", "PLUS", "INT_LIT"
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
	public String getGrammarFileName() { return "Echetlon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EchetlonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EchetlonParser.INT, 0); }
		public TerminalNode STR() { return getToken(EchetlonParser.STR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public SingleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterSingleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitSingleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitSingleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeContext singleType() throws RecognitionException {
		SingleTypeContext _localctx = new SingleTypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ArrayContext extends ParserRuleContext {
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public TerminalNode LSPAREN() { return getToken(EchetlonParser.LSPAREN, 0); }
		public TerminalNode RSPAREN() { return getToken(EchetlonParser.RSPAREN, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			singleType();
			setState(39);
			match(LSPAREN);
			setState(40);
			match(RSPAREN);
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

	public static class TypeContext extends ParserRuleContext {
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				singleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				array();
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

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public TerminalNode SEMIC() { return getToken(EchetlonParser.SEMIC, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			type();
			setState(47);
			match(IDENTIFIER);
			setState(48);
			match(SEMIC);
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

	public static class FieldAllocContext extends ParserRuleContext {
		public Token name;
		public TerminalNode EQ() { return getToken(EchetlonParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public FieldAllocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAlloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterFieldAlloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitFieldAlloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitFieldAlloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAllocContext fieldAlloc() throws RecognitionException {
		FieldAllocContext _localctx = new FieldAllocContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldAlloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((FieldAllocContext)_localctx).name = match(IDENTIFIER);
			setState(51);
			match(EQ);
			setState(52);
			expression(0);
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

	public static class ArgumentContext extends ParserRuleContext {
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			type();
			setState(55);
			((ArgumentContext)_localctx).name = match(IDENTIFIER);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EchetlonParser.COLON, 0); }
		public TerminalNode LCPAREN() { return getToken(EchetlonParser.LCPAREN, 0); }
		public TerminalNode RCPAREN() { return getToken(EchetlonParser.RCPAREN, 0); }
		public TerminalNode SEMIC() { return getToken(EchetlonParser.SEMIC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EchetlonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EchetlonParser.COMMA, i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			type();
			setState(58);
			((MethodDeclContext)_localctx).name = match(IDENTIFIER);
			setState(59);
			match(COLON);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(60);
				argument();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(61);
					match(COMMA);
					setState(62);
					argument();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(LCPAREN);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJ) | (1L << INT) | (1L << STR) | (1L << LOOP) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << DOT))) != 0) );
			setState(76);
			match(RCPAREN);
			setState(77);
			match(SEMIC);
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

	public static class ObjDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode OBJ() { return getToken(EchetlonParser.OBJ, 0); }
		public TerminalNode LCPAREN() { return getToken(EchetlonParser.LCPAREN, 0); }
		public TerminalNode RCPAREN() { return getToken(EchetlonParser.RCPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ObjDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterObjDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitObjDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitObjDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjDeclContext objDecl() throws RecognitionException {
		ObjDeclContext _localctx = new ObjDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(OBJ);
			setState(80);
			((ObjDeclContext)_localctx).name = match(IDENTIFIER);
			setState(81);
			match(LCPAREN);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					fieldDecl();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(88);
				methodDecl();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(RCPAREN);
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

	public static class ObjAllocContext extends ParserRuleContext {
		public Token alloc;
		public TerminalNode NEW() { return getToken(EchetlonParser.NEW, 0); }
		public TerminalNode LPAREN() { return getToken(EchetlonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EchetlonParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public List<FieldAllocContext> fieldAlloc() {
			return getRuleContexts(FieldAllocContext.class);
		}
		public FieldAllocContext fieldAlloc(int i) {
			return getRuleContext(FieldAllocContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EchetlonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EchetlonParser.COMMA, i);
		}
		public ObjAllocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objAlloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterObjAlloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitObjAlloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitObjAlloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjAllocContext objAlloc() throws RecognitionException {
		ObjAllocContext _localctx = new ObjAllocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objAlloc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(NEW);
			setState(97);
			((ObjAllocContext)_localctx).alloc = match(IDENTIFIER);
			setState(98);
			match(LPAREN);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(99);
				fieldAlloc();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					fieldAlloc();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(109);
			match(RPAREN);
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

	public static class VarObjDecContext extends ParserRuleContext {
		public Token var;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(EchetlonParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public VarObjDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varObjDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterVarObjDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitVarObjDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitVarObjDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarObjDecContext varObjDec() throws RecognitionException {
		VarObjDecContext _localctx = new VarObjDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varObjDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type();
			setState(112);
			((VarObjDecContext)_localctx).var = match(IDENTIFIER);
			setState(113);
			match(EQ);
			setState(114);
			expression(0);
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

	public static class FieldDerefContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DOT() { return getToken(EchetlonParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public FieldDerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterFieldDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitFieldDeref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitFieldDeref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDerefContext fieldDeref() throws RecognitionException {
		FieldDerefContext _localctx = new FieldDerefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldDeref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(DOT);
			setState(117);
			((FieldDerefContext)_localctx).name = match(IDENTIFIER);
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

	public static class VarAssContext extends ParserRuleContext {
		public Token var;
		public TerminalNode EQ() { return getToken(EchetlonParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public FieldDerefContext fieldDeref() {
			return getRuleContext(FieldDerefContext.class,0);
		}
		public VarAssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterVarAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitVarAss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitVarAss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssContext varAss() throws RecognitionException {
		VarAssContext _localctx = new VarAssContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varAss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((VarAssContext)_localctx).var = match(IDENTIFIER);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(120);
				fieldDeref();
				}
			}

			setState(123);
			match(EQ);
			setState(124);
			expression(0);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(EchetlonParser.LOOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCPAREN() { return getToken(EchetlonParser.LCPAREN, 0); }
		public TerminalNode RCPAREN() { return getToken(EchetlonParser.RCPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LOOP);
			setState(127);
			expression(0);
			setState(128);
			match(LCPAREN);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				statement();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJ) | (1L << INT) | (1L << STR) | (1L << LOOP) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << DOT))) != 0) );
			setState(134);
			match(RCPAREN);
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

	public static class MethodCallStmtContext extends ParserRuleContext {
		public Token objName;
		public Token name;
		public TerminalNode DOT() { return getToken(EchetlonParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(EchetlonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EchetlonParser.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EchetlonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EchetlonParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EchetlonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EchetlonParser.COMMA, i);
		}
		public MethodCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterMethodCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitMethodCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitMethodCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStmtContext methodCallStmt() throws RecognitionException {
		MethodCallStmtContext _localctx = new MethodCallStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodCallStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(136);
				((MethodCallStmtContext)_localctx).objName = match(IDENTIFIER);
				}
			}

			setState(139);
			match(DOT);
			setState(140);
			((MethodCallStmtContext)_localctx).name = match(IDENTIFIER);
			setState(141);
			match(LPAREN);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << STRING) | (1L << IDENTIFIER) | (1L << LCPAREN) | (1L << LPAREN) | (1L << DOT) | (1L << INT_LIT))) != 0)) {
				{
				setState(142);
				expression(0);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(143);
					match(COMMA);
					setState(144);
					expression(0);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(152);
			match(RPAREN);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(EchetlonParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(RETURN);
			setState(155);
			expression(0);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMIC() { return getToken(EchetlonParser.SEMIC, 0); }
		public ObjDeclContext objDecl() {
			return getRuleContext(ObjDeclContext.class,0);
		}
		public MethodCallStmtContext methodCallStmt() {
			return getRuleContext(MethodCallStmtContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public VarObjDecContext varObjDec() {
			return getRuleContext(VarObjDecContext.class,0);
		}
		public VarAssContext varAss() {
			return getRuleContext(VarAssContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(157);
				objDecl();
				}
				break;
			case 2:
				{
				setState(158);
				methodCallStmt();
				}
				break;
			case 3:
				{
				setState(159);
				loop();
				}
				break;
			case 4:
				{
				setState(160);
				returnStmt();
				}
				break;
			case 5:
				{
				setState(161);
				varObjDec();
				}
				break;
			case 6:
				{
				setState(162);
				varAss();
				}
				break;
			}
			setState(165);
			match(SEMIC);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrLiteralContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(EchetlonParser.STRING, 0); }
		public StrLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterStrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitStrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitStrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public ExpressionContext l;
		public ExpressionContext r;
		public TerminalNode PLUS() { return getToken(EchetlonParser.PLUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExpressionContext {
		public ExpressionContext l;
		public ExpressionContext r;
		public TerminalNode MINUS() { return getToken(EchetlonParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarFieldRefContext extends ExpressionContext {
		public Token name;
		public Token field;
		public TerminalNode DOT() { return getToken(EchetlonParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EchetlonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EchetlonParser.IDENTIFIER, i);
		}
		public VarFieldRefContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterVarFieldRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitVarFieldRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitVarFieldRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLiteralContext extends ExpressionContext {
		public TerminalNode LCPAREN() { return getToken(EchetlonParser.LCPAREN, 0); }
		public TerminalNode RCPAREN() { return getToken(EchetlonParser.RCPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EchetlonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EchetlonParser.COMMA, i);
		}
		public ArrayLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends ExpressionContext {
		public TerminalNode INT_LIT() { return getToken(EchetlonParser.INT_LIT, 0); }
		public IntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(EchetlonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EchetlonParser.RPAREN, 0); }
		public ParenExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjValContext extends ExpressionContext {
		public ObjAllocContext objAlloc() {
			return getRuleContext(ObjAllocContext.class,0);
		}
		public ObjValContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterObjVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitObjVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitObjVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayRefContext extends ExpressionContext {
		public ExpressionContext arr;
		public ExpressionContext index;
		public TerminalNode LSPAREN() { return getToken(EchetlonParser.LSPAREN, 0); }
		public TerminalNode RSPAREN() { return getToken(EchetlonParser.RSPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayRefContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterArrayRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitArrayRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitArrayRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarRefContext extends ExpressionContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(EchetlonParser.IDENTIFIER, 0); }
		public VarRefContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends ExpressionContext {
		public Token objName;
		public Token name;
		public TerminalNode DOT() { return getToken(EchetlonParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(EchetlonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EchetlonParser.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EchetlonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EchetlonParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EchetlonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EchetlonParser.COMMA, i);
		}
		public MethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				match(INT_LIT);
				}
				break;
			case 2:
				{
				_localctx = new StrLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(LPAREN);
				setState(171);
				expression(0);
				setState(172);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new MethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(174);
					((MethodCallContext)_localctx).objName = match(IDENTIFIER);
					}
				}

				setState(177);
				match(DOT);
				setState(178);
				((MethodCallContext)_localctx).name = match(IDENTIFIER);
				setState(179);
				match(LPAREN);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << STRING) | (1L << IDENTIFIER) | (1L << LCPAREN) | (1L << LPAREN) | (1L << DOT) | (1L << INT_LIT))) != 0)) {
					{
					setState(180);
					expression(0);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(181);
						match(COMMA);
						setState(182);
						expression(0);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(190);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ArrayLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(LCPAREN);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << STRING) | (1L << IDENTIFIER) | (1L << LCPAREN) | (1L << LPAREN) | (1L << DOT) | (1L << INT_LIT))) != 0)) {
					{
					setState(192);
					expression(0);
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(193);
						match(COMMA);
						setState(194);
						expression(0);
						}
						}
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(202);
				match(RCPAREN);
				}
				break;
			case 6:
				{
				_localctx = new ObjValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				objAlloc();
				}
				break;
			case 7:
				{
				_localctx = new VarFieldRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				((VarFieldRefContext)_localctx).name = match(IDENTIFIER);
				setState(205);
				match(DOT);
				setState(206);
				((VarFieldRefContext)_localctx).field = match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new VarRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				((VarRefContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						((AddContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(211);
						match(PLUS);
						setState(212);
						((AddContext)_localctx).r = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExpressionContext(_parentctx, _parentState));
						((SubContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(214);
						match(MINUS);
						setState(215);
						((SubContext)_localctx).r = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ArrayRefContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayRefContext)_localctx).arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(217);
						match(LSPAREN);
						setState(218);
						((ArrayRefContext)_localctx).index = expression(0);
						setState(219);
						match(RSPAREN);
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class FileContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EchetlonListener ) ((EchetlonListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EchetlonVisitor ) return ((EchetlonVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				statement();
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJ) | (1L << INT) | (1L << STR) | (1L << LOOP) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << DOT))) != 0) );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00ea\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bB\n\b\f\b\16\bE"+
		"\13\b\5\bG\n\b\3\b\3\b\6\bK\n\b\r\b\16\bL\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\7\tV\n\t\f\t\16\tY\13\t\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\5\nn\n\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\5\r|\n\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\6\16\u0085\n\16\r\16\16\16\u0086\3\16\3\16\3\17\5\17\u008c\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0094\n\17\f\17\16\17\u0097\13\17"+
		"\5\17\u0099\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00a6\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00b2\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ba\n\22\f\22\16\22\u00bd"+
		"\13\22\5\22\u00bf\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c6\n\22\f\22\16"+
		"\22\u00c9\13\22\5\22\u00cb\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d3"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e0"+
		"\n\22\f\22\16\22\u00e3\13\22\3\23\6\23\u00e6\n\23\r\23\16\23\u00e7\3\23"+
		"\2\3\"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\4\2\5\6\f\f\2"+
		"\u00f9\2&\3\2\2\2\4(\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n\64\3\2\2\2\f8\3"+
		"\2\2\2\16;\3\2\2\2\20Q\3\2\2\2\22b\3\2\2\2\24q\3\2\2\2\26v\3\2\2\2\30"+
		"y\3\2\2\2\32\u0080\3\2\2\2\34\u008b\3\2\2\2\36\u009c\3\2\2\2 \u00a5\3"+
		"\2\2\2\"\u00d2\3\2\2\2$\u00e5\3\2\2\2&\'\t\2\2\2\'\3\3\2\2\2()\5\2\2\2"+
		")*\7\23\2\2*+\7\24\2\2+\5\3\2\2\2,/\5\2\2\2-/\5\4\3\2.,\3\2\2\2.-\3\2"+
		"\2\2/\7\3\2\2\2\60\61\5\6\4\2\61\62\7\f\2\2\62\63\7\r\2\2\63\t\3\2\2\2"+
		"\64\65\7\f\2\2\65\66\7\n\2\2\66\67\5\"\22\2\67\13\3\2\2\289\5\6\4\29:"+
		"\7\f\2\2:\r\3\2\2\2;<\5\6\4\2<=\7\f\2\2=F\7\16\2\2>C\5\f\7\2?@\7\25\2"+
		"\2@B\5\f\7\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2"+
		"\2F>\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\7\17\2\2IK\5 \21\2JI\3\2\2\2KL\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\20\2\2OP\7\r\2\2P\17\3\2\2\2QR"+
		"\7\4\2\2RS\7\f\2\2SW\7\17\2\2TV\5\b\5\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2"+
		"WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\5\16\b\2[Z\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\20\2\2a\21\3\2\2\2bc\7\7\2\2cd"+
		"\7\f\2\2dm\7\21\2\2ej\5\n\6\2fg\7\25\2\2gi\5\n\6\2hf\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2me\3\2\2\2mn\3\2\2\2no\3\2\2\2"+
		"op\7\22\2\2p\23\3\2\2\2qr\5\6\4\2rs\7\f\2\2st\7\n\2\2tu\5\"\22\2u\25\3"+
		"\2\2\2vw\7\26\2\2wx\7\f\2\2x\27\3\2\2\2y{\7\f\2\2z|\5\26\f\2{z\3\2\2\2"+
		"{|\3\2\2\2|}\3\2\2\2}~\7\n\2\2~\177\5\"\22\2\177\31\3\2\2\2\u0080\u0081"+
		"\7\b\2\2\u0081\u0082\5\"\22\2\u0082\u0084\7\17\2\2\u0083\u0085\5 \21\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\20\2\2\u0089\33\3\2\2\2\u008a"+
		"\u008c\7\f\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\7\26\2\2\u008e\u008f\7\f\2\2\u008f\u0098\7\21\2\2\u0090"+
		"\u0095\5\"\22\2\u0091\u0092\7\25\2\2\u0092\u0094\5\"\22\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\22\2\2\u009b\35\3\2\2\2\u009c\u009d"+
		"\7\t\2\2\u009d\u009e\5\"\22\2\u009e\37\3\2\2\2\u009f\u00a6\5\20\t\2\u00a0"+
		"\u00a6\5\34\17\2\u00a1\u00a6\5\32\16\2\u00a2\u00a6\5\36\20\2\u00a3\u00a6"+
		"\5\24\13\2\u00a4\u00a6\5\30\r\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2"+
		"\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\r\2\2\u00a8!\3\2\2\2\u00a9"+
		"\u00aa\b\22\1\2\u00aa\u00d3\7\31\2\2\u00ab\u00d3\7\13\2\2\u00ac\u00ad"+
		"\7\21\2\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\7\22\2\2\u00af\u00d3\3\2\2"+
		"\2\u00b0\u00b2\7\f\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00be\7\21\2\2"+
		"\u00b6\u00bb\5\"\22\2\u00b7\u00b8\7\25\2\2\u00b8\u00ba\5\"\22\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00d3\7\22\2\2\u00c1\u00ca\7"+
		"\17\2\2\u00c2\u00c7\5\"\22\2\u00c3\u00c4\7\25\2\2\u00c4\u00c6\5\"\22\2"+
		"\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d3\7\20\2\2\u00cd\u00d3\5"+
		"\22\n\2\u00ce\u00cf\7\f\2\2\u00cf\u00d0\7\26\2\2\u00d0\u00d3\7\f\2\2\u00d1"+
		"\u00d3\7\f\2\2\u00d2\u00a9\3\2\2\2\u00d2\u00ab\3\2\2\2\u00d2\u00ac\3\2"+
		"\2\2\u00d2\u00b1\3\2\2\2\u00d2\u00c1\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00e1\3\2\2\2\u00d4\u00d5\f\7"+
		"\2\2\u00d5\u00d6\7\30\2\2\u00d6\u00e0\5\"\22\b\u00d7\u00d8\f\6\2\2\u00d8"+
		"\u00d9\7\27\2\2\u00d9\u00e0\5\"\22\7\u00da\u00db\f\t\2\2\u00db\u00dc\7"+
		"\23\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\24\2\2\u00de\u00e0\3\2\2\2"+
		"\u00df\u00d4\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00da\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2#\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e6\5 \21\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8%\3\2\2\2\31.CFLW]j"+
		"m{\u0086\u008b\u0095\u0098\u00a5\u00b1\u00bb\u00be\u00c7\u00ca\u00d2\u00df"+
		"\u00e1\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}