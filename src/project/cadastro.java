package project;

import java.awt.*;

public class cadastro extends Frame {

    cadastro(){
        Label primeiroNome = new Label("Nome: ");
        primeiroNome.setBounds(20, 50, 80, 20);

        Label ultimoNome = new Label("Sobrenome: ");
        ultimoNome.setBounds(20, 80, 80, 20);

        Label dataNascimento = new Label("Nascimento: ");
        dataNascimento.setBounds(20, 110, 80, 20);

        TextField primeroNomeTF = new TextField();
        primeroNomeTF.setBounds(100, 50, 110, 20);

        TextField ultimoNomeTF = new TextField();
        ultimoNomeTF.setBounds(100, 80, 110, 20);

        TextField dataNascimentoTF = new TextField();
        dataNascimentoTF.setBounds(100, 110, 110, 20);

        Button enviarBT = new Button("Enviar");
        enviarBT.setBounds(20, 140, 50, 20);

        Button rejeitarBT = new Button("Rejeitar");
        rejeitarBT.setBounds(90, 140, 50, 20);

        add(primeiroNome);
        add(ultimoNome);
        add(dataNascimento);

        add(primeroNomeTF);
        add(ultimoNomeTF);
        add(dataNascimentoTF);

        add(enviarBT);
        add(rejeitarBT);

        setLayout(null);

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        new cadastro();
    }
}
