import java.awt.*;
public class tela extends Frame{
     tela()
    {
        Button b1 = new Button("Botão");
        add(b1);
        setSize(400, 400);
        setTitle("Titulo do programa");
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args){
        Frame SampleFramefr = new tela();
    }
}
