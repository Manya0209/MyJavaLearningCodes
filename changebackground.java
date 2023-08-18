import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class changebackground extends Frame implements ActionListener{
    Button b1, b2, b3;

    public changebackground(){
        this.setVisible(true);
        this.setSize(500,500);

    this.addWindowListener(new windowadapter(){
        public void windowClosing(WindowEvent e){
                System.exit(0);
        }
    });


        this.setLayout(new FlowLayout());

        b1= new Button("RED");      
        b2= new Button("GREEN");
        b3= new Button("YELLOW");

        b1.setBackground(Color.RED);        
        b2.setBackground(Color.GREEN);
        b2.setBackground(Color.YELLOW);

        b1.addActionListener(this);        
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        this.add(b1);        
        this.add(b2);
        this.add(b3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String label= e.getActionCommand();
        if(label.equals("RED")){
            this.setBackground(Color.RED);
        }
        if(label.equals("GREEN")){
            this.setBackground(Color.GREEN);
        }
        if(label.equals("YELLOW")){
            this.setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        changebackground cb= new changebackground();
    }
    
}
