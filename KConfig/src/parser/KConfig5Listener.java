package parser;
// Generated from KConfig5.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KConfig5Parser}.
 */
public interface KConfig5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#inicial}.
	 * @param ctx the parse tree
	 */
	void enterInicial(KConfig5Parser.InicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#inicial}.
	 * @param ctx the parse tree
	 */
	void exitInicial(KConfig5Parser.InicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#config_stmts}.
	 * @param ctx the parse tree
	 */
	void enterConfig_stmts(KConfig5Parser.Config_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#config_stmts}.
	 * @param ctx the parse tree
	 */
	void exitConfig_stmts(KConfig5Parser.Config_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#config_menu_entry}.
	 * @param ctx the parse tree
	 */
	void enterConfig_menu_entry(KConfig5Parser.Config_menu_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#config_menu_entry}.
	 * @param ctx the parse tree
	 */
	void exitConfig_menu_entry(KConfig5Parser.Config_menu_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#config_options}.
	 * @param ctx the parse tree
	 */
	void enterConfig_options(KConfig5Parser.Config_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#config_options}.
	 * @param ctx the parse tree
	 */
	void exitConfig_options(KConfig5Parser.Config_optionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code config_op_type}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void enterConfig_op_type(KConfig5Parser.Config_op_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code config_op_type}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void exitConfig_op_type(KConfig5Parser.Config_op_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code config_op_depends}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void enterConfig_op_depends(KConfig5Parser.Config_op_dependsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code config_op_depends}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void exitConfig_op_depends(KConfig5Parser.Config_op_dependsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code config_op_prompt}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void enterConfig_op_prompt(KConfig5Parser.Config_op_promptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code config_op_prompt}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void exitConfig_op_prompt(KConfig5Parser.Config_op_promptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code config_op_select}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void enterConfig_op_select(KConfig5Parser.Config_op_selectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code config_op_select}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void exitConfig_op_select(KConfig5Parser.Config_op_selectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code config_op_default}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void enterConfig_op_default(KConfig5Parser.Config_op_defaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code config_op_default}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void exitConfig_op_default(KConfig5Parser.Config_op_defaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code config_op_range}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void enterConfig_op_range(KConfig5Parser.Config_op_rangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code config_op_range}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void exitConfig_op_range(KConfig5Parser.Config_op_rangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code config_op_option}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void enterConfig_op_option(KConfig5Parser.Config_op_optionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code config_op_option}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void exitConfig_op_option(KConfig5Parser.Config_op_optionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code config_op_optional}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void enterConfig_op_optional(KConfig5Parser.Config_op_optionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code config_op_optional}
	 * labeled alternative in {@link KConfig5Parser#config_option}.
	 * @param ctx the parse tree
	 */
	void exitConfig_op_optional(KConfig5Parser.Config_op_optionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#misc_option}.
	 * @param ctx the parse tree
	 */
	void enterMisc_option(KConfig5Parser.Misc_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#misc_option}.
	 * @param ctx the parse tree
	 */
	void exitMisc_option(KConfig5Parser.Misc_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#menuconfig_menu_entry}.
	 * @param ctx the parse tree
	 */
	void enterMenuconfig_menu_entry(KConfig5Parser.Menuconfig_menu_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#menuconfig_menu_entry}.
	 * @param ctx the parse tree
	 */
	void exitMenuconfig_menu_entry(KConfig5Parser.Menuconfig_menu_entryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menuconfig_op_type}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void enterMenuconfig_op_type(KConfig5Parser.Menuconfig_op_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menuconfig_op_type}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void exitMenuconfig_op_type(KConfig5Parser.Menuconfig_op_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menuconfig_op_depends}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void enterMenuconfig_op_depends(KConfig5Parser.Menuconfig_op_dependsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menuconfig_op_depends}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void exitMenuconfig_op_depends(KConfig5Parser.Menuconfig_op_dependsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menuconfig_op_select}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void enterMenuconfig_op_select(KConfig5Parser.Menuconfig_op_selectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menuconfig_op_select}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void exitMenuconfig_op_select(KConfig5Parser.Menuconfig_op_selectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menuconfig_op_default}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void enterMenuconfig_op_default(KConfig5Parser.Menuconfig_op_defaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menuconfig_op_default}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void exitMenuconfig_op_default(KConfig5Parser.Menuconfig_op_defaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menuconfig_op_prompt}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void enterMenuconfig_op_prompt(KConfig5Parser.Menuconfig_op_promptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menuconfig_op_prompt}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void exitMenuconfig_op_prompt(KConfig5Parser.Menuconfig_op_promptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menuconfig_op_modules}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void enterMenuconfig_op_modules(KConfig5Parser.Menuconfig_op_modulesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menuconfig_op_modules}
	 * labeled alternative in {@link KConfig5Parser#menuconfig_options}.
	 * @param ctx the parse tree
	 */
	void exitMenuconfig_op_modules(KConfig5Parser.Menuconfig_op_modulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#choice_menu_entry}.
	 * @param ctx the parse tree
	 */
	void enterChoice_menu_entry(KConfig5Parser.Choice_menu_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#choice_menu_entry}.
	 * @param ctx the parse tree
	 */
	void exitChoice_menu_entry(KConfig5Parser.Choice_menu_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#choice_options}.
	 * @param ctx the parse tree
	 */
	void enterChoice_options(KConfig5Parser.Choice_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#choice_options}.
	 * @param ctx the parse tree
	 */
	void exitChoice_options(KConfig5Parser.Choice_optionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code choice_op_type}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void enterChoice_op_type(KConfig5Parser.Choice_op_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code choice_op_type}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void exitChoice_op_type(KConfig5Parser.Choice_op_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code choice_op_prompt}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void enterChoice_op_prompt(KConfig5Parser.Choice_op_promptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code choice_op_prompt}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void exitChoice_op_prompt(KConfig5Parser.Choice_op_promptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code choice_op_default}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void enterChoice_op_default(KConfig5Parser.Choice_op_defaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code choice_op_default}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void exitChoice_op_default(KConfig5Parser.Choice_op_defaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code choice_op_depends}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void enterChoice_op_depends(KConfig5Parser.Choice_op_dependsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code choice_op_depends}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void exitChoice_op_depends(KConfig5Parser.Choice_op_dependsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code choice_op_optional}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void enterChoice_op_optional(KConfig5Parser.Choice_op_optionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code choice_op_optional}
	 * labeled alternative in {@link KConfig5Parser#choice_option}.
	 * @param ctx the parse tree
	 */
	void exitChoice_op_optional(KConfig5Parser.Choice_op_optionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#choice_block}.
	 * @param ctx the parse tree
	 */
	void enterChoice_block(KConfig5Parser.Choice_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#choice_block}.
	 * @param ctx the parse tree
	 */
	void exitChoice_block(KConfig5Parser.Choice_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#comment_menu_entry}.
	 * @param ctx the parse tree
	 */
	void enterComment_menu_entry(KConfig5Parser.Comment_menu_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#comment_menu_entry}.
	 * @param ctx the parse tree
	 */
	void exitComment_menu_entry(KConfig5Parser.Comment_menu_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#comment_options}.
	 * @param ctx the parse tree
	 */
	void enterComment_options(KConfig5Parser.Comment_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#comment_options}.
	 * @param ctx the parse tree
	 */
	void exitComment_options(KConfig5Parser.Comment_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#comment_option}.
	 * @param ctx the parse tree
	 */
	void enterComment_option(KConfig5Parser.Comment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#comment_option}.
	 * @param ctx the parse tree
	 */
	void exitComment_option(KConfig5Parser.Comment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#menu_menu_entry}.
	 * @param ctx the parse tree
	 */
	void enterMenu_menu_entry(KConfig5Parser.Menu_menu_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#menu_menu_entry}.
	 * @param ctx the parse tree
	 */
	void exitMenu_menu_entry(KConfig5Parser.Menu_menu_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#menu_options}.
	 * @param ctx the parse tree
	 */
	void enterMenu_options(KConfig5Parser.Menu_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#menu_options}.
	 * @param ctx the parse tree
	 */
	void exitMenu_options(KConfig5Parser.Menu_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#menu_option}.
	 * @param ctx the parse tree
	 */
	void enterMenu_option(KConfig5Parser.Menu_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#menu_option}.
	 * @param ctx the parse tree
	 */
	void exitMenu_option(KConfig5Parser.Menu_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#menu_block}.
	 * @param ctx the parse tree
	 */
	void enterMenu_block(KConfig5Parser.Menu_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#menu_block}.
	 * @param ctx the parse tree
	 */
	void exitMenu_block(KConfig5Parser.Menu_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#if_menu_entry}.
	 * @param ctx the parse tree
	 */
	void enterIf_menu_entry(KConfig5Parser.If_menu_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#if_menu_entry}.
	 * @param ctx the parse tree
	 */
	void exitIf_menu_entry(KConfig5Parser.If_menu_entryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_symbol}
	 * labeled alternative in {@link KConfig5Parser#ifmenu_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_symbol(KConfig5Parser.If_symbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_symbol}
	 * labeled alternative in {@link KConfig5Parser#ifmenu_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_symbol(KConfig5Parser.If_symbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_symbol_negado}
	 * labeled alternative in {@link KConfig5Parser#ifmenu_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_symbol_negado(KConfig5Parser.If_symbol_negadoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_symbol_negado}
	 * labeled alternative in {@link KConfig5Parser#ifmenu_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_symbol_negado(KConfig5Parser.If_symbol_negadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(KConfig5Parser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(KConfig5Parser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KConfig5Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KConfig5Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(KConfig5Parser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(KConfig5Parser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(KConfig5Parser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(KConfig5Parser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(KConfig5Parser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(KConfig5Parser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#equals_expr}.
	 * @param ctx the parse tree
	 */
	void enterEquals_expr(KConfig5Parser.Equals_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#equals_expr}.
	 * @param ctx the parse tree
	 */
	void exitEquals_expr(KConfig5Parser.Equals_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KConfig5Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KConfig5Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#type_choice}.
	 * @param ctx the parse tree
	 */
	void enterType_choice(KConfig5Parser.Type_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#type_choice}.
	 * @param ctx the parse tree
	 */
	void exitType_choice(KConfig5Parser.Type_choiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#visible}.
	 * @param ctx the parse tree
	 */
	void enterVisible(KConfig5Parser.VisibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#visible}.
	 * @param ctx the parse tree
	 */
	void exitVisible(KConfig5Parser.VisibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(KConfig5Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(KConfig5Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KConfig5Parser#words}.
	 * @param ctx the parse tree
	 */
	void enterWords(KConfig5Parser.WordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KConfig5Parser#words}.
	 * @param ctx the parse tree
	 */
	void exitWords(KConfig5Parser.WordsContext ctx);
}