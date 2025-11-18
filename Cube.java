import javax.swing.JOptionPane;

public class Cube {
	private int xTopLeft;
	private int yTopLeft;
	private int side;
	
	public Cube() {
		xTopLeft = 100;
		yTopLeft = 100;
		side = 100;
	}
	
	public Cube(int x, int y, int s) {
		xTopLeft = x;
		yTopLeft = y;
		side = s;
	}
	
	public int getxTopLeft() {return xTopLeft;}
	public int getyTopLeft() {return yTopLeft;}
	public int getSide() {return side;}
	
	public int getSurface()
	{
		return 6*side*side;
	}
	
	public int getVolume()
	{
		return side*side*side;
	}
	
	public void getAttributes()
	{
		String input = JOptionPane.showInputDialog(null,
					    "Enter top left corner x-coordinate:",
					    "x Top Left", JOptionPane.QUESTION_MESSAGE);
		xTopLeft = Integer.parseInt(input);		
	
		input = JOptionPane.showInputDialog(null,
						"Enter top left corner y-coordinate:",
						"y Top Left", JOptionPane.QUESTION_MESSAGE);
		yTopLeft = Integer.parseInt(input);		
	
		input = JOptionPane.showInputDialog(null,
						"Enter side length:",
						"Side Length", JOptionPane.QUESTION_MESSAGE);
		side = Integer.parseInt(input);		
	}
}
