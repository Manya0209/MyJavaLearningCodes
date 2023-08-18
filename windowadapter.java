import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class windowadapter extends WindowAdapter {
    public void windowClosing(WindowEvent e){
        System.out.println("window closing");
        System.exit(0);
    }
    
}
