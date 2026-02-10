package App09;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;

public class GraficoFuncionCuadratica extends JFrame {

	private JTextField coeficienteA;
	private JTextField coeficienteB;
	private JTextField coeficienteC;
	private appGraficos09 graficoPanel;

	public GraficoFuncionCuadratica() {
		setTitle("Graficador de Función Cuadrática");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel panelSuperior = new JPanel();
		panelSuperior.setLayout(new FlowLayout());

		panelSuperior.add(new JLabel("a:"));
		coeficienteA = new JTextField("1",5);
		panelSuperior.add(coeficienteA);

		panelSuperior.add(new JLabel("b:"));
		coeficienteB = new JTextField("0", 5); 
		panelSuperior.add(coeficienteB);

		panelSuperior.add(new JLabel("c:"));
		coeficienteC = new JTextField("0", 5);
		panelSuperior.add(coeficienteC);

		JButton botonGraficar = new JButton("Graficar");
		panelSuperior.add(botonGraficar);

		add(panelSuperior, BorderLayout.NORTH);

		graficoPanel = new appGraficos09();
		add(graficoPanel, BorderLayout.CENTER);
		botonGraficar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {

					double a = Double.parseDouble(coeficienteA.getText());
					double b = Double.parseDouble(coeficienteB.getText());
					double c = Double.parseDouble(coeficienteC.getText());

					graficoPanel.setCoeficientes(a, b, c);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Por favor, ingresa valores numéricos válidos.");
				}
			}					
		});
	}
}
