package project;

import javax.swing.*;
import java.awt.*;

public class calculadoraIMC extends Frame {
    calculadoraIMC(){

        JLabel LbPeso = new JLabel("Peso: ");
        LbPeso.setBounds(20, 40, 80,20);

        JLabel LbAltura = new JLabel("Altura: ");
        LbAltura.setBounds(20, 100, 80,20);

        JTextField TfPeso = new JTextField();
        TfPeso.setBounds(20, 70, 80,20);

        JTextField TfAltura = new JTextField();
        TfAltura.setBounds(20, 130, 80,20);

        JButton BtCalcular = new JButton("Calcular");

        BtCalcular.setBounds(20, 160, 80,20);
        
        add(LbAltura);
        add(TfAltura);
        add(LbPeso);
        add(TfPeso);
        add(BtCalcular);

        setSize(130,250);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new calculadoraIMC();
    }
}
