
// FONT STYLES- 
//plain---0, bold---1, italic---2, bold+italic---3

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class fontclass extends Frame{
    fontclass(){
    this.setVisible(true);
    this.setSize(500,500);
    this.setTitle("welcome");
    this.setBackground(Color.blue);
    }
  public void paint(Graphics g) {
    Font f= new Font("Montez", 2, 25);
    g.setFont(f);
    g.setColor(Color.MAGENTA);
    g.drawString("Hello Everyone", 100, 100);
   }


   public static void main(String[] args) {
    fontclass fc= new fontclass();
   }
}
