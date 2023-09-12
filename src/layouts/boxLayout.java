package layouts;
import java.awt.*;
import javax.swing.*;
public class boxLayout extends Frame{
    Button buttons[];
    boxLayout(){
        buttons = new Button[5];
        for(int i = 0; i < 5; i++){
            buttons[i] = new Button("BOTAO "+ (i+1));
            add(buttons[i]);
        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        new boxLayout();
    }
}
