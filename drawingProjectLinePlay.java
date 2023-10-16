import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class drawingProjectLinePlay {
    public static void drawImage(Graphics graphics) {
        int size = WIDTH / 2;
       
        drawSomething(0, 0, size, graphics);
    }

    public static void drawSomething(int x, int y ,int size, Graphics graphics) {



        graphics.setColor(Color.black);

        for(int i = 0; i < 20; i++)
        {
            graphics.drawLine(0 + i * 10, 0, 200, 0 + i * 10);
        }

        graphics.setColor(Color.blue);

        for(int i = 0; i < 20; i++)
        {
            graphics.drawLine(0, 0 + i * 10, 0 + i * 10, 200);
        }

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
