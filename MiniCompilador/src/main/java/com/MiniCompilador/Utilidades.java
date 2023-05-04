package com.MiniCompilador;

import java.util.*;

public class Utilidades {
	
	public String[] validorTokens(int[] tipos) {
	    String[] validar = new String[tipos.length];
	    for (int i = 0; i < tipos.length; i++) {
	        if (tipos[i] > 0 && tipos[i] < 17) {
	            validar[i] = "PALABRA RESERVADA";
	        } else if (tipos[i] == 17 || tipos[i] == 18 || tipos[i] == 19 || tipos[i] == 21) {
	            validar[i] = "OPERADORES";
	        } else if (tipos[i] == 20) {
	            validar[i] = "ASIGNACION";
	        } else if (tipos[i] > 21 && tipos[i] < 32) {
	            validar[i] = "PUNTUACION";
	        } else if (tipos[i] == 32) {
	            validar[i] = "IDENTIFICADOR";
	        } else if (tipos[i] == 34) {
	            validar[i] = "NUMERO";
	        }else{
	        	validar[i] = "N/R";
	        }
	    }
	    return validar;
	} 
	
	public String[] quitarRepetidos(String[] arreglo,int[]tipos, int op) {
	    Set<String> elementosUnicos = new HashSet<>();
	    List<String> elementosLista = new ArrayList<>();
	    List<Integer> listatipos = new ArrayList<>();
	    int x=0;
	    for (String elemento : arreglo) {
	        if (!elementosUnicos.contains(elemento)) {
	            elementosUnicos.add(elemento);
	            elementosLista.add(elemento);
	            listatipos.add(tipos[x]);
	        }
	        x++;
	    }
	    String[] elementosUnicosArray = new String[elementosLista.size()];
	    String[] tiposUnicosArray = new String[elementosLista.size()];
	    for (int i = 0; i < elementosLista.size(); i++) {
	        elementosUnicosArray[i] = elementosLista.get(i);
	        tiposUnicosArray[i] = Integer.toString(listatipos.get(i));	        
	    }
	    
	    if(op == 1){
	    	return elementosUnicosArray;
	    }else{
	    	return tiposUnicosArray;
	    }
	    
	}
	
}
