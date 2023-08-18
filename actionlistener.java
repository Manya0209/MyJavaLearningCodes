import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionlistener extends Frame implements ActionListener {
    Label lb;
    Button b;

    public actionlistener(){
        this.setVisible(true);
        this.setSize(500,500);

        b= new Button("click here");
        b.setBounds(200, 200, 60, 30);
        this.add(b);

        lb= new Label();
        lb.setBounds(100, 100, 300, 50);
        this.add(lb);

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Font f= new Font("consolas", 1, 25);
        lb.setFont(f);
        lb.setText("welcome back");
    }

    public static void main(String[] args) {
        new actionlistener();
    }
    
}
