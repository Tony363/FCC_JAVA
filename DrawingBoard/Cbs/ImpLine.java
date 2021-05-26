//Straight line
package DrawingBoard.Cbs;
import java.awt.*;
import DrawingBoard.Cbs.NetJavaShape;

public class ImpLine implements NetJavaShape{
    Graphics g;
    int x1, y1,x2, y2;
    Color c;
    public ImpLine(Graphics g,int x1,int y1,int x2,int y2,Color c){
        this.g=g;
        this.c=c;
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public void draw() {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(1));
        g.setColor(c);
        g.drawLine(x1, y1, x2, y2);
    }
    public void Erase(){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(10));
        g.setColor(Color.WHITE);
        g.drawLine(x1,y1,x2,y2);
    }
}