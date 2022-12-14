import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MyPanel extends JPanel{
   private ArrayList<Figure> objs
     =new ArrayList<Figure>();

   public MyPanel(AdminWorld aw){
      setFocusable(true);
      addKeyListener(new MyKeyListener(aw));
   }

   public void addObj(Figure c){
        objs.add(c);
   }

   public void paint(Graphics g){
        super.paint(g);
        Iterator<Figure> it = objs.iterator();
        while( it.hasNext() ){
          Figure c = it.next();
          c.draw(g);
        }
   }

}
