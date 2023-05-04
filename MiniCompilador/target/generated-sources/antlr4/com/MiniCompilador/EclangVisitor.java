// Generated from com/MiniCompilador/Eclang.g4 by ANTLR 4.5.1
package com.MiniCompilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EclangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EclangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EclangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(EclangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(EclangParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#v_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_asignacion(EclangParser.V_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#v_asignacion_valor_numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_asignacion_valor_numero(EclangParser.V_asignacion_valor_numeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#v_asignacion_valor_texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_asignacion_valor_texto(EclangParser.V_asignacion_valor_textoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_s_texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_s_texto(EclangParser.C_s_textoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_s_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_s_variable(EclangParser.C_s_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_s_combinado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_s_combinado(EclangParser.C_s_combinadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_e_nuevo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_nuevo(EclangParser.C_e_nuevoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_e_viejo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_viejo(EclangParser.C_e_viejoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#if_unitario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_unitario(EclangParser.If_unitarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(EclangParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#if_elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_elseif(EclangParser.If_elseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(EclangParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#seleccionador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionador(EclangParser.SeleccionadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter(EclangParser.AlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#alter_texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_texto(EclangParser.Alter_textoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#alter_numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_numero(EclangParser.Alter_numeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#ciclo_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_while(EclangParser.Ciclo_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#ciclo_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_for(EclangParser.Ciclo_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#rango}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango(EclangParser.RangoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#rango_numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango_numero(EclangParser.Rango_numeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#rango_v_iz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango_v_iz(EclangParser.Rango_v_izContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#rango_v_de}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango_v_de(EclangParser.Rango_v_deContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#rango_v}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango_v(EclangParser.Rango_vContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#cargos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCargos(EclangParser.CargosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#cargo_nr_vacio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCargo_nr_vacio(EclangParser.Cargo_nr_vacioContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#cargo_nr_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCargo_nr_variables(EclangParser.Cargo_nr_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#cargo_sr_vacio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCargo_sr_vacio(EclangParser.Cargo_sr_vacioContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#cargo_sr_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCargo_sr_variables(EclangParser.Cargo_sr_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#rtr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtr(EclangParser.RtrContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#vrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVrt(EclangParser.VrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(EclangParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_normal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_normal(EclangParser.C_normalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_normal_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_normal_and(EclangParser.C_normal_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_normal_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_normal_or(EclangParser.C_normal_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_texto(EclangParser.C_textoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_texto_iz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_texto_iz(EclangParser.C_texto_izContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_texto_de}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_texto_de(EclangParser.C_texto_deContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_num_iz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_num_iz(EclangParser.C_num_izContext ctx);
	/**
	 * Visit a parse tree produced by {@link EclangParser#c_num_de}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_num_de(EclangParser.C_num_deContext ctx);
}