import javax.swing.JOptionPane;

public class TriangularPrism {
	private int x1, y1, x2, y2, x3, y3, h;
	private double side1, side2, side3, S, A;
	
	public TriangularPrism() {
		x1 = 0;
		y1 = 0;
		x2 = 5;
		y2 = 0;
		x3 = 0;
		y3 = 5;
		h = 5;
	}
	
	public TriangularPrism(int x1s, int y1s, int x2s, int y2s, int x3s, int y3s, int hs) {
		x1 = x1s;
		y1 = y1s;
		x2 = x2s;
		y2 = y2s;
		x3 = x3s;
		y3 = y3s;
		h = hs;
	}
	
	public int getx1() {return x1;}
	public int gety1() {return y1;}
	public int getx2() {return x2;}
	public int gety2() {return y2;}
	public int getx3() {return x3;}
	public int gety3() {return y3;}
	public int getHeight() {return h;}
	
	public double getSide1()
	{
		return side1 = Math.sqrt(Math.pow(x2 - x1, 2)
					 + Math.pow(y2 - y1, 2));
	}

	public double getSide2()
	{
		return side2 = Math.sqrt(Math.pow(x3 - x2, 2)
					 + Math.pow(y3 - y2, 2));
	}
	
	public double getSide3()
	{
		return side3 = Math.sqrt(Math.pow(x1 - x3, 2)
					 + Math.pow(y1 - y3, 2));
	}
	
	public double getS() {return S = (getSide1() + getSide2() + getSide3())/2;}
	public double getArea() {return A = Math.sqrt(getS()*(S-side1)*(S-side2)*(S-side3));}
	public double getSurface() {return ((2*getArea()) + (side1 * h) + (side2 * h) + (side3 * h));}
	public double getVolume() {return getArea() * h;}
	
	public void getAttributes()
	{
		String input = JOptionPane.showInputDialog(null,
			    "Enter first x-coordinate:",
			    "x1", JOptionPane.QUESTION_MESSAGE);
		x1 = Integer.parseInt(input);		
	
		input = JOptionPane.showInputDialog(null,
				"Enter first y-coordinate:",
				"y1", JOptionPane.QUESTION_MESSAGE);
		y1 = Integer.parseInt(input);		
	
		input = JOptionPane.showInputDialog(null,
				"Enter second x-coordinate:",
				"x2", JOptionPane.QUESTION_MESSAGE);
		x2 = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(null,
				"Enter second y-coordinate:",
				"y2", JOptionPane.QUESTION_MESSAGE);
		y2 = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(null,
				"Enter third x-coordinate:",
				"x3", JOptionPane.QUESTION_MESSAGE);
		x3 = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(null,
				"Enter third y-coordinate:",
				"y3", JOptionPane.QUESTION_MESSAGE);
		y3 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null,
				"Enter height:",
				"Height", JOptionPane.QUESTION_MESSAGE);
		h = Integer.parseInt(input);
	}
}