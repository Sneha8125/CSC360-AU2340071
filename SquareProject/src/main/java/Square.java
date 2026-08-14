import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // Make the lines smooth
        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        // Line thickness: 5 pixels
        g2.setStroke(new BasicStroke(5));

        // Draw square using 4 line segments
        g2.drawLine(100, 100, 350, 100); // Top
        g2.drawLine(350, 100, 350, 350); // Right
        g2.drawLine(350, 350, 100, 350); // Bottom
        g2.drawLine(100, 350, 100, 100); // Left
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java Square");

        frame.add(new Square());

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}