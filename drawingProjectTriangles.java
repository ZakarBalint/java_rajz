import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class drawingProjectTriangles {

    public static final int SIZE = 600;
    public static final int INITIAL_X = 300;
    public static final int INITIAL_Y = 50;
    public static final int SIDE = 100;

    public static void drawImage(Graphics graphics) {
        int size = WIDTH / 2;
       
        drawSomething(0, 0, size, graphics);
    }

    public static void drawSomething(int x, int y ,int size, Graphics graphics) {

        

        
    }

    // ezt a részt nem kell módosítani
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();


    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }

    private void drawTree(double x, double y, int depth, int maxDepth, Graphics graphics, double sideLength) {
        if (depth >= maxDepth) {
            return;
        }
    
        double leftX = x - sideLength / 2;
        double leftY = y + Math.sqrt(sideLength * 3) / 2;
        double rightX = x + sideLength / 2;
        double rightY = leftY;
        
        //draw line from (x,y) -> (leftX, leftY)
        graphics.drawLine(x, y, leftX, leftY);
        //draw line from (x,y) -> (rightX, rightY)
        graphics.drawLine(x, y, rightX, rightY);
        //draw line from (leftX, leftY) -> (rightX, rightY)
        graphics.drawLine(leftX, leftX, rightX, rightY);
    
        drawTree(leftX, leftY, depth + 1, maxDepth, graphics, sideLength);
        drawTree(rightX, rightY, depth + 1, maxDepth, graphics, sideLength);
    }
}
