import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class drawingProjectTriangles {
    public static void drawImage(Graphics graphics) {
        int size = WIDTH / 2;
       
        drawSomething(0, 0, size, graphics);
    }

    public static void drawSomething(int x, int y ,int size, Graphics graphics) {

        int triangleSize = 100;

        graphics.drawPolygon(null, null, triangleSize);
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
}
