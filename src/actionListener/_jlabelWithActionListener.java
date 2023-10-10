package actionListener;

import javax.swing.*;
import java.awt.event.*;

class _JLabelWithActionListener extends JFrame implements ActionListener {

    JTextField tf;
    JButton bt;
    JLabel lb;

    public _JLabelWithActionListener() {
        tf = new JTextField();
        tf.setBounds(50, 40, 150, 30);

        lb = new JLabel();
        lb.setBounds(50, 80, 300, 30);

        bt = new JButton("Encontrar IP");
        bt.setBounds(110, 120, 150, 30);
        bt.addActionListener(this);

        add(tf);
        add(lb);
        add(bt);

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            lb.setText("IP de " + host + " é " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        new _JLabelWithActionListener();
    }
}
