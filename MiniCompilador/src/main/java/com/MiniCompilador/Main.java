
package com.MiniCompilador;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {

	private static final String EXTENSION = "ecl";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		try{
			
			System.out.println("Interpreting file " + program);

			EclangLexer lexer = new EclangLexer(new ANTLRFileStream(program));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			EclangParser parser = new EclangParser(tokens);
			MyLexerErrorListener lexerErrorListener = new MyLexerErrorListener();
		    MyParserErrorListener parserErrorListener = new MyParserErrorListener();
		    lexer.removeErrorListeners(); // elimina los escuchas predeterminados
		    lexer.addErrorListener(lexerErrorListener);
		    parser.removeErrorListeners(); // elimina los escuchas predeterminados
		    parser.addErrorListener(parserErrorListener);

			
			
			EclangParser.StartContext tree = parser.start();
			
			if (lexerErrorListener.hasErrors()) {
		        System.err.println("Lexer errorS:");
		        for (String error : lexerErrorListener.getErrors()) {
		        	System.err.println("Error Analisis Lexico " + error);
		        }
		    }
		    if (parserErrorListener.hasErrors()) {
		        for (String error : parserErrorListener.getErrors()) {
		            System.err.println("Error Analisis Sintactico " + error);
		        }
		    }
			
		    if (!lexerErrorListener.hasErrors() && !parserErrorListener.hasErrors()) {
		    	EclangCustomVisitor visitor = new EclangCustomVisitor();
				visitor.visit(tree);
				String[] nombresTokens = new String[tokens.getTokens().size()];
		 		int[] tipoTokens = new int[tokens.getTokens().size()];
		 		int x = 0;
		 		for (Object token : tokens.getTokens()) {
		 			if (token instanceof Token) {
		 				nombresTokens[x] = ((Token) token).getText();
		 				tipoTokens[x] = ((Token) token).getType();
		 		        x++;
		 		    }	
		 		}
		 		
		 		Utilidades utl = new Utilidades();
		 		String[] validar = utl.quitarRepetidos(nombresTokens,tipoTokens,1);
		 		String[] tipos = utl.quitarRepetidos(nombresTokens,tipoTokens,2);
		 		int[] tiposMutacion = new int [tipos.length];
		 		for (int i = 0; i < tipos.length; i++) {
		 		   tiposMutacion[i] = Integer.parseInt(tipos[i]);
		 		   
		 		}
		 		String[] tiposNombres = utl.validorTokens(tiposMutacion);
		 		for(int i= 0; i<validar.length;i++ ){
		 			System.out.println(validar[i]+ " " + tiposNombres[i]);
		 		}
				System.out.println("Interpretation finished");
		    }	
		}catch (IOException e) {
			System.out.println("ERROR");
		}
		
	}

}
