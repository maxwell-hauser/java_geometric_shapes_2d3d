import javax.swing.JOptionPane;

public class GeometricShapes2D3D {
    public static int getInput() {
        boolean receivedValidInput = false;
        int seriesSelection1 = 0;
        do {
            String seriesSelection0 = JOptionPane.showInputDialog(null,
                "                               Geometric Shapes\n"
                + "___________________________________________________\n"
                + "                     Select a shape by entering the\n"
                + "                  number associated with the shape.\n"
                + "                      Press 7 to exit the program.\n"
                + "___________________________________________________\n"
                + "                        Two-dimensional shapes:\n"
                + "___________________________________________________\n"
                + "                                 1) Line\n"
                + "                                 2) Triangle\n"
                + "                                 3) Rectangle\n"
                + "                                 4) Diamond\n"
                + "___________________________________________________\n"
                + "                       Three-dimensional shapes:\n"
                + "___________________________________________________\n"
                + "                                 5) Triangular Prism\n"
                + "                                 6) Cube\n"
                + "___________________________________________________\n"
                + "                                 7) Exit\n"
                + "___________________________________________________\n",
                "CSC 229 - Project 05 - Shapes", JOptionPane.INFORMATION_MESSAGE);
            
            if (!(receivedValidInput = seriesSelection0.matches("[1-7]"))) {
                JOptionPane.showMessageDialog(null, 
                    "Incorrect input value received. Please enter a number between 1 and 7.\n"
                    + "Input received: '" + seriesSelection0 + "'. Please try again!", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            } else {
                seriesSelection1 = Integer.parseInt(seriesSelection0);
            }
        } while(!receivedValidInput);

        return seriesSelection1;
    }
        
    public static void displayResult0(int result) {
        switch(result) {
            case 1:
                Line L = new Line();
                L.getAttributes();
                displayResult1(result, L);
                break;
                
            case 2:
                Triangle t = new Triangle();
                t.getAttributes();
                displayResult1(result, t);
                break;
            
            case 3:
                Rectangle r = new Rectangle();
                r.getAttributes();
                displayResult1(result, r);
                break;
                
            case 4:
                Diamond d = new Diamond();
                d.getAttributes();
                displayResult1(result, d);                
                break;
    
            case 5:
                TriangularPrism tp = new TriangularPrism();
                tp.getAttributes();
                displayResult1(result, tp);
                break;
                
            case 6:
                Cube c = new Cube();
                c.getAttributes();
                displayResult1(result, c);                
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Thank you for using Shapes Series. Goodbye!", "Thank You", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
        }
    }
    
    public static void displayResult1(int result, Object o) {
        switch (result) {
            case 1:
                Line L = (Line) o;
                JOptionPane.showMessageDialog(null,
                    "                                Line Properties\n"
                    + "___________________________________________________\n"
                    + "        Beginning Coordinates: (" + L.getxStart() + ", " + L.getyStart() + ")\n"
                    + "             Ending Coordinates: (" + L.getxEnd() + ", " + L.getyEnd() + ")\n"
                    + "                          Line Length: " + L.getLength() + "\n"
                    + "___________________________________________________",
                    "Geometric Shapes", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 2:
                Triangle t = (Triangle) o;
                JOptionPane.showMessageDialog(null,
                    "                            Triangle Properties\n"
                    + "___________________________________________________\n"
                    + "                        First Point: (" + t.getx1() + ", " + t.gety1() + ")\n"    
                    + "                    Second Point: (" + t.getx2() + ", " + t.gety2() + ")\n"
                    + "                       Third Point: (" + t.getx3() + ", " + t.gety3() + ")\n"
                    + "                               Side 1: " + t.getSide1() + "\n"
                    + "                               Side 2: " + t.getSide2() + "\n"
                    + "                               Side 3: " + t.getSide3() + "\n"
                    + "                          Perimeter: " + t.getPerimeter() + "\n"
                    + "                                 Area: " + t.getArea() + "\n"
                    + "___________________________________________________",
                    "Geometric Shapes", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 3:
                Rectangle r = (Rectangle) o;
                JOptionPane.showMessageDialog(null,
                    "                            Rectangle Properties\n"
                    + "___________________________________________________\n"
                    + "                   Top left corner: (" + r.getxTopLeft() + ", " + r.getyTopLeft() + ")\n"
                    + "                                 Width: " + r.getWidth() + "\n"
                    + "                                Height: " + r.getHeight() + "\n"
                    + "                            Perimeter: " + r.getPerimeter() + "\n"
                    + "                                   Area: " + r.getArea() + "\n"
                    + "___________________________________________________",
                    "Geometric Shapes", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 4:
                Diamond d = (Diamond) o;
                JOptionPane.showMessageDialog(null,
                    "                            Diamond Properties\n"
                    + "___________________________________________________\n"
                    + "                               Center: (" + d.getxCenter() + ", " + d.getyCenter() + ")\n"
                    + "                               Height: " + d.getHeight() + "\n"
                    + "                                Width: " + d.getWidth() + "\n"
                    + "                          Perimeter: " + d.getPerimeter() + "\n"
                    + "                                  Area: " + d.getArea() + "\n"
                    + "___________________________________________________",
                    "Geometric Shapes", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case 5:
                TriangularPrism tp = (TriangularPrism) o;
                JOptionPane.showMessageDialog(null,
                    "                       Triangular Prism Properties\n"
                    + "___________________________________________________\n"
                    + "        Beginning Coordinates: (" + tp.getx1() + ", " + tp.gety1() + ")\n"
                    + "            Second Coordinates: (" + tp.getx2() + ", " + tp.gety2() + ")\n"
                    + "            Ending Coordinates: (" + tp.getx3() + ", " + tp.gety3() + ")\n"
                    + "                                Height: " + tp.getHeight() + "\n"
                    + "                               Surface: " + tp.getSurface() + "\n"
                    + "                               Volume: " + tp.getVolume() + "\n"
                    + "___________________________________________________",
                    "Geometric Shapes", JOptionPane.INFORMATION_MESSAGE);                
                break;
                
            default:
                Cube c = (Cube) o;
                JOptionPane.showMessageDialog(null,
                    "                                 Cube Properties\n"
                    + "___________________________________________________\n"
                    + "                  Top left corner: (" + c.getxTopLeft() + ", " + c.getyTopLeft() + ")\n"
                    + "                                   Side: " + c.getSide() + "\n"
                    + "                       Surface area: " + c.getSurface() + "\n"
                    + "                              Volume: " + c.getVolume() + "\n"
                    + "___________________________________________________",
                    "Geometric Shapes", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    
    public static void main(String[] args) {
        for (int i = 1; i > 0;) {
            int result = getInput();
            displayResult0(result);    
        }    
    }
}
