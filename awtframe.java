import java.awt.Frame;

public class awtframe{ 
    public awtframe(){
        //create a frame
        Frame fm = new Frame();

        //set visibility
        fm.setVisible(true);

        //set size
        fm.setSize(300, 200);
    }
    public static void main(String[] args) {
        awtframe aw= new awtframe();
    }
}
