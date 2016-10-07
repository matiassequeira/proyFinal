grammar KConfig5;
inicial:
	(config_stmts
	| menuconfig_menu_entry
	| choice_menu_entry
	| comment_menu_entry
	| menu_menu_entry
	| if_menu_entry
	)+;

config_stmts : 
	config_menu_entry+
	;
config_menu_entry
    : CONFIG SYMBOL NEWLINE (config_options NEWLINE*?)+ 
    ;
config_options
    : config_option
    ;
config_option
    : type WORD_QUOTE? if_expr? ';'? 		#config_op_type
    | DEPENDS ON expr	/*if_expr?*/		#config_op_depends
    | PROMPT   WORD_QUOTE	if_expr?	   	#config_op_prompt
    | SELECT   SYMBOL 	if_expr?		   	#config_op_select
    | DEFAULT  expr if_expr?			   	#config_op_default
    | RANGE    SYMBOL SYMBOL if_expr?	   	#config_op_range
    | OPTION   misc_option 	if_expr?	   	#config_op_option
    | OPTIONAL 	if_expr?				   	#config_op_optional
    ;
misc_option
    : ENV '=' WORD_QUOTE
    | DEFCONFIG_LIST
	| ALLNOCONFIG_Y
	| MODULES
    ;

menuconfig_menu_entry
    : MENUCONFIG SYMBOL  (NEWLINE menuconfig_options)+ NEWLINE?
    ;
	
menuconfig_options
    : type WORD_QUOTE? if_expr? ';'? 		#menuconfig_op_type
    | DEPENDS ON expr	/*if_expr?*/		#menuconfig_op_depends
    | SELECT   SYMBOL 	if_expr?		   	#menuconfig_op_select
    | DEFAULT  expr if_expr?			   	#menuconfig_op_default
	| PROMPT   WORD_QUOTE	if_expr?	   	#menuconfig_op_prompt
	| OPTION MODULES                        #menuconfig_op_modules
    ;

choice_menu_entry
    : CHOICE SYMBOL? NEWLINE choice_options+ NEWLINE*? choice_block NEWLINE*? choice_menu_entry*? ENDCHOICE NEWLINE?
    ;

choice_options
	: choice_option NEWLINE
	;
choice_option
	: type_choice WORD_QUOTE?  ';'?			#choice_op_type
	| PROMPT   WORD_QUOTE	if_expr?	   	#choice_op_prompt
	| DEFAULT expr if_expr?				#choice_op_default
	| DEPENDS ON expr						#choice_op_depends
	| OPTIONAL							   	#choice_op_optional
	;
choice_block
	: config_menu_entry+					
	; 

comment_menu_entry
    : COMMENT WORD_QUOTE NEWLINE comment_options*?
    ;
comment_options
	: comment_option NEWLINE
	;
comment_option: DEPENDS ON expr
	;
/*prompt_entry:
	PROMPT   (SYMBOL | WORD_QUOTE)
	;
*/

menu_menu_entry
    : MENU WORD_QUOTE NEWLINE (visible NEWLINE)? menu_options? inicial+ NEWLINE* ENDMENU NEWLINE?
    ;
menu_options
	: menu_option NEWLINE
	;
menu_option: DEPENDS ON expr
	;
menu_block:
	'TODO'
	;
if_menu_entry
	: IF ifmenu_expr NEWLINE inicial+ NEWLINE* ENDIF NEWLINE?
	;

/*source_menu_entry
   : SOURCE prompt_entry 
    ;
*/
/**
Expressions
**/
ifmenu_expr
	:SYMBOL 						#if_symbol	
	| '!'SYMBOL						#if_symbol_negado			
	;

if_expr
    : IF expr
    ;

expr
    : or_expr expr?
    ;

or_expr
    : and_expr ('||' and_expr)*
    ;

and_expr
    : unary_expr ('&&' unary_expr)*
    ;

unary_expr
    : '!' unary_expr
    | equals_expr
    ;

equals_expr
    : primary (('='|'!=') primary)?
    ;


type        :  TRISTATE | BOOL | BOOLEAN | INT | STRING | HEX;
type_choice: TRISTATE | BOOL;

visible: VISIBLE if_expr;
/**
FIXME
**/
primary
    : SYMBOL
    | WORD_QUOTE
    | '(' expr ')'
    ;

CONFIG      : 'config';
MENUCONFIG	: 'menuconfig';
CHOICE		: 'choice';
ENDCHOICE	: 'endchoice';
COMMENT		: 'comment';
MENU		: 'menu';
ENDMENU		: 'endmenu';
MAINMENU	: 'mainmenu';
SOURCE		: 'source';
DEPENDS     : 'depends';
ON          : 'on';
PROMPT      : 'prompt';
OPTION      : 'option';
SELECT      : 'select';
DEFAULT     : 'default' | 'def_bool' | 'def_tristate';
RANGE       : 'range';
OPTIONAL    : 'optional';
IF          : 'if';
ENDIF       : 'endif';
ENV         : 'env';
DEFCONFIG_LIST: 'defconfig_list';
TRISTATE	: 'tristate' ;
BOOL		: 'bool' ;
BOOLEAN		: 'boolean';
INT		: 'int';
STRING		: 'string'; 
HEX		: 'hex';
ALLNOCONFIG_Y: 'allnoconfig_y';
MODULES: 'modules';
VISIBLE: 'visible';

Reserved_words	: CONFIG | MENUCONFIG
		| DEPENDS | ON 
		| DEFAULT | RANGE | OPTIONAL 
		| PROMPT | OPTION | SELECT 
		| IF | ENDIF | ENV 
		| DEFCONFIG_LIST 
		| CHOICE | ENDCHOICE
		| COMMENT
		| MENU | ENDMENU
		| SOURCE
		| MAINMENU
		| TRISTATE | BOOL | BOOLEAN | INT | STRING | HEX
	;

SYMBOL
    :
      '-' ('0'..'9')+
    | ('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'/'|'.')+
//    | ('0' ('x'|'X'))
//	|'0' ('x' | 'X') ('0'..'9' | 'a'..'f' | 'A'..'F')+
    ;
WORD_QUOTE
    : '\'' (ESC|','|':'|.)*? '\''
    | '"' (ESC|','|':'|.)*? '"'
    ;


fragment
ESC
    : '\\' ('"'|'\'')
    ;
SLASH
    : '\\' ;
	


DASH	: '-'	;

DASHES
    : '-'
    ;

fragment
HELP_WS : (' '|'\t')*;

words	: (SYMBOL | Reserved_words)+	
	;


NEWLINE	: ('\r'? '\n')+ ;

WS : (('\t'|' ')+|'#'.*?'\n') -> skip ; // skip spaces
