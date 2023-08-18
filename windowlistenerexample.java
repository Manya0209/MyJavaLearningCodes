import java.awt.Color;
import java.awt.Frame;

public class windowlistenerexample extends Frame {
    public windowlistenerexample(){
        this.setVisible(true);
        this.setSize(500,500);
        Color c = Color.blue;
        this.setBackground(c);
        
        this.addWindowListener(new windowlistener1());
    }

    public static void main(String[] args) {
        windowlistenerexample wle= new windowlistenerexample();
    }
}
