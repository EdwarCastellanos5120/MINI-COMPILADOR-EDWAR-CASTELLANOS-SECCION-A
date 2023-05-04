package com.MiniCompilador;
import java.awt.*;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Formulario extends JFrame {
    private JButton botonNuevo;
    private JButton botonAbrir;
    private JButton botonGuardar;
    private JButton botonCompilar;
    private JTextArea textArea;
    private JTable tabla1;
    private JTable tabla2;
    
    public Formulario(String[] args) {
        super("MiniCompilador EcLang");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        botonNuevo = new JButton("Nuevo");
        botonAbrir = new JButton("Abrir");
        botonGuardar = new JButton("Guardar");
        botonCompilar = new JButton("Compilar");
        
        botonNuevo.setBackground(Color.BLUE); 
        botonNuevo.setForeground(Color.WHITE); 
        botonAbrir.setBackground(Color.BLUE); 
        botonAbrir.setForeground(Color.WHITE);
        botonGuardar.setBackground(Color.BLUE); 
        botonGuardar.setForeground(Color.WHITE);
        botonGuardar.setBackground(Color.BLUE); 
        botonCompilar.setForeground(Color.BLACK);
        botonCompilar.setBackground(Color.GREEN); 
        botonNuevo.setFont(new Font("Arial", Font.BOLD, 14)); 
        botonAbrir.setFont(new Font("Arial", Font.BOLD, 14)); 
        botonGuardar.setFont(new Font("Arial", Font.BOLD, 14)); 
        botonCompilar.setFont(new Font("Arial", Font.BOLD, 14)); 
        
        JPanel panelBotones = new JPanel();
        panelBotones.add(botonNuevo);
        panelBotones.add(botonAbrir);
        panelBotones.add(botonGuardar);
        panelBotones.add(botonCompilar);
        
        textArea = new JTextArea();
        textArea.setFont(new Font("Consolas", Font.PLAIN, 18)); 
        textArea.setMargin(new Insets(0, 30, 0, 0)); 
        
        tabla1 = new JTable(2, 3); 
        tabla2 = new JTable(2, 3); 
        
        JScrollPane scrollPaneTextArea = new JScrollPane(textArea);
        scrollPaneTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        JScrollPane scrollPaneTabla1 = new JScrollPane(tabla1);
        JScrollPane scrollPaneTabla2 = new JScrollPane(tabla2);
        
        JPanel panelTablas = new JPanel(new GridLayout(1, 2));
        panelTablas.add(scrollPaneTabla1);
        panelTablas.add(scrollPaneTabla2);
        
        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.add(panelTablas, BorderLayout.CENTER);
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelBotones, BorderLayout.NORTH);
        getContentPane().add(scrollPaneTextArea, BorderLayout.CENTER);
        getContentPane().add(panelInferior, BorderLayout.SOUTH);
        
      
        setVisible(true);
        
     // Eventos de los botones
        botonNuevo.addActionListener(e -> {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas crear un nuevo archivo? Se perderá todo el texto actual.");
            if (opcion == JOptionPane.OK_OPTION) {
                textArea.setText("");
            }
        });
        
        
     // Evento del botón Abrir
        botonAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear un JFileChooser para seleccionar el archivo
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos EcL", "ecl");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(Formulario.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File archivo = chooser.getSelectedFile();
                    try {
                        // Leer el archivo seleccionado
                        FileReader reader = new FileReader(archivo);
                        BufferedReader br = new BufferedReader(reader);
                        String linea;
                        textArea.setText(""); // Limpiar el JTextArea
                        // Leer todas las líneas del archivo y añadirlas al JTextArea
                        while ((linea = br.readLine()) != null) {
                            textArea.append(linea + "\n");
                        }
                        br.close();
                        reader.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        // Evento del botón Guardar
        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear un JFileChooser para seleccionar el archivo
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos EcL", "ecl");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showSaveDialog(Formulario.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File archivo = chooser.getSelectedFile();
                    try {
                        // Escribir el contenido del JTextArea en el archivo seleccionado
                        FileWriter writer = new FileWriter(archivo);
                        BufferedWriter bw = new BufferedWriter(writer);
                        bw.write(textArea.getText());
                        bw.close();
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
      

        botonCompilar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 try {
                     // Crea un objeto File que represente el archivo que quieres sobrescribir
                     File archivo = new File("/home/compiladores/workspace/MiniCompilador/test/test.ecl");

                     // Lee el contenido actual del archivo y guárdalo en una variable
                     BufferedReader reader = new BufferedReader(new FileReader(archivo));
                     String contenidoActual = "";
                     String linea = "";
                     while ((linea = reader.readLine()) != null) {
                         contenidoActual += linea + "\n";
                     }
                     reader.close();

                     // Obtén el contenido actual del JTextArea
                     String contenidoNuevo = textArea.getText();

                     // Escribe el contenido del JTextArea en el archivo
                     BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
                     writer.write(contenidoNuevo);
                     writer.close();
                 } catch (IOException ex) {
                     ex.printStackTrace();
                 }
            	 
            	 
            	 
            	 
            	 
            	String program = args.length > 1 ? args[1] : "test/test." + "ecl";
            	
            	

         		EclangLexer lexer = null;
				try {
					System.out.println("Interpreting file " + program);
					lexer = new EclangLexer(new ANTLRFileStream(program));
					CommonTokenStream tokens = new CommonTokenStream(lexer);
	         		EclangParser parser = new EclangParser(tokens);
	         		MyLexerErrorListener lexerErrorListener = new MyLexerErrorListener();
	    		    MyParserErrorListener parserErrorListener = new MyParserErrorListener();
	    		    lexer.removeErrorListeners();
	    		    lexer.addErrorListener(lexerErrorListener);
	    		    parser.removeErrorListeners(); 
	    		    parser.addErrorListener(parserErrorListener);
	    		    EclangParser.StartContext tree = parser.start();
	    		    
	    		    String[] errors = new String[lexerErrorListener.getErrors().size() + parserErrorListener.getErrors().size()];
	    		    String[] tipo_error = new String[lexerErrorListener.getErrors().size() + parserErrorListener.getErrors().size()];
	    		    int y = 0;
	    		    
	    		    if (lexerErrorListener.hasErrors()) {
	    		        for (String error : lexerErrorListener.getErrors()) {
	    		        	errors[y] = error;
	    		        	tipo_error[y] = "LEXICO";
	    		        	y++;
	    		        }
	    		        DefaultTableModel modeloLimpieza = (DefaultTableModel) tabla1.getModel();
	    		        modeloLimpieza.setRowCount(0);
	    		    	DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
		         		String[] nuevosEncabezados = {"ID", "TIPO", "DESCRIPCION"};
		         		modelo.setColumnIdentifiers(nuevosEncabezados);
		         		modelo.setRowCount(errors.length);
		         		for (int i = 0; i < errors.length; i++) {
		         		   tabla2.setValueAt(i, i, 0); 
		         		   tabla2.setValueAt(tipo_error[i], i, 1); 
		         		   tabla2.setValueAt(errors[i], i, 2); 
		         		}
	    		    }
	    		    if (parserErrorListener.hasErrors()) {
	    		        for (String error : parserErrorListener.getErrors()) {
	    		        	errors[y] = error;
	    		        	tipo_error[y] = "SINTACTICO";
	    		        	y++;
	    		        }
	    		        
	    		        DefaultTableModel modeloLimpieza = (DefaultTableModel) tabla1.getModel();
	    		        modeloLimpieza.setRowCount(0);
	    		        DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
		         		String[] nuevosEncabezados = {"ID", "TIPO", "DESCRIPCION"};
		         		modelo.setColumnIdentifiers(nuevosEncabezados);
		         		modelo.setRowCount(errors.length);
		         		for (int i = 0; i < errors.length; i++) {
		         		   tabla2.setValueAt(i, i, 0); 
		         		   tabla2.setValueAt(tipo_error[i], i, 1); 
		         		   tabla2.setValueAt(errors[i], i, 2); 
		         		}
	    		    }
	    		    
	    		    
	    		    
	    		  
	    		    
	    		    if (!lexerErrorListener.hasErrors() && !parserErrorListener.hasErrors()) {
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
		         		
		         		
		         		DefaultTableModel modeloLimpieza = (DefaultTableModel) tabla2.getModel();
	    		        modeloLimpieza.setRowCount(0);
		         		DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
		         		String[] nuevosEncabezados = {"ID", "TOKENS", "TIPO"};
		         		modelo.setColumnIdentifiers(nuevosEncabezados);
		         		modelo.setRowCount(nombresTokens.length);
		         		for (int i = 0; i < validar.length; i++) {
		         		   tabla1.setValueAt(i, i, 0); 
		         		   tabla1.setValueAt(validar[i], i, 1); 
		         		   tabla1.setValueAt(tiposNombres[i], i, 2); 
		         		}

		         		EclangCustomVisitor visitor = new EclangCustomVisitor();
		         		visitor.visit(tree);

		         		System.out.println("Interpretation finished");
    		    	
	    		    }	
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
         		

            	
            }
        });





        
        
        
        
    }
    
    public static void main(String[] args) {
        Formulario formulario = new Formulario(args);
    }
}