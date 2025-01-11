package view;

import graphic.Grafico;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    public Janela() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        Grafico grafico = new Grafico();
        add(grafico);

        setVisible(true);
    }
}
