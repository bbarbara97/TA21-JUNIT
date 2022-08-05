package calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Calculadora extends JFrame implements ActionListener{
	
	// Content panel
	private JPanel contentPane;
	
	// Botones
	private JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;
	private JButton botonMasBarraMenos, botonComa, botonIgual, botonSuma, botonResta, botonMultiplicacion, botonDivision, botonRaiz;
	private JButton botonPotencia, botonFraccion, botonDelete, botonC, botonCE, botonPorcentaje, botonMC, botonMR, botonMPlus;
	private JButton botonMMenos, botonMS;
	private JLabel labelNumeros;
	private JLabel labelNumeros_2;
	
	private boolean reset = false;
	
	private double valorUno, valorDos;
	
	private ArrayList<Double> valores = new ArrayList<Double>();
	
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		boton0 = new JButton("0");
		boton0.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton0.setBounds(120, 556, 100, 50);
		boton0.setBackground(Color.WHITE);
		boton0.setOpaque(true);
		contentPane.add(boton0);
		
		boton1 = new JButton("1");
		boton1.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton1.setBounds(10, 495, 100, 50);
		boton1.setBackground(Color.WHITE);
		boton1.setOpaque(true);
		contentPane.add(boton1);
		
		boton2 = new JButton("2");
		boton2.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton2.setBounds(120, 495, 100, 50);
		boton2.setBackground(Color.WHITE);
		boton2.setOpaque(true);
		contentPane.add(boton2);
		
		boton3 = new JButton("3");
		boton3.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton3.setBounds(230, 495, 100, 50);
		boton3.setBackground(Color.WHITE);
		boton3.setOpaque(true);
		contentPane.add(boton3);
		
		boton4 = new JButton("4");
		boton4.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton4.setBounds(10, 434, 100, 50);
		boton4.setBackground(Color.WHITE);
		boton4.setOpaque(true);
		contentPane.add(boton4);
		
		boton5 = new JButton("5");
		boton5.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton5.setBounds(120, 434, 100, 50);
		boton5.setBackground(Color.WHITE);
		boton5.setOpaque(true);
		contentPane.add(boton5);
		
		boton6 = new JButton("6");
		boton6.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton6.setBounds(230, 434, 100, 50);
		boton6.setBackground(Color.WHITE);
		boton6.setOpaque(true);
		contentPane.add(boton6);
		
		boton7 = new JButton("7");
		boton7.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton7.setBounds(10, 373, 100, 50);
		boton7.setBackground(Color.WHITE);
		boton7.setOpaque(true);
		contentPane.add(boton7);
		
		boton8 = new JButton("8");
		boton8.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton8.setBounds(120, 373, 100, 50);
		boton8.setBackground(Color.WHITE);
		boton8.setOpaque(true);
		contentPane.add(boton8);
		
		boton9 = new JButton("9");
		boton9.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton9.setBounds(230, 373, 100, 50);
		boton9.setBackground(Color.WHITE);
		boton9.setOpaque(true);
		contentPane.add(boton9);
		
		botonMasBarraMenos = new JButton("+/-");
		botonMasBarraMenos.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonMasBarraMenos.setBounds(10, 556, 100, 50);
		botonMasBarraMenos.setBackground(Color.WHITE);
		botonMasBarraMenos.setOpaque(true);
		contentPane.add(botonMasBarraMenos);
		
		botonComa = new JButton(",");
		botonComa.setOpaque(true);
		botonComa.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonComa.setBackground(Color.WHITE);
		botonComa.setBounds(230, 556, 100, 50);
		contentPane.add(botonComa);
		
		botonIgual = new JButton("=");
		botonIgual.setOpaque(true);
		botonIgual.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonIgual.setBackground(Color.CYAN);
		botonIgual.setBounds(340, 556, 100, 50);
		contentPane.add(botonIgual);
		
		botonSuma = new JButton("+");
		botonSuma.setOpaque(true);
		botonSuma.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonSuma.setBackground(Color.LIGHT_GRAY);
		botonSuma.setBounds(340, 495, 100, 50);
		contentPane.add(botonSuma);
		
		botonResta = new JButton("-");
		botonResta.setOpaque(true);
		botonResta.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonResta.setBackground(Color.LIGHT_GRAY);
		botonResta.setBounds(340, 434, 100, 50);
		contentPane.add(botonResta);
		
		botonMultiplicacion = new JButton("X");
		botonMultiplicacion.setOpaque(true);
		botonMultiplicacion.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonMultiplicacion.setBackground(Color.LIGHT_GRAY);
		botonMultiplicacion.setBounds(340, 373, 100, 50);
		contentPane.add(botonMultiplicacion);
		
		botonDivision = new JButton("/");
		botonDivision.setOpaque(true);
		botonDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonDivision.setBackground(Color.LIGHT_GRAY);
		botonDivision.setBounds(340, 312, 100, 50);
		contentPane.add(botonDivision);
		
		botonRaiz = new JButton("√");
		botonRaiz.setOpaque(true);
		botonRaiz.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonRaiz.setBackground(Color.LIGHT_GRAY);
		botonRaiz.setBounds(230, 312, 100, 50);
		contentPane.add(botonRaiz);
		
		botonPotencia = new JButton("x^2");
		botonPotencia.setOpaque(true);
		botonPotencia.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonPotencia.setBackground(Color.LIGHT_GRAY);
		botonPotencia.setBounds(120, 312, 100, 50);
		contentPane.add(botonPotencia);
		
		botonFraccion = new JButton("1/x");
		botonFraccion.setOpaque(true);
		botonFraccion.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonFraccion.setBackground(Color.LIGHT_GRAY);
		botonFraccion.setBounds(10, 312, 100, 50);
		contentPane.add(botonFraccion);
		
		botonDelete = new JButton("<-");
		botonDelete.setOpaque(true);
		botonDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonDelete.setBackground(Color.LIGHT_GRAY);
		botonDelete.setBounds(340, 251, 100, 50);
		contentPane.add(botonDelete);
		
		botonC= new JButton("C");
		botonC.setOpaque(true);
		botonC.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonC.setBackground(Color.LIGHT_GRAY);
		botonC.setBounds(230, 251, 100, 50);
		contentPane.add(botonC);
		
		botonCE = new JButton("CE");
		botonCE.setOpaque(true);
		botonCE.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonCE.setBackground(Color.LIGHT_GRAY);
		botonCE.setBounds(120, 251, 100, 50);
		contentPane.add(botonCE);
		
		botonPorcentaje = new JButton("%");
		botonPorcentaje.setOpaque(true);
		botonPorcentaje.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonPorcentaje.setBackground(Color.LIGHT_GRAY);
		botonPorcentaje.setBounds(10, 251, 100, 50);
		contentPane.add(botonPorcentaje);
		
		botonMC = new JButton("MC");
		botonMC.setOpaque(false);
		botonMC.setBackground(Color.GRAY);
		botonMC.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonMC.setBounds(10, 192, 70, 50);
		contentPane.add(botonMC);
		
		botonMR = new JButton("MR");
		botonMR.setOpaque(false);
		botonMR.setBackground(Color.GRAY);
		botonMR.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonMR.setBounds(90, 192, 70, 50);
		contentPane.add(botonMR);
		
		botonMPlus = new JButton("M+");
		botonMPlus.setOpaque(false);
		botonMPlus.setBackground(Color.GRAY);
		botonMPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonMPlus.setBounds(170, 192, 70, 50);
		contentPane.add(botonMPlus);
		
		botonMMenos = new JButton("M-");
		botonMMenos.setOpaque(false);
		botonMMenos.setBackground(Color.GRAY);
		botonMMenos.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonMMenos.setBounds(250, 192, 70, 50);
		contentPane.add(botonMMenos);
		
		botonMS = new JButton("MS");
		botonMS.setOpaque(false);
		botonMS.setBackground(Color.GRAY);
		botonMS.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonMS.setBounds(330, 192, 70, 50);
		contentPane.add(botonMS);
		
		labelNumeros = new JLabel("0", SwingConstants.RIGHT);
		labelNumeros.setFont(new Font("Tahoma", Font.BOLD, 30));
		labelNumeros.setBounds(10, 100, 430, 37);
		contentPane.add(labelNumeros);
		
		labelNumeros_2 = new JLabel("", SwingConstants.RIGHT);
		labelNumeros_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelNumeros_2.setBounds(10, 53, 430, 37);
		contentPane.add(labelNumeros_2);
		
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		botonSuma.addActionListener(this);
		botonIgual.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Operaciones
		if(e.getSource() == botonSuma) {
			if(reset) {
				labelNumeros_2.setText("");
				reset = false;
			}
			labelNumeros_2.setText(labelNumeros_2.getText() + labelNumeros.getText() + " + ");
			valores.add(Double.parseDouble(labelNumeros.getText()));
			labelNumeros.setText("0");
		} else if (e.getSource() == botonIgual) {
			valores.add(Double.parseDouble(labelNumeros.getText()));
			Double resultado = 0.0;
			for (int i = 0; i < valores.size(); i++) {
				resultado += valores.get(i);
				System.out.println(resultado);
			}
			String resultadoString = resultado + "";
			labelNumeros_2.setText(labelNumeros_2.getText() + labelNumeros.getText() + " = ");
			labelNumeros.setText(resultadoString);
			reset = true;
		}
		
		
		// Botones Números
		if(e.getSource() == boton1) {
			if(labelNumeros.getText().equals("0")) {
				labelNumeros.setText("1");
			} else {
				labelNumeros.setText(labelNumeros.getText()+"1");
			}
		} else if (e.getSource() == boton2) {
			if(labelNumeros.getText().equals("0")) {
				labelNumeros.setText("2");
			} else {
				labelNumeros.setText(labelNumeros.getText()+"2");
			}
		} else if (e.getSource() == boton3) {
			if(labelNumeros.getText().equals("0")) {
				labelNumeros.setText("3");
			} else {
				labelNumeros.setText(labelNumeros.getText()+"3");
			}
		}
	}
}
