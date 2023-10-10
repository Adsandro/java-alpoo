package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PrincipalView implements ActionListener{

    //declaracao de variaveis
    private JFrame frame;
    private JPanel panel;
    private JMenu mainMenu, subMenu;
    private JMenuItem i1, i2, i3, i4;
    private JMenuBar menuBar;
    private JComboBox combo;
    private JLabel lbTitulo;
    private String opcoes[] = {"Opc1", "Opc2", "Opc3", "Opc4"};

    PrincipalView() {
        // Instanciando compomentes
        frame = new JFrame("Testando Menus");
        panel = new JPanel();
        menuBar = new JMenuBar();
        mainMenu = new JMenu("MenuPrincipal");
        subMenu = new JMenu("SubMenu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        lbTitulo = new JLabel("Titulo");
        combo = new JComboBox<Object>(opcoes);


        //Configuracao da frame
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setJMenuBar(menuBar);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Segue a ordem que foi inserido
        menuBar.add(mainMenu);
        mainMenu.add(subMenu);
        mainMenu.add(i1);
        subMenu.add(i2);
        subMenu.add(i3);
        mainMenu.add(i4);

        // Componentes dentro do painel principal
        panel.add(lbTitulo);
        panel.add(combo);
        panel.setLayout(null);
        panel.setSize(frame.getWidth(), frame.getHeight());

        combo.setBounds(100,150,100,30);
        lbTitulo.setFont(new Font("Serif", Font.PLAIN, 38));
        lbTitulo.setBounds(100, 80, 300, 100);

        //Eventos
        i1.addActionListener(this);
        combo.addActionListener(this);
    }

    //Método dos botoes
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == i1) {
            JOptionPane.showMessageDialog(null, "Menu selecionado");
        }
        if(e.getSource() == combo) {
            lbTitulo.setText("Titulo: " + combo.getSelectedItem());
        }
    }
    //Método Principal
    public static void main(String []args) {
        new PrincipalView();
    }
}