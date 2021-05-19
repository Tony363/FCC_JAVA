package simple.Canvas;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent{
    private int height;
    private int width;
    private Cloud c1,c2,c3;
    private CircleLine cl;

    public DrawingCanvas(int w,int h){
        this.width = w;
        this.height = h;
        this.c1 = new Cloud(10,50,75,Color.LIGHT_GRAY);
        this.c2 = new Cloud(200,75,90,Color.BLUE);
        this.c3 = new Cloud(420,60,85,Color.DARK_GRAY);
        this.cl = new CircleLine();
    }
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        // Rectangle2D r = new Rectangle2D.Double(0,0,width,height);
        // g2d.setColor(new Color(100,149,237));
        // g2d.fill(r);

        // cl.drawCircleLine(g2d);
        // c1.drawCloud(g2d);
        // c2.drawCloud(g2d);
        // c3.drawCloud(g2d);

        Path2D.Double p = new Path2D.Double(); 
        p.moveTo(100,300);
        p.lineTo(150,200);
        p.lineTo(200,300);
        p.closePath();
        g2d.draw(p);
        Path2D.Double curve = new Path2D.Double();
        curve.moveTo(250,400);
        curve.curveTo(100,200,500,300,600,400);
        g2d.draw(curve);
    }    
}        