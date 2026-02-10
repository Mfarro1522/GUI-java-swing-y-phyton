package appgGraficos2d04;

import javax.swing.JFrame;

public class appgGraficos {

	public static void main(String[] args) {
		JFrame panelfont =  new JFrame("aiudame");
        fontPanel p = new fontPanel();

        panelfont.add(p);
        panelfont.setSize(400, 400);
        panelfont.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelfont.setVisible(true);
	}
}
