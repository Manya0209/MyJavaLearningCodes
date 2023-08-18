import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class graphicpaint extends Frame{
   public graphicpaint(){
    this.setVisible(true);
    this.setSize(500,500);
    this.setTitle("welcome");
    this.setBackground(Color.blue);
   }
   @Override
   public void paint(Graphics g) {
       g.drawString("hello everyone", 100, 100);
       g.drawRect(120, 150, 50, 70);
       g.fillRect(120, 150, 50, 70);
   }

   public static void main(String[] args) {
    graphicpaint gp= new graphicpaint();
   }
}
