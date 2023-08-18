import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;

public class flowlayout extends Frame {
    public flowlayout(){
        this.setVisible(true);
        this.setSize(500,500);
        Color c = Color.blue;
        this.setBackground(c);

        this.addWindowListener(new windowadapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Button b1= new Button("1");        
        Button b2= new Button("2");
        Button b3= new Button("3");
        Button b4= new Button("4");
        Button b5= new Button("5");        
        Button b6= new Button("6");
        Button b7= new Button("7");
        Button b8= new Button("8");
        Button b9= new Button("9");

        this.add(b1);        
        this.add(b2);
        this.add(b3);        
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);

        //FlowLayout f= new FlowLayout();
        //this.setLayout(f);

        //this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        FlowLayout f= new FlowLayout(FlowLayout.LEFT, 50, 45);
        this.setLayout(f);
    }

    public static void main(String[] args) {
        flowlayout fl= new flowlayout();
    }
}
