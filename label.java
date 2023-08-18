import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class label extends Frame{
    private static final char c = 0;

    public label(){
        Label l1= new Label("user name");
        TextField t1= new TextField();
        Label l2= new Label("password");
        TextField t2= new TextField();

        l1.setBounds(50, 100, 100, 30);        
        l2.setBounds(50, 150, 100, 30);

        t1.setBounds(150, 100, 200, 30 );
        t2.setBounds(150, 150, 200, 30 );

        

        this.add(l1);    
        this.add(t1);    
        this.add(l2);
        this.add(t2);

    this.setVisible(true);
    this.setSize(500,500);
    }

    public static void main(String[] args) {
        label l= new label();
    }
}
