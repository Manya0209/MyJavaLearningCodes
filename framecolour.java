import java.awt.Color;
import java.awt.Frame;

public class framecolour extends Frame{
    public framecolour(){
        this.setVisible(true);
        this.setSize(500,500);

       // Color c = Color.blue;
       //Color c= new Color(0,255,0);  //RGB value---red,green,blue
       Color c= new Color(0Xceff00);
        this.setBackground(c);

        this.setTitle("background colour");
    }
    public static void main(String[] args) {
        framecolour fm= new framecolour();
    }
}
