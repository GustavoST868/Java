package graphic;

import javax.swing.*;
import java.awt.*;

public class Grafico extends JComponent implements Runnable {

    public Grafico() {
        new Thread(this).start();
    }

    private double angle = 0;
    private int centerX = 400;
    private int centerY = 300;
    private int radius = 200;

    private static final int BLOCK_SIZE = 100;
    private static final int BORDER_WIDTH = 10;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    @Override
    public void paint(Graphics graphics) {
        int dx = (int) (centerX + radius * Math.cos(angle)) - BLOCK_SIZE / 2;
        int dy = (int) (centerY + radius * Math.sin(angle)) - BLOCK_SIZE / 2;

        graphics.setColor(Color.black);
        graphics.fillOval(dx, dy, BLOCK_SIZE, BLOCK_SIZE);
    }

    @Override
    public void run() {
        while (true) {
            // Atualiza o ângulo para mover a figura em um movimento circular
            angle += 0.08;

            // Certifica-se de que o ângulo permaneça dentro de 0 a 2π para evitar overflow
            if (angle > Math.PI * 2) {
                angle -= Math.PI * 2;
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
