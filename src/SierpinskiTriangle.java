import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SierpinskiTriangle extends JFrame {
	public static int WIDTH = 600;
	public static int HEIGHT = 600;
	public static int SPACING = 50;
	public static int ITERATIONS = 3;
	
	public SierpinskiTriangle() {
		initGUI();
		
		setTitle("Sierpinski Triangle");
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initGUI() {
		JPanel triangles = new JPanel();
		add(triangles, BorderLayout.CENTER);
	}
	
	public void paint(Graphics g) {
		//call drawSierpinski
		drawSierpinski(ITERATIONS, g, SPACING, HEIGHT - SPACING, WIDTH/2, 
				calculateVertex(HEIGHT, WIDTH, SPACING), WIDTH - SPACING, HEIGHT - SPACING);
		
	}
	
	public void drawSierpinski(int i, Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
		//base case
		if (i == 0) return;
		
		//general solution - draw a triangle
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(x1, y1, x2, y2);
		g2.drawLine(x1, y1, x3, y3);
		g2.drawLine(x2, y2, x3, y3);
		
		i--;
		
		//reduced problem - draw smaller triangles
		
		
	}
	
	public static int midpoint(int p1, int p2) {
		
	}
	
	public static int calculateVertex (int h, int w, int s) {
		int vertex = (int)(h - s - ((w - 2*s)/2) * Math.sqrt(3));
		return vertex;
	}

	public static void main(String[] args) {
		SierpinskiTriangle tri = new SierpinskiTriangle();

	}

}
