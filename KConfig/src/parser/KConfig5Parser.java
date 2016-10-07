package parser;
// Generated from KConfig5.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KConfig5Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		CONFIG=10, MENUCONFIG=11, CHOICE=12, ENDCHOICE=13, COMMENT=14, MENU=15, 
		ENDMENU=16, MAINMENU=17, SOURCE=18, DEPENDS=19, ON=20, PROMPT=21, OPTION=22, 
		SELECT=23, DEFAULT=24, RANGE=25, OPTIONAL=26, IF=27, ENDIF=28, ENV=29, 
		DEFCONFIG_LIST=30, TRISTATE=31, BOOL=32, BOOLEAN=33, INT=34, STRING=35, 
		HEX=36, ALLNOCONFIG_Y=37, MODULES=38, VISIBLE=39, Reserved_words=40, SYMBOL=41, 
		WORD_QUOTE=42, SLASH=43, DASH=44, DASHES=45, NEWLINE=46, WS=47;
	public static final int
		RULE_inicial = 0, RULE_config_stmts = 1, RULE_config_menu_entry = 2, RULE_config_options = 3, 
		RULE_config_option = 4, RULE_misc_option = 5, RULE_menuconfig_menu_entry = 6, 
		RULE_menuconfig_options = 7, RULE_choice_menu_entry = 8, RULE_choice_options = 9, 
		RULE_choice_option = 10, RULE_choice_block = 11, RULE_comment_menu_entry = 12, 
		RULE_comment_options = 13, RULE_comment_option = 14, RULE_menu_menu_entry = 15, 
		RULE_menu_options = 16, RULE_menu_option = 17, RULE_menu_block = 18, RULE_if_menu_entry = 19, 
		RULE_ifmenu_expr = 20, RULE_if_expr = 21, RULE_expr = 22, RULE_or_expr = 23, 
		RULE_and_expr = 24, RULE_unary_expr = 25, RULE_equals_expr = 26, RULE_type = 27, 
		RULE_type_choice = 28, RULE_visible = 29, RULE_primary = 30, RULE_words = 31;
	public static final String[] ruleNames = {
		"inicial", "config_stmts", "config_menu_entry", "config_options", "config_option", 
		"misc_option", "menuconfig_menu_entry", "menuconfig_options", "choice_menu_entry", 
		"choice_options", "choice_option", "choice_block", "comment_menu_entry", 
		"comment_options", "comment_option", "menu_menu_entry", "menu_options", 
		"menu_option", "menu_block", "if_menu_entry", "ifmenu_expr", "if_expr", 
		"expr", "or_expr", "and_expr", "unary_expr", "equals_expr", "type", "type_choice", 
		"visible", "primary", "words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'TODO'", "'!'", "'||'", "'&&'", "'!='", "'('", "')'", 
		"'config'", "'menuconfig'", "'choice'", "'endchoice'", "'comment'", "'menu'", 
		"'endmenu'", "'mainmenu'", "'source'", "'depends'", "'on'", "'prompt'", 
		"'option'", "'select'", null, "'range'", "'optional'", "'if'", "'endif'", 
		"'env'", "'defconfig_list'", "'tristate'", "'bool'", "'boolean'", "'int'", 
		"'string'", "'hex'", "'allnoconfig_y'", "'modules'", "'visible'", null, 
		null, null, "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "CONFIG", 
		"MENUCONFIG", "CHOICE", "ENDCHOICE", "COMMENT", "MENU", "ENDMENU", "MAINMENU", 
		"SOURCE", "DEPENDS", "ON", "PROMPT", "OPTION", "SELECT", "DEFAULT", "RANGE", 
		"OPTIONAL", "IF", "ENDIF", "ENV", "DEFCONFIG_LIST", "TRISTATE", "BOOL", 
		"BOOLEAN", "INT", "STRING", "HEX", "ALLNOCONFIG_Y", "MODULES", "VISIBLE", 
		"Reserved_words", "SYMBOL", "WORD_QUOTE", "SLASH", "DASH", "DASHES", "NEWLINE", 
		"WS"
	};
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
	public String getGrammarFileName() { return "KConfig5.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KConfig5Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicialContext extends ParserRuleContext {
		public List<Config_stmtsContext> config_stmts() {
			return getRuleContexts(Config_stmtsContext.class);
		}
		public Config_stmtsContext config_stmts(int i) {
			return getRuleContext(Config_stmtsContext.class,i);
		}
		public List<Menuconfig_menu_entryContext> menuconfig_menu_entry() {
			return getRuleContexts(Menuconfig_menu_entryContext.class);
		}
		public Menuconfig_menu_entryContext menuconfig_menu_entry(int i) {
			return getRuleContext(Menuconfig_menu_entryContext.class,i);
		}
		public List<Choice_menu_entryContext> choice_menu_entry() {
			return getRuleContexts(Choice_menu_entryContext.class);
		}
		public Choice_menu_entryContext choice_menu_entry(int i) {
			return getRuleContext(Choice_menu_entryContext.class,i);
		}
		public List<Comment_menu_entryContext> comment_menu_entry() {
			return getRuleContexts(Comment_menu_entryContext.class);
		}
		public Comment_menu_entryContext comment_menu_entry(int i) {
			return getRuleContext(Comment_menu_entryContext.class,i);
		}
		public List<Menu_menu_entryContext> menu_menu_entry() {
			return getRuleContexts(Menu_menu_entryContext.class);
		}
		public Menu_menu_entryContext menu_menu_entry(int i) {
			return getRuleContext(Menu_menu_entryContext.class,i);
		}
		public List<If_menu_entryContext> if_menu_entry() {
			return getRuleContexts(If_menu_entryContext.class);
		}
		public If_menu_entryContext if_menu_entry(int i) {
			return getRuleContext(If_menu_entryContext.class,i);
		}
		public InicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitInicial(this);
		}
	}

	public final InicialContext inicial() throws RecognitionException {
		InicialContext _localctx = new InicialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicial);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(70);
					switch (_input.LA(1)) {
					case CONFIG:
						{
						setState(64);
						config_stmts();
						}
						break;
					case MENUCONFIG:
						{
						setState(65);
						menuconfig_menu_entry();
						}
						break;
					case CHOICE:
						{
						setState(66);
						choice_menu_entry();
						}
						break;
					case COMMENT:
						{
						setState(67);
						comment_menu_entry();
						}
						break;
					case MENU:
						{
						setState(68);
						menu_menu_entry();
						}
						break;
					case IF:
						{
						setState(69);
						if_menu_entry();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Config_stmtsContext extends ParserRuleContext {
		public List<Config_menu_entryContext> config_menu_entry() {
			return getRuleContexts(Config_menu_entryContext.class);
		}
		public Config_menu_entryContext config_menu_entry(int i) {
			return getRuleContext(Config_menu_entryContext.class,i);
		}
		public Config_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_stmts(this);
		}
	}

	public final Config_stmtsContext config_stmts() throws RecognitionException {
		Config_stmtsContext _localctx = new Config_stmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_config_stmts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74);
					config_menu_entry();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Config_menu_entryContext extends ParserRuleContext {
		public TerminalNode CONFIG() { return getToken(KConfig5Parser.CONFIG, 0); }
		public TerminalNode SYMBOL() { return getToken(KConfig5Parser.SYMBOL, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(KConfig5Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KConfig5Parser.NEWLINE, i);
		}
		public List<Config_optionsContext> config_options() {
			return getRuleContexts(Config_optionsContext.class);
		}
		public Config_optionsContext config_options(int i) {
			return getRuleContext(Config_optionsContext.class,i);
		}
		public Config_menu_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_menu_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_menu_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_menu_entry(this);
		}
	}

	public final Config_menu_entryContext config_menu_entry() throws RecognitionException {
		Config_menu_entryContext _localctx = new Config_menu_entryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_config_menu_entry);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(CONFIG);
			setState(80);
			match(SYMBOL);
			setState(81);
			match(NEWLINE);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				config_options();
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(83);
						match(NEWLINE);
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEPENDS) | (1L << PROMPT) | (1L << OPTION) | (1L << SELECT) | (1L << DEFAULT) | (1L << RANGE) | (1L << OPTIONAL) | (1L << TRISTATE) | (1L << BOOL) | (1L << BOOLEAN) | (1L << INT) | (1L << STRING) | (1L << HEX))) != 0) );
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

	public static class Config_optionsContext extends ParserRuleContext {
		public Config_optionContext config_option() {
			return getRuleContext(Config_optionContext.class,0);
		}
		public Config_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_options(this);
		}
	}

	public final Config_optionsContext config_options() throws RecognitionException {
		Config_optionsContext _localctx = new Config_optionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_config_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			config_option();
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

	public static class Config_optionContext extends ParserRuleContext {
		public Config_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_option; }
	 
		public Config_optionContext() { }
		public void copyFrom(Config_optionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Config_op_dependsContext extends Config_optionContext {
		public TerminalNode DEPENDS() { return getToken(KConfig5Parser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(KConfig5Parser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Config_op_dependsContext(Config_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_op_depends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_op_depends(this);
		}
	}
	public static class Config_op_selectContext extends Config_optionContext {
		public TerminalNode SELECT() { return getToken(KConfig5Parser.SELECT, 0); }
		public TerminalNode SYMBOL() { return getToken(KConfig5Parser.SYMBOL, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Config_op_selectContext(Config_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_op_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_op_select(this);
		}
	}
	public static class Config_op_optionalContext extends Config_optionContext {
		public TerminalNode OPTIONAL() { return getToken(KConfig5Parser.OPTIONAL, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Config_op_optionalContext(Config_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_op_optional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_op_optional(this);
		}
	}
	public static class Config_op_promptContext extends Config_optionContext {
		public TerminalNode PROMPT() { return getToken(KConfig5Parser.PROMPT, 0); }
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Config_op_promptContext(Config_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_op_prompt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_op_prompt(this);
		}
	}
	public static class Config_op_defaultContext extends Config_optionContext {
		public TerminalNode DEFAULT() { return getToken(KConfig5Parser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Config_op_defaultContext(Config_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_op_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_op_default(this);
		}
	}
	public static class Config_op_rangeContext extends Config_optionContext {
		public TerminalNode RANGE() { return getToken(KConfig5Parser.RANGE, 0); }
		public List<TerminalNode> SYMBOL() { return getTokens(KConfig5Parser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(KConfig5Parser.SYMBOL, i);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Config_op_rangeContext(Config_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_op_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_op_range(this);
		}
	}
	public static class Config_op_typeContext extends Config_optionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Config_op_typeContext(Config_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_op_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_op_type(this);
		}
	}
	public static class Config_op_optionContext extends Config_optionContext {
		public TerminalNode OPTION() { return getToken(KConfig5Parser.OPTION, 0); }
		public Misc_optionContext misc_option() {
			return getRuleContext(Misc_optionContext.class,0);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Config_op_optionContext(Config_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterConfig_op_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitConfig_op_option(this);
		}
	}

	public final Config_optionContext config_option() throws RecognitionException {
		Config_optionContext _localctx = new Config_optionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_config_option);
		int _la;
		try {
			setState(138);
			switch (_input.LA(1)) {
			case TRISTATE:
			case BOOL:
			case BOOLEAN:
			case INT:
			case STRING:
			case HEX:
				_localctx = new Config_op_typeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				type();
				setState(97);
				_la = _input.LA(1);
				if (_la==WORD_QUOTE) {
					{
					setState(96);
					match(WORD_QUOTE);
					}
				}

				setState(100);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(99);
					if_expr();
					}
					break;
				}
				setState(103);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(102);
					match(T__0);
					}
				}

				}
				break;
			case DEPENDS:
				_localctx = new Config_op_dependsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(DEPENDS);
				setState(106);
				match(ON);
				setState(107);
				expr();
				}
				break;
			case PROMPT:
				_localctx = new Config_op_promptContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(PROMPT);
				setState(109);
				match(WORD_QUOTE);
				setState(111);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(110);
					if_expr();
					}
					break;
				}
				}
				break;
			case SELECT:
				_localctx = new Config_op_selectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(SELECT);
				setState(114);
				match(SYMBOL);
				setState(116);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(115);
					if_expr();
					}
					break;
				}
				}
				break;
			case DEFAULT:
				_localctx = new Config_op_defaultContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(DEFAULT);
				setState(119);
				expr();
				setState(121);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(120);
					if_expr();
					}
					break;
				}
				}
				break;
			case RANGE:
				_localctx = new Config_op_rangeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(RANGE);
				setState(124);
				match(SYMBOL);
				setState(125);
				match(SYMBOL);
				setState(127);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(126);
					if_expr();
					}
					break;
				}
				}
				break;
			case OPTION:
				_localctx = new Config_op_optionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				match(OPTION);
				setState(130);
				misc_option();
				setState(132);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(131);
					if_expr();
					}
					break;
				}
				}
				break;
			case OPTIONAL:
				_localctx = new Config_op_optionalContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				match(OPTIONAL);
				setState(136);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(135);
					if_expr();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Misc_optionContext extends ParserRuleContext {
		public TerminalNode ENV() { return getToken(KConfig5Parser.ENV, 0); }
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public TerminalNode DEFCONFIG_LIST() { return getToken(KConfig5Parser.DEFCONFIG_LIST, 0); }
		public TerminalNode ALLNOCONFIG_Y() { return getToken(KConfig5Parser.ALLNOCONFIG_Y, 0); }
		public TerminalNode MODULES() { return getToken(KConfig5Parser.MODULES, 0); }
		public Misc_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMisc_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMisc_option(this);
		}
	}

	public final Misc_optionContext misc_option() throws RecognitionException {
		Misc_optionContext _localctx = new Misc_optionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_misc_option);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case ENV:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(ENV);
				setState(141);
				match(T__1);
				setState(142);
				match(WORD_QUOTE);
				}
				break;
			case DEFCONFIG_LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(DEFCONFIG_LIST);
				}
				break;
			case ALLNOCONFIG_Y:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(ALLNOCONFIG_Y);
				}
				break;
			case MODULES:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(MODULES);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Menuconfig_menu_entryContext extends ParserRuleContext {
		public TerminalNode MENUCONFIG() { return getToken(KConfig5Parser.MENUCONFIG, 0); }
		public TerminalNode SYMBOL() { return getToken(KConfig5Parser.SYMBOL, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(KConfig5Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KConfig5Parser.NEWLINE, i);
		}
		public List<Menuconfig_optionsContext> menuconfig_options() {
			return getRuleContexts(Menuconfig_optionsContext.class);
		}
		public Menuconfig_optionsContext menuconfig_options(int i) {
			return getRuleContext(Menuconfig_optionsContext.class,i);
		}
		public If_menu_entryContext if_menu_entry() {
			return getRuleContext(If_menu_entryContext.class,0);
		}
		public Menuconfig_menu_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuconfig_menu_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenuconfig_menu_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenuconfig_menu_entry(this);
		}
	}

	public final Menuconfig_menu_entryContext menuconfig_menu_entry() throws RecognitionException {
		Menuconfig_menu_entryContext _localctx = new Menuconfig_menu_entryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_menuconfig_menu_entry);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(MENUCONFIG);
			setState(149);
			match(SYMBOL);
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(150);
					match(NEWLINE);
					setState(151);
					menuconfig_options();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(156);
				match(NEWLINE);
				}
				break;
			}
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(159);
				if_menu_entry();
				}
				break;
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

	public static class Menuconfig_optionsContext extends ParserRuleContext {
		public Menuconfig_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuconfig_options; }
	 
		public Menuconfig_optionsContext() { }
		public void copyFrom(Menuconfig_optionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Menuconfig_op_typeContext extends Menuconfig_optionsContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Menuconfig_op_typeContext(Menuconfig_optionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenuconfig_op_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenuconfig_op_type(this);
		}
	}
	public static class Menuconfig_op_dependsContext extends Menuconfig_optionsContext {
		public TerminalNode DEPENDS() { return getToken(KConfig5Parser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(KConfig5Parser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Menuconfig_op_dependsContext(Menuconfig_optionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenuconfig_op_depends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenuconfig_op_depends(this);
		}
	}
	public static class Menuconfig_op_defaultContext extends Menuconfig_optionsContext {
		public TerminalNode DEFAULT() { return getToken(KConfig5Parser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Menuconfig_op_defaultContext(Menuconfig_optionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenuconfig_op_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenuconfig_op_default(this);
		}
	}
	public static class Menuconfig_op_selectContext extends Menuconfig_optionsContext {
		public TerminalNode SELECT() { return getToken(KConfig5Parser.SELECT, 0); }
		public TerminalNode SYMBOL() { return getToken(KConfig5Parser.SYMBOL, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Menuconfig_op_selectContext(Menuconfig_optionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenuconfig_op_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenuconfig_op_select(this);
		}
	}
	public static class Menuconfig_op_promptContext extends Menuconfig_optionsContext {
		public TerminalNode PROMPT() { return getToken(KConfig5Parser.PROMPT, 0); }
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Menuconfig_op_promptContext(Menuconfig_optionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenuconfig_op_prompt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenuconfig_op_prompt(this);
		}
	}
	public static class Menuconfig_op_modulesContext extends Menuconfig_optionsContext {
		public TerminalNode OPTION() { return getToken(KConfig5Parser.OPTION, 0); }
		public TerminalNode MODULES() { return getToken(KConfig5Parser.MODULES, 0); }
		public Menuconfig_op_modulesContext(Menuconfig_optionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenuconfig_op_modules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenuconfig_op_modules(this);
		}
	}

	public final Menuconfig_optionsContext menuconfig_options() throws RecognitionException {
		Menuconfig_optionsContext _localctx = new Menuconfig_optionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_menuconfig_options);
		int _la;
		try {
			setState(192);
			switch (_input.LA(1)) {
			case TRISTATE:
			case BOOL:
			case BOOLEAN:
			case INT:
			case STRING:
			case HEX:
				_localctx = new Menuconfig_op_typeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				type();
				setState(164);
				_la = _input.LA(1);
				if (_la==WORD_QUOTE) {
					{
					setState(163);
					match(WORD_QUOTE);
					}
				}

				setState(167);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(166);
					if_expr();
					}
					break;
				}
				setState(170);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(169);
					match(T__0);
					}
				}

				}
				break;
			case DEPENDS:
				_localctx = new Menuconfig_op_dependsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(DEPENDS);
				setState(173);
				match(ON);
				setState(174);
				expr();
				}
				break;
			case SELECT:
				_localctx = new Menuconfig_op_selectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(SELECT);
				setState(176);
				match(SYMBOL);
				setState(178);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(177);
					if_expr();
					}
					break;
				}
				}
				break;
			case DEFAULT:
				_localctx = new Menuconfig_op_defaultContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(DEFAULT);
				setState(181);
				expr();
				setState(183);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(182);
					if_expr();
					}
					break;
				}
				}
				break;
			case PROMPT:
				_localctx = new Menuconfig_op_promptContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(PROMPT);
				setState(186);
				match(WORD_QUOTE);
				setState(188);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(187);
					if_expr();
					}
					break;
				}
				}
				break;
			case OPTION:
				_localctx = new Menuconfig_op_modulesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(OPTION);
				setState(191);
				match(MODULES);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Choice_menu_entryContext extends ParserRuleContext {
		public TerminalNode CHOICE() { return getToken(KConfig5Parser.CHOICE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(KConfig5Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KConfig5Parser.NEWLINE, i);
		}
		public Choice_blockContext choice_block() {
			return getRuleContext(Choice_blockContext.class,0);
		}
		public TerminalNode ENDCHOICE() { return getToken(KConfig5Parser.ENDCHOICE, 0); }
		public TerminalNode SYMBOL() { return getToken(KConfig5Parser.SYMBOL, 0); }
		public List<Choice_optionsContext> choice_options() {
			return getRuleContexts(Choice_optionsContext.class);
		}
		public Choice_optionsContext choice_options(int i) {
			return getRuleContext(Choice_optionsContext.class,i);
		}
		public List<Choice_menu_entryContext> choice_menu_entry() {
			return getRuleContexts(Choice_menu_entryContext.class);
		}
		public Choice_menu_entryContext choice_menu_entry(int i) {
			return getRuleContext(Choice_menu_entryContext.class,i);
		}
		public Choice_menu_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_menu_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterChoice_menu_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitChoice_menu_entry(this);
		}
	}

	public final Choice_menu_entryContext choice_menu_entry() throws RecognitionException {
		Choice_menu_entryContext _localctx = new Choice_menu_entryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_choice_menu_entry);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(CHOICE);
			setState(196);
			_la = _input.LA(1);
			if (_la==SYMBOL) {
				{
				setState(195);
				match(SYMBOL);
				}
			}

			setState(198);
			match(NEWLINE);
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				choice_options();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEPENDS) | (1L << PROMPT) | (1L << DEFAULT) | (1L << OPTIONAL) | (1L << TRISTATE) | (1L << BOOL))) != 0) );
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(204);
					match(NEWLINE);
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(210);
			choice_block();
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(211);
					match(NEWLINE);
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(217);
					choice_menu_entry();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(223);
			match(ENDCHOICE);
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(224);
				match(NEWLINE);
				}
				break;
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

	public static class Choice_optionsContext extends ParserRuleContext {
		public Choice_optionContext choice_option() {
			return getRuleContext(Choice_optionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(KConfig5Parser.NEWLINE, 0); }
		public Choice_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterChoice_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitChoice_options(this);
		}
	}

	public final Choice_optionsContext choice_options() throws RecognitionException {
		Choice_optionsContext _localctx = new Choice_optionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_choice_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			choice_option();
			setState(228);
			match(NEWLINE);
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

	public static class Choice_optionContext extends ParserRuleContext {
		public Choice_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_option; }
	 
		public Choice_optionContext() { }
		public void copyFrom(Choice_optionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Choice_op_typeContext extends Choice_optionContext {
		public Type_choiceContext type_choice() {
			return getRuleContext(Type_choiceContext.class,0);
		}
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public Choice_op_typeContext(Choice_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterChoice_op_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitChoice_op_type(this);
		}
	}
	public static class Choice_op_optionalContext extends Choice_optionContext {
		public TerminalNode OPTIONAL() { return getToken(KConfig5Parser.OPTIONAL, 0); }
		public Choice_op_optionalContext(Choice_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterChoice_op_optional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitChoice_op_optional(this);
		}
	}
	public static class Choice_op_defaultContext extends Choice_optionContext {
		public TerminalNode DEFAULT() { return getToken(KConfig5Parser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Choice_op_defaultContext(Choice_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterChoice_op_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitChoice_op_default(this);
		}
	}
	public static class Choice_op_promptContext extends Choice_optionContext {
		public TerminalNode PROMPT() { return getToken(KConfig5Parser.PROMPT, 0); }
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Choice_op_promptContext(Choice_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterChoice_op_prompt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitChoice_op_prompt(this);
		}
	}
	public static class Choice_op_dependsContext extends Choice_optionContext {
		public TerminalNode DEPENDS() { return getToken(KConfig5Parser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(KConfig5Parser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Choice_op_dependsContext(Choice_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterChoice_op_depends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitChoice_op_depends(this);
		}
	}

	public final Choice_optionContext choice_option() throws RecognitionException {
		Choice_optionContext _localctx = new Choice_optionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_choice_option);
		int _la;
		try {
			setState(251);
			switch (_input.LA(1)) {
			case TRISTATE:
			case BOOL:
				_localctx = new Choice_op_typeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				type_choice();
				setState(232);
				_la = _input.LA(1);
				if (_la==WORD_QUOTE) {
					{
					setState(231);
					match(WORD_QUOTE);
					}
				}

				setState(235);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(234);
					match(T__0);
					}
				}

				}
				break;
			case PROMPT:
				_localctx = new Choice_op_promptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(PROMPT);
				setState(238);
				match(WORD_QUOTE);
				setState(240);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(239);
					if_expr();
					}
				}

				}
				break;
			case DEFAULT:
				_localctx = new Choice_op_defaultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(DEFAULT);
				setState(243);
				expr();
				setState(245);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(244);
					if_expr();
					}
				}

				}
				break;
			case DEPENDS:
				_localctx = new Choice_op_dependsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(DEPENDS);
				setState(248);
				match(ON);
				setState(249);
				expr();
				}
				break;
			case OPTIONAL:
				_localctx = new Choice_op_optionalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(OPTIONAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Choice_blockContext extends ParserRuleContext {
		public List<Config_menu_entryContext> config_menu_entry() {
			return getRuleContexts(Config_menu_entryContext.class);
		}
		public Config_menu_entryContext config_menu_entry(int i) {
			return getRuleContext(Config_menu_entryContext.class,i);
		}
		public Choice_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterChoice_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitChoice_block(this);
		}
	}

	public final Choice_blockContext choice_block() throws RecognitionException {
		Choice_blockContext _localctx = new Choice_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_choice_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				config_menu_entry();
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONFIG );
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

	public static class Comment_menu_entryContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(KConfig5Parser.COMMENT, 0); }
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public TerminalNode NEWLINE() { return getToken(KConfig5Parser.NEWLINE, 0); }
		public List<Comment_optionsContext> comment_options() {
			return getRuleContexts(Comment_optionsContext.class);
		}
		public Comment_optionsContext comment_options(int i) {
			return getRuleContext(Comment_optionsContext.class,i);
		}
		public Comment_menu_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_menu_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterComment_menu_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitComment_menu_entry(this);
		}
	}

	public final Comment_menu_entryContext comment_menu_entry() throws RecognitionException {
		Comment_menu_entryContext _localctx = new Comment_menu_entryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comment_menu_entry);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(COMMENT);
			setState(259);
			match(WORD_QUOTE);
			setState(260);
			match(NEWLINE);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(261);
					comment_options();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class Comment_optionsContext extends ParserRuleContext {
		public Comment_optionContext comment_option() {
			return getRuleContext(Comment_optionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(KConfig5Parser.NEWLINE, 0); }
		public Comment_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterComment_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitComment_options(this);
		}
	}

	public final Comment_optionsContext comment_options() throws RecognitionException {
		Comment_optionsContext _localctx = new Comment_optionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comment_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			comment_option();
			setState(268);
			match(NEWLINE);
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

	public static class Comment_optionContext extends ParserRuleContext {
		public TerminalNode DEPENDS() { return getToken(KConfig5Parser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(KConfig5Parser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Comment_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterComment_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitComment_option(this);
		}
	}

	public final Comment_optionContext comment_option() throws RecognitionException {
		Comment_optionContext _localctx = new Comment_optionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comment_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(DEPENDS);
			setState(271);
			match(ON);
			setState(272);
			expr();
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

	public static class Menu_menu_entryContext extends ParserRuleContext {
		public TerminalNode MENU() { return getToken(KConfig5Parser.MENU, 0); }
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(KConfig5Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KConfig5Parser.NEWLINE, i);
		}
		public TerminalNode ENDMENU() { return getToken(KConfig5Parser.ENDMENU, 0); }
		public VisibleContext visible() {
			return getRuleContext(VisibleContext.class,0);
		}
		public Menu_optionsContext menu_options() {
			return getRuleContext(Menu_optionsContext.class,0);
		}
		public List<InicialContext> inicial() {
			return getRuleContexts(InicialContext.class);
		}
		public InicialContext inicial(int i) {
			return getRuleContext(InicialContext.class,i);
		}
		public Menu_menu_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menu_menu_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenu_menu_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenu_menu_entry(this);
		}
	}

	public final Menu_menu_entryContext menu_menu_entry() throws RecognitionException {
		Menu_menu_entryContext _localctx = new Menu_menu_entryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_menu_menu_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(MENU);
			setState(275);
			match(WORD_QUOTE);
			setState(276);
			match(NEWLINE);
			setState(280);
			_la = _input.LA(1);
			if (_la==VISIBLE) {
				{
				setState(277);
				visible();
				setState(278);
				match(NEWLINE);
				}
			}

			setState(283);
			_la = _input.LA(1);
			if (_la==DEPENDS) {
				{
				setState(282);
				menu_options();
				}
			}

			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285);
				inicial();
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONFIG) | (1L << MENUCONFIG) | (1L << CHOICE) | (1L << COMMENT) | (1L << MENU) | (1L << IF))) != 0) );
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(290);
				match(NEWLINE);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(ENDMENU);
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(297);
				match(NEWLINE);
				}
				break;
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

	public static class Menu_optionsContext extends ParserRuleContext {
		public Menu_optionContext menu_option() {
			return getRuleContext(Menu_optionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(KConfig5Parser.NEWLINE, 0); }
		public Menu_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menu_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenu_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenu_options(this);
		}
	}

	public final Menu_optionsContext menu_options() throws RecognitionException {
		Menu_optionsContext _localctx = new Menu_optionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_menu_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			menu_option();
			setState(301);
			match(NEWLINE);
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

	public static class Menu_optionContext extends ParserRuleContext {
		public TerminalNode DEPENDS() { return getToken(KConfig5Parser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(KConfig5Parser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Menu_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menu_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenu_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenu_option(this);
		}
	}

	public final Menu_optionContext menu_option() throws RecognitionException {
		Menu_optionContext _localctx = new Menu_optionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_menu_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(DEPENDS);
			setState(304);
			match(ON);
			setState(305);
			expr();
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

	public static class Menu_blockContext extends ParserRuleContext {
		public Menu_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menu_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterMenu_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitMenu_block(this);
		}
	}

	public final Menu_blockContext menu_block() throws RecognitionException {
		Menu_blockContext _localctx = new Menu_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_menu_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__2);
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

	public static class If_menu_entryContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KConfig5Parser.IF, 0); }
		public Ifmenu_exprContext ifmenu_expr() {
			return getRuleContext(Ifmenu_exprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KConfig5Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KConfig5Parser.NEWLINE, i);
		}
		public TerminalNode ENDIF() { return getToken(KConfig5Parser.ENDIF, 0); }
		public List<InicialContext> inicial() {
			return getRuleContexts(InicialContext.class);
		}
		public InicialContext inicial(int i) {
			return getRuleContext(InicialContext.class,i);
		}
		public If_menu_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_menu_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterIf_menu_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitIf_menu_entry(this);
		}
	}

	public final If_menu_entryContext if_menu_entry() throws RecognitionException {
		If_menu_entryContext _localctx = new If_menu_entryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_menu_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IF);
			setState(310);
			ifmenu_expr();
			setState(311);
			match(NEWLINE);
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				inicial();
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONFIG) | (1L << MENUCONFIG) | (1L << CHOICE) | (1L << COMMENT) | (1L << MENU) | (1L << IF))) != 0) );
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(317);
				match(NEWLINE);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(ENDIF);
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(324);
				match(NEWLINE);
				}
				break;
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

	public static class Ifmenu_exprContext extends ParserRuleContext {
		public Ifmenu_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifmenu_expr; }
	 
		public Ifmenu_exprContext() { }
		public void copyFrom(Ifmenu_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_symbolContext extends Ifmenu_exprContext {
		public TerminalNode SYMBOL() { return getToken(KConfig5Parser.SYMBOL, 0); }
		public If_symbolContext(Ifmenu_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterIf_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitIf_symbol(this);
		}
	}
	public static class If_symbol_negadoContext extends Ifmenu_exprContext {
		public TerminalNode SYMBOL() { return getToken(KConfig5Parser.SYMBOL, 0); }
		public If_symbol_negadoContext(Ifmenu_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterIf_symbol_negado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitIf_symbol_negado(this);
		}
	}

	public final Ifmenu_exprContext ifmenu_expr() throws RecognitionException {
		Ifmenu_exprContext _localctx = new Ifmenu_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifmenu_expr);
		try {
			setState(330);
			switch (_input.LA(1)) {
			case SYMBOL:
				_localctx = new If_symbolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(SYMBOL);
				}
				break;
			case T__3:
				_localctx = new If_symbol_negadoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(T__3);
				setState(329);
				match(SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class If_exprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KConfig5Parser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitIf_expr(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(IF);
			setState(333);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			or_expr();
			setState(337);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << SYMBOL) | (1L << WORD_QUOTE))) != 0)) {
				{
				setState(336);
				expr();
				}
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

	public static class Or_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public Or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterOr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitOr_expr(this);
		}
	}

	public final Or_exprContext or_expr() throws RecognitionException {
		Or_exprContext _localctx = new Or_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_or_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			and_expr();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(340);
				match(T__4);
				setState(341);
				and_expr();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class And_exprContext extends ParserRuleContext {
		public List<Unary_exprContext> unary_expr() {
			return getRuleContexts(Unary_exprContext.class);
		}
		public Unary_exprContext unary_expr(int i) {
			return getRuleContext(Unary_exprContext.class,i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitAnd_expr(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			unary_expr();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(348);
				match(T__5);
				setState(349);
				unary_expr();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Unary_exprContext extends ParserRuleContext {
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public Equals_exprContext equals_expr() {
			return getRuleContext(Equals_exprContext.class,0);
		}
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitUnary_expr(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unary_expr);
		try {
			setState(358);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__3);
				setState(356);
				unary_expr();
				}
				break;
			case T__7:
			case SYMBOL:
			case WORD_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				equals_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Equals_exprContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public Equals_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterEquals_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitEquals_expr(this);
		}
	}

	public final Equals_exprContext equals_expr() throws RecognitionException {
		Equals_exprContext _localctx = new Equals_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_equals_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			primary();
			setState(363);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__6) {
				{
				setState(361);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(362);
				primary();
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TRISTATE() { return getToken(KConfig5Parser.TRISTATE, 0); }
		public TerminalNode BOOL() { return getToken(KConfig5Parser.BOOL, 0); }
		public TerminalNode BOOLEAN() { return getToken(KConfig5Parser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(KConfig5Parser.INT, 0); }
		public TerminalNode STRING() { return getToken(KConfig5Parser.STRING, 0); }
		public TerminalNode HEX() { return getToken(KConfig5Parser.HEX, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRISTATE) | (1L << BOOL) | (1L << BOOLEAN) | (1L << INT) | (1L << STRING) | (1L << HEX))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Type_choiceContext extends ParserRuleContext {
		public TerminalNode TRISTATE() { return getToken(KConfig5Parser.TRISTATE, 0); }
		public TerminalNode BOOL() { return getToken(KConfig5Parser.BOOL, 0); }
		public Type_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterType_choice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitType_choice(this);
		}
	}

	public final Type_choiceContext type_choice() throws RecognitionException {
		Type_choiceContext _localctx = new Type_choiceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==TRISTATE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class VisibleContext extends ParserRuleContext {
		public TerminalNode VISIBLE() { return getToken(KConfig5Parser.VISIBLE, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public VisibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterVisible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitVisible(this);
		}
	}

	public final VisibleContext visible() throws RecognitionException {
		VisibleContext _localctx = new VisibleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_visible);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(VISIBLE);
			setState(370);
			if_expr();
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(KConfig5Parser.SYMBOL, 0); }
		public TerminalNode WORD_QUOTE() { return getToken(KConfig5Parser.WORD_QUOTE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primary);
		try {
			setState(378);
			switch (_input.LA(1)) {
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(SYMBOL);
				}
				break;
			case WORD_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(WORD_QUOTE);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(T__7);
				setState(375);
				expr();
				setState(376);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WordsContext extends ParserRuleContext {
		public List<TerminalNode> SYMBOL() { return getTokens(KConfig5Parser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(KConfig5Parser.SYMBOL, i);
		}
		public List<TerminalNode> Reserved_words() { return getTokens(KConfig5Parser.Reserved_words); }
		public TerminalNode Reserved_words(int i) {
			return getToken(KConfig5Parser.Reserved_words, i);
		}
		public WordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).enterWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KConfig5Listener ) ((KConfig5Listener)listener).exitWords(this);
		}
	}

	public final WordsContext words() throws RecognitionException {
		WordsContext _localctx = new WordsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(380);
				_la = _input.LA(1);
				if ( !(_la==Reserved_words || _la==SYMBOL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Reserved_words || _la==SYMBOL );
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0184\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\6\2I\n\2\r\2\16\2J\3\3\6\3N\n\3\r\3\16\3O"+
		"\3\4\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\6\4\\\n\4\r\4\16\4]\3\5\3"+
		"\5\3\6\3\6\5\6d\n\6\3\6\5\6g\n\6\3\6\5\6j\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6r\n\6\3\6\3\6\3\6\5\6w\n\6\3\6\3\6\3\6\5\6|\n\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0082\n\6\3\6\3\6\3\6\5\6\u0087\n\6\3\6\3\6\5\6\u008b\n\6\5\6\u008d"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0095\n\7\3\b\3\b\3\b\3\b\6\b\u009b\n"+
		"\b\r\b\16\b\u009c\3\b\5\b\u00a0\n\b\3\b\5\b\u00a3\n\b\3\t\3\t\5\t\u00a7"+
		"\n\t\3\t\5\t\u00aa\n\t\3\t\5\t\u00ad\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5"+
		"\n\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\t\3\t\3\t\5\t\u00bf\n\t\3\t\3\t\5\t\u00c3"+
		"\n\t\3\n\3\n\5\n\u00c7\n\n\3\n\3\n\6\n\u00cb\n\n\r\n\16\n\u00cc\3\n\7"+
		"\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\3\n\7\n\u00d7\n\n\f\n\16\n\u00da"+
		"\13\n\3\n\7\n\u00dd\n\n\f\n\16\n\u00e0\13\n\3\n\3\n\5\n\u00e4\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\5\f\u00eb\n\f\3\f\5\f\u00ee\n\f\3\f\3\f\3\f\5\f\u00f3"+
		"\n\f\3\f\3\f\3\f\5\f\u00f8\n\f\3\f\3\f\3\f\3\f\5\f\u00fe\n\f\3\r\6\r\u0101"+
		"\n\r\r\r\16\r\u0102\3\16\3\16\3\16\3\16\7\16\u0109\n\16\f\16\16\16\u010c"+
		"\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u011b\n\21\3\21\5\21\u011e\n\21\3\21\6\21\u0121\n\21\r\21\16\21"+
		"\u0122\3\21\7\21\u0126\n\21\f\21\16\21\u0129\13\21\3\21\3\21\5\21\u012d"+
		"\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\6\25\u013c\n\25\r\25\16\25\u013d\3\25\7\25\u0141\n\25\f\25\16\25\u0144"+
		"\13\25\3\25\3\25\5\25\u0148\n\25\3\26\3\26\3\26\5\26\u014d\n\26\3\27\3"+
		"\27\3\27\3\30\3\30\5\30\u0154\n\30\3\31\3\31\3\31\7\31\u0159\n\31\f\31"+
		"\16\31\u015c\13\31\3\32\3\32\3\32\7\32\u0161\n\32\f\32\16\32\u0164\13"+
		"\32\3\33\3\33\3\33\5\33\u0169\n\33\3\34\3\34\3\34\5\34\u016e\n\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u017d\n \3!\6!\u0180"+
		"\n!\r!\16!\u0181\3!\7X\u00d1\u00d8\u00de\u010a\2\"\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\4\2\4\4\t\t\3\2!&\3\2"+
		"!\"\3\2*+\u01ae\2H\3\2\2\2\4M\3\2\2\2\6Q\3\2\2\2\b_\3\2\2\2\n\u008c\3"+
		"\2\2\2\f\u0094\3\2\2\2\16\u0096\3\2\2\2\20\u00c2\3\2\2\2\22\u00c4\3\2"+
		"\2\2\24\u00e5\3\2\2\2\26\u00fd\3\2\2\2\30\u0100\3\2\2\2\32\u0104\3\2\2"+
		"\2\34\u010d\3\2\2\2\36\u0110\3\2\2\2 \u0114\3\2\2\2\"\u012e\3\2\2\2$\u0131"+
		"\3\2\2\2&\u0135\3\2\2\2(\u0137\3\2\2\2*\u014c\3\2\2\2,\u014e\3\2\2\2."+
		"\u0151\3\2\2\2\60\u0155\3\2\2\2\62\u015d\3\2\2\2\64\u0168\3\2\2\2\66\u016a"+
		"\3\2\2\28\u016f\3\2\2\2:\u0171\3\2\2\2<\u0173\3\2\2\2>\u017c\3\2\2\2@"+
		"\u017f\3\2\2\2BI\5\4\3\2CI\5\16\b\2DI\5\22\n\2EI\5\32\16\2FI\5 \21\2G"+
		"I\5(\25\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2"+
		"IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\3\3\2\2\2LN\5\6\4\2ML\3\2\2\2NO\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QR\7\f\2\2RS\7+\2\2S[\7\60\2\2TX\5\b"+
		"\5\2UW\7\60\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2[T\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_`\5\n\6\2`"+
		"\t\3\2\2\2ac\58\35\2bd\7,\2\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2eg\5,\27\2"+
		"fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\7\3\2\2ih\3\2\2\2ij\3\2\2\2j\u008d\3"+
		"\2\2\2kl\7\25\2\2lm\7\26\2\2m\u008d\5.\30\2no\7\27\2\2oq\7,\2\2pr\5,\27"+
		"\2qp\3\2\2\2qr\3\2\2\2r\u008d\3\2\2\2st\7\31\2\2tv\7+\2\2uw\5,\27\2vu"+
		"\3\2\2\2vw\3\2\2\2w\u008d\3\2\2\2xy\7\32\2\2y{\5.\30\2z|\5,\27\2{z\3\2"+
		"\2\2{|\3\2\2\2|\u008d\3\2\2\2}~\7\33\2\2~\177\7+\2\2\177\u0081\7+\2\2"+
		"\u0080\u0082\5,\27\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u008d"+
		"\3\2\2\2\u0083\u0084\7\30\2\2\u0084\u0086\5\f\7\2\u0085\u0087\5,\27\2"+
		"\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008d\3\2\2\2\u0088\u008a"+
		"\7\34\2\2\u0089\u008b\5,\27\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008d\3\2\2\2\u008ca\3\2\2\2\u008ck\3\2\2\2\u008cn\3\2\2\2\u008c"+
		"s\3\2\2\2\u008cx\3\2\2\2\u008c}\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0088"+
		"\3\2\2\2\u008d\13\3\2\2\2\u008e\u008f\7\37\2\2\u008f\u0090\7\4\2\2\u0090"+
		"\u0095\7,\2\2\u0091\u0095\7 \2\2\u0092\u0095\7\'\2\2\u0093\u0095\7(\2"+
		"\2\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093"+
		"\3\2\2\2\u0095\r\3\2\2\2\u0096\u0097\7\r\2\2\u0097\u009a\7+\2\2\u0098"+
		"\u0099\7\60\2\2\u0099\u009b\5\20\t\2\u009a\u0098\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u00a0\7\60\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3"+
		"\2\2\2\u00a1\u00a3\5(\25\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\17\3\2\2\2\u00a4\u00a6\58\35\2\u00a5\u00a7\7,\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\5,\27\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\7\3\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00c3\3\2\2\2\u00ae\u00af\7\25"+
		"\2\2\u00af\u00b0\7\26\2\2\u00b0\u00c3\5.\30\2\u00b1\u00b2\7\31\2\2\u00b2"+
		"\u00b4\7+\2\2\u00b3\u00b5\5,\27\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00c3\3\2\2\2\u00b6\u00b7\7\32\2\2\u00b7\u00b9\5.\30\2\u00b8"+
		"\u00ba\5,\27\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c3\3\2"+
		"\2\2\u00bb\u00bc\7\27\2\2\u00bc\u00be\7,\2\2\u00bd\u00bf\5,\27\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00c1\7\30"+
		"\2\2\u00c1\u00c3\7(\2\2\u00c2\u00a4\3\2\2\2\u00c2\u00ae\3\2\2\2\u00c2"+
		"\u00b1\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\21\3\2\2\2\u00c4\u00c6\7\16\2\2\u00c5\u00c7\7+\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7\60\2\2"+
		"\u00c9\u00cb\5\24\13\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\7\60\2\2"+
		"\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d8\5\30\r\2"+
		"\u00d5\u00d7\7\60\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00de\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dd\5\22\n\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e3\7\17\2\2\u00e2\u00e4\7\60\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\23\3\2\2\2\u00e5\u00e6\5\26\f\2\u00e6\u00e7\7\60\2\2\u00e7"+
		"\25\3\2\2\2\u00e8\u00ea\5:\36\2\u00e9\u00eb\7,\2\2\u00ea\u00e9\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee\7\3\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00fe\3\2\2\2\u00ef\u00f0\7\27\2\2"+
		"\u00f0\u00f2\7,\2\2\u00f1\u00f3\5,\27\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00fe\3\2\2\2\u00f4\u00f5\7\32\2\2\u00f5\u00f7\5.\30\2"+
		"\u00f6\u00f8\5,\27\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fe"+
		"\3\2\2\2\u00f9\u00fa\7\25\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fe\5.\30\2"+
		"\u00fc\u00fe\7\34\2\2\u00fd\u00e8\3\2\2\2\u00fd\u00ef\3\2\2\2\u00fd\u00f4"+
		"\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\27\3\2\2\2\u00ff"+
		"\u0101\5\6\4\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\31\3\2\2\2\u0104\u0105\7\20\2\2\u0105\u0106"+
		"\7,\2\2\u0106\u010a\7\60\2\2\u0107\u0109\5\34\17\2\u0108\u0107\3\2\2\2"+
		"\u0109\u010c\3\2\2\2\u010a\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\33"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5\36\20\2\u010e\u010f\7\60\2"+
		"\2\u010f\35\3\2\2\2\u0110\u0111\7\25\2\2\u0111\u0112\7\26\2\2\u0112\u0113"+
		"\5.\30\2\u0113\37\3\2\2\2\u0114\u0115\7\21\2\2\u0115\u0116\7,\2\2\u0116"+
		"\u011a\7\60\2\2\u0117\u0118\5<\37\2\u0118\u0119\7\60\2\2\u0119\u011b\3"+
		"\2\2\2\u011a\u0117\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011e\5\"\22\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3"+
		"\2\2\2\u011f\u0121\5\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0127\3\2\2\2\u0124\u0126\7\60"+
		"\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\7\22"+
		"\2\2\u012b\u012d\7\60\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"!\3\2\2\2\u012e\u012f\5$\23\2\u012f\u0130\7\60\2\2\u0130#\3\2\2\2\u0131"+
		"\u0132\7\25\2\2\u0132\u0133\7\26\2\2\u0133\u0134\5.\30\2\u0134%\3\2\2"+
		"\2\u0135\u0136\7\5\2\2\u0136\'\3\2\2\2\u0137\u0138\7\35\2\2\u0138\u0139"+
		"\5*\26\2\u0139\u013b\7\60\2\2\u013a\u013c\5\2\2\2\u013b\u013a\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0142"+
		"\3\2\2\2\u013f\u0141\7\60\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0145\u0147\7\36\2\2\u0146\u0148\7\60\2\2\u0147\u0146\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148)\3\2\2\2\u0149\u014d\7+\2\2\u014a\u014b\7\6"+
		"\2\2\u014b\u014d\7+\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"+\3\2\2\2\u014e\u014f\7\35\2\2\u014f\u0150\5.\30\2\u0150-\3\2\2\2\u0151"+
		"\u0153\5\60\31\2\u0152\u0154\5.\30\2\u0153\u0152\3\2\2\2\u0153\u0154\3"+
		"\2\2\2\u0154/\3\2\2\2\u0155\u015a\5\62\32\2\u0156\u0157\7\7\2\2\u0157"+
		"\u0159\5\62\32\2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015b\61\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u0162\5\64\33\2\u015e\u015f\7\b\2\2\u015f\u0161\5\64\33\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\63\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\6\2\2\u0166\u0169\5\64\33"+
		"\2\u0167\u0169\5\66\34\2\u0168\u0165\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"\65\3\2\2\2\u016a\u016d\5> \2\u016b\u016c\t\2\2\2\u016c\u016e\5> \2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\67\3\2\2\2\u016f\u0170\t\3\2"+
		"\2\u01709\3\2\2\2\u0171\u0172\t\4\2\2\u0172;\3\2\2\2\u0173\u0174\7)\2"+
		"\2\u0174\u0175\5,\27\2\u0175=\3\2\2\2\u0176\u017d\7+\2\2\u0177\u017d\7"+
		",\2\2\u0178\u0179\7\n\2\2\u0179\u017a\5.\30\2\u017a\u017b\7\13\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u0176\3\2\2\2\u017c\u0177\3\2\2\2\u017c\u0178\3\2"+
		"\2\2\u017d?\3\2\2\2\u017e\u0180\t\5\2\2\u017f\u017e\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182A\3\2\2\29HJOX]"+
		"cfiqv{\u0081\u0086\u008a\u008c\u0094\u009c\u009f\u00a2\u00a6\u00a9\u00ac"+
		"\u00b4\u00b9\u00be\u00c2\u00c6\u00cc\u00d1\u00d8\u00de\u00e3\u00ea\u00ed"+
		"\u00f2\u00f7\u00fd\u0102\u010a\u011a\u011d\u0122\u0127\u012c\u013d\u0142"+
		"\u0147\u014c\u0153\u015a\u0162\u0168\u016d\u017c\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}