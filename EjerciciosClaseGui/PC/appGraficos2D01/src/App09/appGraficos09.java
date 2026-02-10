package App09;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class appGraficos09 extends JPanel {
	private double a = 1, b = 0, c = 0;

	public void setCoeficientes(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, getWidth(), getHeight());

		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(3));

		int ancho = getWidth();
		int alto = getHeight();
		int origenX = ancho / 2;
		int origenY = alto / 2;
		g2d.drawLine(0, origenY, ancho, origenY); // Eje X
		g2d.drawLine(origenX, 0, origenX, alto); // Eje Y
		g2d.setColor(Color.BLUE);
		for (int x = -origenX; x < origenX; x++) {
			double escala = 50.0;
			double xReal = x / escala;
			double yReal = a * xReal * xReal + b * xReal + c;
			int xPixel = origenX + x;
			int yPixel = origenY - (int) (yReal * escala);

			if (x != -origenX) {
				g2d.drawLine(xPixel, yPixel, xPixel - 1,
						origenY - (int) ((a * Math.pow((x - 1) / escala, 2) + b * ((x - 1) / escala) + c) * escala));
			}
		}
	}
}
