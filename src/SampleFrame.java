import java.awt.*;
public class SampleFrame extends Frame{

//  Construindo um frame simples
    SampleFrame()
    {
        Button b1 = new Button("Botão");
        add(b1);
        setSize(400, 400);
        setTitle("Titulo do programa");
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args){
        Frame teste = new SampleFrame();
    }
}
