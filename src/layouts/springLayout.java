package layouts;

import javax.swing.*;
import java.awt.*;

public class springLayout {
    public static void criarEExibirGUI() {
        JFrame frame = new JFrame("Layout de Molas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        JLabel lb = new JLabel("Rótulo: ");
        JTextField tf = new JTextField("Meu campo de texto", 15);
        contentPane.add(lb);
        contentPane.add(tf);

        layout.putConstraint(SpringLayout.WEST, lb, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, lb, 10, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, tf, 10, SpringLayout.EAST, lb);
        layout.putConstraint(SpringLayout.NORTH, tf, 10, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.EAST, contentPane, 10, SpringLayout.EAST, tf);
        layout.putConstraint(SpringLayout.SOUTH, contentPane, 10, SpringLayout.SOUTH, tf);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                criarEExibirGUI();
            }
        });
    }
}
