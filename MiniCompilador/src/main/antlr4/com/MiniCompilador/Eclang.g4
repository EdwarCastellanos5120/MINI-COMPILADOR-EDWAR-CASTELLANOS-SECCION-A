grammar Eclang;

start
:
	PL_INICIO IDENTIFICADOR  LL_A
		sentencia*
	LL_C		
;

sentencia: v_asignacion | v_asignacion_valor_numero | v_asignacion_valor_texto |
c_s_texto |c_s_variable| c_s_combinado| c_e_nuevo| c_e_viejo |
if_unitario | if_else|if_elseif |
seleccionador | ciclo_while | ciclo_for | cargos;


v_asignacion: PL_VAR IDENTIFICADOR PUN_COMA ;
v_asignacion_valor_numero: PL_VAR IDENTIFICADOR SIMBOLO_ASIGN NUMERO PUN_COMA;
v_asignacion_valor_texto: PL_VAR IDENTIFICADOR SIMBOLO_ASIGN COMILLAS IDENTIFICADOR COMILLAS PUN_COMA;

c_s_texto: PL_CON_S COR_A COMILLAS IDENTIFICADOR COMILLAS CORC_C PUN_COMA;
c_s_variable: PL_CON_S COR_A IDENTIFICADOR CORC_C PUN_COMA;
c_s_combinado: PL_CON_S COR_A COMILLAS IDENTIFICADOR COMILLAS SIMBOLO_DO IDENTIFICADOR CORC_C PUN_COMA;
c_e_nuevo: PL_VAR IDENTIFICADOR  SIMBOLO_ASIGN PL_CON_E COR_A   CORC_C PUN_COMA;
c_e_viejo:  IDENTIFICADOR  SIMBOLO_ASIGN PL_CON_E COR_A   CORC_C PUN_COMA;

if_unitario: PL_IF COR_A condicion CORC_C LL_A sentencia* LL_C;
if_else:  PL_IF COR_A condicion CORC_C LL_A sentencia* LL_C PL_ELSE LL_A sentencia* LL_C;
if_elseif: PL_IF  COR_A condicion CORC_C LL_A sentencia* LL_C elseif* PL_ELSE LL_A sentencia* LL_C;
elseif:PL_ELSE_IF COR_A condicion CORC_C LL_A sentencia* LL_C;

seleccionador: 
PL_SELECCIONADOR COR_A IDENTIFICADOR CORC_C LL_A alter* PL_PRE SIMBOLO_ASIGN  sentencia* PL_END PUN_COMA LL_C;
alter: alter_texto | alter_numero;

alter_texto: PL_ALTER COR_A COMILLAS IDENTIFICADOR COMILLAS CORC_C  SIMBOLO_ASIGN sentencia* PL_END PUN_COMA;
alter_numero: PL_ALTER COR_A  IDENTIFICADOR  CORC_C  SIMBOLO_ASIGN sentencia* PL_END PUN_COMA;

ciclo_while: PL_WHILE COR_A condicion CORC_C LL_A sentencia* LL_C;
ciclo_for: PL_FOR COR_A rango CORC_C LL_A sentencia* LL_C;
rango: rango_numero | rango_v_iz | rango_v_de | rango_v ; 
rango_numero: NUMERO SIMBOLO_DO NUMERO;
rango_v_iz: IDENTIFICADOR SIMBOLO_DO NUMERO;
rango_v_de: NUMERO SIMBOLO_DO IDENTIFICADOR;
rango_v: IDENTIFICADOR SIMBOLO_DO IDENTIFICADOR;


cargos: cargo_nr_vacio |cargo_nr_variables | cargo_sr_vacio |cargo_sr_variables ;

cargo_nr_vacio: PL_CARGO  IDENTIFICADOR COR_A  CORC_C LL_A sentencia* LL_C;
cargo_nr_variables: PL_CARGO IDENTIFICADOR COR_A vrt* CORC_C LL_A sentencia* LL_C;
cargo_sr_vacio:  PL_CARGO  IDENTIFICADOR COR_A  CORC_C LL_A sentencia* RETORNO rtr LL_C;
cargo_sr_variables: PL_CARGO IDENTIFICADOR COR_A vrt*  CORC_C LL_A sentencia* RETORNO rtr LL_C;
rtr: IDENTIFICADOR | NUMERO;

vrt: IDENTIFICADOR;



condicion: c_normal|c_normal_and |c_normal_or |c_texto |c_texto_iz|c_texto_de|c_num_iz|c_num_de ; 
c_normal: IDENTIFICADOR SIM_DE_COMPA IDENTIFICADOR;
c_normal_and: PA_A  IDENTIFICADOR SIM_DE_COMPA IDENTIFICADOR PA_C PL_AND PA_A  IDENTIFICADOR SIM_DE_COMPA IDENTIFICADOR PA_C;
c_normal_or: PA_A  IDENTIFICADOR SIM_DE_COMPA IDENTIFICADOR PA_C PL_OR PA_A  IDENTIFICADOR SIM_DE_COMPA IDENTIFICADOR PA_C;
c_texto: COMILLAS IDENTIFICADOR COMILLAS SIM_DE_COMPA COMILLAS IDENTIFICADOR COMILLAS;
c_texto_iz:COMILLAS IDENTIFICADOR COMILLAS SIM_DE_COMPA  IDENTIFICADOR;
c_texto_de: IDENTIFICADOR  SIM_DE_COMPA COMILLAS IDENTIFICADOR COMILLAS;
c_num_iz : IDENTIFICADOR SIM_DE_COMPA NUMERO;
c_num_de: NUMERO SIM_DE_COMPA IDENTIFICADOR;


PL_INICIO: 'Class';
PL_VAR: 'Var';
PL_CON_S: 'Console.s';
PL_CON_E: 'Console.e';
PL_IF: 'if';
PL_ELSE_IF: 'else if';
PL_ELSE: 'else';
PL_SELECCIONADOR: 'Seleccionador';
PL_ALTER: 'Alter';
PL_END: 'end';
PL_PRE: 'Pre';
PL_WHILE: 'While';
PL_FOR: 'For';
PL_CARGO: 'Cargo';
PL_AND: 'AND';
PL_OR: 'OR';


SIM_OPERACION: [+\-*/%];
SIM_NEGACION: '!';
SIM_DE_COMPA: '<=' | '>='| '<'| '>'| '=='| '!=';
SIMBOLO_ASIGN:'=';
SIMBOLO_DO: '$';
PA_A: '(';
PA_C: ')';
COR_A: '[';
CORC_C: ']';
LL_A: '{';
LL_C: '}';
PUN_COMA: ';';
COMA: ',';
RETORNO: '->';
COMILLAS: '"';


IDENTIFICADOR:[a-zA-Z][a-zA-Z0-9]*;
TEXTO:[a-zA-Z]+;
NUMERO: [-]?[0-9]+('.'[0-9]+)?;

WS
:
	[ \t\r\n]+ -> skip
;






