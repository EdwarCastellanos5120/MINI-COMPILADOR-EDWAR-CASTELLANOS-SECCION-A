// Generated from com/MiniCompilador/Eclang.g4 by ANTLR 4.5.1
package com.MiniCompilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EclangParser}.
 */
public interface EclangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EclangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(EclangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(EclangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(EclangParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(EclangParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#v_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterV_asignacion(EclangParser.V_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#v_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitV_asignacion(EclangParser.V_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#v_asignacion_valor_numero}.
	 * @param ctx the parse tree
	 */
	void enterV_asignacion_valor_numero(EclangParser.V_asignacion_valor_numeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#v_asignacion_valor_numero}.
	 * @param ctx the parse tree
	 */
	void exitV_asignacion_valor_numero(EclangParser.V_asignacion_valor_numeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#v_asignacion_valor_texto}.
	 * @param ctx the parse tree
	 */
	void enterV_asignacion_valor_texto(EclangParser.V_asignacion_valor_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#v_asignacion_valor_texto}.
	 * @param ctx the parse tree
	 */
	void exitV_asignacion_valor_texto(EclangParser.V_asignacion_valor_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_s_texto}.
	 * @param ctx the parse tree
	 */
	void enterC_s_texto(EclangParser.C_s_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_s_texto}.
	 * @param ctx the parse tree
	 */
	void exitC_s_texto(EclangParser.C_s_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_s_variable}.
	 * @param ctx the parse tree
	 */
	void enterC_s_variable(EclangParser.C_s_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_s_variable}.
	 * @param ctx the parse tree
	 */
	void exitC_s_variable(EclangParser.C_s_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_s_combinado}.
	 * @param ctx the parse tree
	 */
	void enterC_s_combinado(EclangParser.C_s_combinadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_s_combinado}.
	 * @param ctx the parse tree
	 */
	void exitC_s_combinado(EclangParser.C_s_combinadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_e_nuevo}.
	 * @param ctx the parse tree
	 */
	void enterC_e_nuevo(EclangParser.C_e_nuevoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_e_nuevo}.
	 * @param ctx the parse tree
	 */
	void exitC_e_nuevo(EclangParser.C_e_nuevoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_e_viejo}.
	 * @param ctx the parse tree
	 */
	void enterC_e_viejo(EclangParser.C_e_viejoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_e_viejo}.
	 * @param ctx the parse tree
	 */
	void exitC_e_viejo(EclangParser.C_e_viejoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#if_unitario}.
	 * @param ctx the parse tree
	 */
	void enterIf_unitario(EclangParser.If_unitarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#if_unitario}.
	 * @param ctx the parse tree
	 */
	void exitIf_unitario(EclangParser.If_unitarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(EclangParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(EclangParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#if_elseif}.
	 * @param ctx the parse tree
	 */
	void enterIf_elseif(EclangParser.If_elseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#if_elseif}.
	 * @param ctx the parse tree
	 */
	void exitIf_elseif(EclangParser.If_elseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(EclangParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(EclangParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#seleccionador}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionador(EclangParser.SeleccionadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#seleccionador}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionador(EclangParser.SeleccionadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#alter}.
	 * @param ctx the parse tree
	 */
	void enterAlter(EclangParser.AlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#alter}.
	 * @param ctx the parse tree
	 */
	void exitAlter(EclangParser.AlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#alter_texto}.
	 * @param ctx the parse tree
	 */
	void enterAlter_texto(EclangParser.Alter_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#alter_texto}.
	 * @param ctx the parse tree
	 */
	void exitAlter_texto(EclangParser.Alter_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#alter_numero}.
	 * @param ctx the parse tree
	 */
	void enterAlter_numero(EclangParser.Alter_numeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#alter_numero}.
	 * @param ctx the parse tree
	 */
	void exitAlter_numero(EclangParser.Alter_numeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_while(EclangParser.Ciclo_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_while(EclangParser.Ciclo_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_for(EclangParser.Ciclo_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_for(EclangParser.Ciclo_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#rango}.
	 * @param ctx the parse tree
	 */
	void enterRango(EclangParser.RangoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#rango}.
	 * @param ctx the parse tree
	 */
	void exitRango(EclangParser.RangoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#rango_numero}.
	 * @param ctx the parse tree
	 */
	void enterRango_numero(EclangParser.Rango_numeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#rango_numero}.
	 * @param ctx the parse tree
	 */
	void exitRango_numero(EclangParser.Rango_numeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#rango_v_iz}.
	 * @param ctx the parse tree
	 */
	void enterRango_v_iz(EclangParser.Rango_v_izContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#rango_v_iz}.
	 * @param ctx the parse tree
	 */
	void exitRango_v_iz(EclangParser.Rango_v_izContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#rango_v_de}.
	 * @param ctx the parse tree
	 */
	void enterRango_v_de(EclangParser.Rango_v_deContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#rango_v_de}.
	 * @param ctx the parse tree
	 */
	void exitRango_v_de(EclangParser.Rango_v_deContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#rango_v}.
	 * @param ctx the parse tree
	 */
	void enterRango_v(EclangParser.Rango_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#rango_v}.
	 * @param ctx the parse tree
	 */
	void exitRango_v(EclangParser.Rango_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#cargos}.
	 * @param ctx the parse tree
	 */
	void enterCargos(EclangParser.CargosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#cargos}.
	 * @param ctx the parse tree
	 */
	void exitCargos(EclangParser.CargosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#cargo_nr_vacio}.
	 * @param ctx the parse tree
	 */
	void enterCargo_nr_vacio(EclangParser.Cargo_nr_vacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#cargo_nr_vacio}.
	 * @param ctx the parse tree
	 */
	void exitCargo_nr_vacio(EclangParser.Cargo_nr_vacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#cargo_nr_variables}.
	 * @param ctx the parse tree
	 */
	void enterCargo_nr_variables(EclangParser.Cargo_nr_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#cargo_nr_variables}.
	 * @param ctx the parse tree
	 */
	void exitCargo_nr_variables(EclangParser.Cargo_nr_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#cargo_sr_vacio}.
	 * @param ctx the parse tree
	 */
	void enterCargo_sr_vacio(EclangParser.Cargo_sr_vacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#cargo_sr_vacio}.
	 * @param ctx the parse tree
	 */
	void exitCargo_sr_vacio(EclangParser.Cargo_sr_vacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#cargo_sr_variables}.
	 * @param ctx the parse tree
	 */
	void enterCargo_sr_variables(EclangParser.Cargo_sr_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#cargo_sr_variables}.
	 * @param ctx the parse tree
	 */
	void exitCargo_sr_variables(EclangParser.Cargo_sr_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#rtr}.
	 * @param ctx the parse tree
	 */
	void enterRtr(EclangParser.RtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#rtr}.
	 * @param ctx the parse tree
	 */
	void exitRtr(EclangParser.RtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#vrt}.
	 * @param ctx the parse tree
	 */
	void enterVrt(EclangParser.VrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#vrt}.
	 * @param ctx the parse tree
	 */
	void exitVrt(EclangParser.VrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(EclangParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(EclangParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_normal}.
	 * @param ctx the parse tree
	 */
	void enterC_normal(EclangParser.C_normalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_normal}.
	 * @param ctx the parse tree
	 */
	void exitC_normal(EclangParser.C_normalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_normal_and}.
	 * @param ctx the parse tree
	 */
	void enterC_normal_and(EclangParser.C_normal_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_normal_and}.
	 * @param ctx the parse tree
	 */
	void exitC_normal_and(EclangParser.C_normal_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_normal_or}.
	 * @param ctx the parse tree
	 */
	void enterC_normal_or(EclangParser.C_normal_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_normal_or}.
	 * @param ctx the parse tree
	 */
	void exitC_normal_or(EclangParser.C_normal_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_texto}.
	 * @param ctx the parse tree
	 */
	void enterC_texto(EclangParser.C_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_texto}.
	 * @param ctx the parse tree
	 */
	void exitC_texto(EclangParser.C_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_texto_iz}.
	 * @param ctx the parse tree
	 */
	void enterC_texto_iz(EclangParser.C_texto_izContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_texto_iz}.
	 * @param ctx the parse tree
	 */
	void exitC_texto_iz(EclangParser.C_texto_izContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_texto_de}.
	 * @param ctx the parse tree
	 */
	void enterC_texto_de(EclangParser.C_texto_deContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_texto_de}.
	 * @param ctx the parse tree
	 */
	void exitC_texto_de(EclangParser.C_texto_deContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_num_iz}.
	 * @param ctx the parse tree
	 */
	void enterC_num_iz(EclangParser.C_num_izContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_num_iz}.
	 * @param ctx the parse tree
	 */
	void exitC_num_iz(EclangParser.C_num_izContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclangParser#c_num_de}.
	 * @param ctx the parse tree
	 */
	void enterC_num_de(EclangParser.C_num_deContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclangParser#c_num_de}.
	 * @param ctx the parse tree
	 */
	void exitC_num_de(EclangParser.C_num_deContext ctx);
}