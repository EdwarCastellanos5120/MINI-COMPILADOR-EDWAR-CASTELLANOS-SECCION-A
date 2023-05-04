package com.MiniCompilador;

import java.util.*;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class MyParserErrorListener extends BaseErrorListener{
	 private List<String> errors;

	    public MyParserErrorListener() {
	        errors = new ArrayList<String>();
	    }

	    public boolean hasErrors() {
	        return !errors.isEmpty();
	    }

	    public List<String> getErrors() {
	        return errors;
	    }

	    @Override
	    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
	                            int line, int charPositionInLine, String msg, RecognitionException e) {
	        String error = String.format("line %d:%d %s", line, charPositionInLine, msg);
	        errors.add(error);
	    }
}
