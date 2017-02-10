import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                      
//                        //Draw a border
//                        g.setColor(Color.RED);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw a second border
//                        g.setColor(Color.GREEN);
//                        g.drawRect(x1 + 10, y1 + 10, width - 20, height - 20);
//                        
//                      //Draw a line
//                      g.setColor(Color.WHITE);
//                      g.drawLine(x1, y1, x2, y2);
                        
                        //Draw a second line
//                      g.setColor(Color.BLUE);
//                      g.drawLine(x1, y2, x2, y1);
                    
                      //Draw an oval
//                     g.setColor(Color.LIGHT_GRAY);
//                     g.fillOval((width-55)/2,(height-55)/2, 55, 55);
    
                      //Draw polygon 1
                        
/*                        Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.YELLOW);
                        g.fillPolygon(p);
*/
                      
                      //Draw white line 1  
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, height*7/9);
                        p3.addPoint(x2, height*7/9);
                        p3.addPoint(x2, height*5/9);
                        p3.addPoint(x1, height*5/9);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p3);
                        
                      //Draw white line 2  
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1, height*2/9);
                        p4.addPoint(x2, height*2/9);
                        p4.addPoint(x2, height*4/9);
                        p4.addPoint(x1, height*4/9);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p4);
                        
                      //Draw blue triangle 
                        Polygon p5 = new Polygon();
                        p5.addPoint(x1, y1);
                        p5.addPoint(x2/2, height/2);
                        p5.addPoint(x1, y2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p5);
                        
                      //Draw white star
                        //Draw polygon 2 
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                  
 
       
                  
                    
                        
            }
}