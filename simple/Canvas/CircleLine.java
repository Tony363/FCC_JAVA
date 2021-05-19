package simple.Canvas;
import java.awt.*;
import java.awt.geom.*;

public class CircleLine{
    public CircleLine(){}
    public void drawCircleLine(Graphics2D g2d){

        Ellipse2D.Double e = new Ellipse2D.Double(200,75,100,100);
        g2d.setColor(Color.BLUE);
        g2d.fill(e);

        Line2D.Double line = new Line2D.Double(100,250,300,75);
        g2d.setColor(Color.BLACK);
        g2d.draw(line);
    }
}