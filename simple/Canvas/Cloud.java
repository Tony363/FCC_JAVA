package simple.Canvas;

import java.awt.*;
import java.awt.geom.*;

public class Cloud{
    private double x,y,size;
    private Color color;
    public Cloud(double x,double y, double size,Color color){
        this.x=x;
        this.y=y;
        this.size=size;
        this.color=color;
    }
    public void drawCloud(Graphics2D g2d){
        Ellipse2D.Double e1 = new Ellipse2D.Double(x,y,size,size);
        Ellipse2D.Double e2 = new Ellipse2D.Double(x+size*0.35,y-size*0.2,size*1.75,size*1.4);
        Ellipse2D.Double e3 = new Ellipse2D.Double(x+size*1.5,y+size*0.35,size*0.9,size*0.9);
        Ellipse2D.Double e4 = new Ellipse2D.Double(x+size*1.8,y+size*0.05,size*0.3,size*0.3);
        g2d.setColor(this.color);
        g2d.fill(e1);
        g2d.fill(e2);
        g2d.fill(e3);
        g2d.fill(e4);
    }
}