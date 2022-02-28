import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintDemo {
    JFrame frame;
    DrawingPanel dPanel;

    // This is the constructor which sets up the JFrame
    // and all other components and containers
    public PaintDemo() {
        // Set up JFrame
        frame = new JFrame("Paint Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add DrawingPanel to CENTER
        dPanel = new DrawingPanel();
        frame.add(dPanel);

        // Set the size and set the visibility
        frame.pack();
        frame.setVisible(true);
    }

    // Main method just creates a PaintDemo object
    public static void main(String[] args) {
        PaintDemo x = new PaintDemo();
    }

    class DrawingPanel extends JPanel {
        // Constructor sets up DrawingPanel
        public DrawingPanel() {
            setBackground(Color.WHITE);
        }

        // Sets the size of the DrawingPanel, so frame.pack() considers
        // its preferred size when sizing the JFrame
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }

        // This is the method that draws everything
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

//            g.setColor(Color.BLACK);
//            g.drawRect(50, 50, 100, 50);
//            g.drawOval(200, 300, 50, 50);
//
//            g.setColor(Color.RED);
//            g.fillRect(50, 300, 50, 50);
//            g.fillOval(200, 50, 50, 100);

            g.setColor(Color.CYAN);
            g.fillRect(0,0,500,500);

            g.setColor(Color.GREEN);
            g.fillRect(0,400, 500, 500);
            //g.fillArc(200, 400, 200, 150, 30,15);

            g.setColor((Color.YELLOW));
            g.fillOval(50, 50, 150, 150);

            g.setColor(Color.WHITE);
            g.fillOval(300, 50, 105,110);
            g.fillOval(400, 50, 100,110);
            g.fillOval(350, 50, 95,100);


        }
    }
}
