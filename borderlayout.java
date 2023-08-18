import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class borderlayout extends Frame {
    public borderlayout(){
        this.setVisible(true);
        this.setSize(500,500);
        Color c = Color.blue;
        this.setBackground(c);

        BorderLayout b= new BorderLayout(20, 15);
        this.setLayout(b);

        Button b1= new Button("NORTH");        
        Button b2= new Button("SOUTH");
        Button b3= new Button("EAST");
        Button b4= new Button("WEST");
        Button b5= new Button("CENTER");

        this.add(b1, BorderLayout.NORTH);        
        this.add(b2, BorderLayout.SOUTH);
        this.add(b3, BorderLayout.EAST);
        this.add(b4, BorderLayout.WEST);
        this.add(b5, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        borderlayout bl= new borderlayout();
    }
}
