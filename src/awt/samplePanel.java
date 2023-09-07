package awt;//EXEMPLO DE PANEL
import javax.swing.*;
import java.awt.*;

public class samplePanel extends Frame {

    Panel p1, p2, p3;
    Label l1, l2, l3;
    samplePanel(){
//      Criação dp painel vermelho
        setLayout(new FlowLayout());
        p1 = new Panel();
        l1 = new Label("Painel Vermelho");
        JButton b1= new JButton("Botao 1");
        p1.add(l1);
        p1.add(b1);
        p1.setBackground(Color.red);
        add(p1);

//      Criação do painel Azul
        p2 = new Panel();
        l2 = new Label("Painel Azul");
        JButton b2= new JButton("Botao 2");
        p2.add(l2);
        p2.add(b2);
        p2.setBackground(Color.blue);
        add(p2);

//      Criação do painel verde
        p3 = new Panel();
        l3 = new Label("Painel Verde");
        JButton b3 = new JButton("Botao 3");
        p3.add(l3);
        p3.add(b3);
        p3.setBackground(Color.green);
        add(p3);
    }
    public static void main(String[] args){

//      Instanciando e configurando a janela que recebera o painel
        Frame SampleJavaPanel = new samplePanel();
        SampleJavaPanel.setTitle("Painel Java");
        SampleJavaPanel.setSize(300, 300);
        SampleJavaPanel.setVisible(true);
    }
}
