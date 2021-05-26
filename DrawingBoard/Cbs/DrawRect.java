package DrawingBoard.Cbs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyMouseListener extends MouseAdapter{
    private DrawRect rect;
    MyMouseListener(){};
    MyMouseListener(DrawRect rect){this.rect = rect;}
    @Override
    public void mousePressed(MouseEvent e) {
        rect.setStartPoint(e.getX(), e.getY());
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        rect.setEndPoint(e.getX(), e.getY());
        rect.repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        rect.setEndPoint(e.getX(), e.getY());
        rect.repaint();
    }
}

public class DrawRect extends JPanel implements NetJavaShape {

    static int x1, y1, x2, y2;
    Graphics g;
    Color c;
    private MyMouseListener listener;
    DrawRect(){};
    DrawRect(Graphics g,int x1,int y1,int x2,int y2, Color c) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.c = c; 
        this.g = g;
        listener = new MyMouseListener(this);
        addMouseListener(listener);
        addMouseMotionListener(listener);
    }
    void setStartPoint(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    void setEndPoint(int x, int y) {
        this.x2 = (x);
        this.y2 = (y);
    }
    void drawPerfectRect(Graphics g, int x, int y, int x2, int y2) {
        int px = Math.min(x,x2);
        int py = Math.min(y,y2);
        int pw=Math.abs(x-x2);
        int ph=Math.abs(y-y2);
        g.fillRect(px, py, pw, ph);
    }
    public void Erase(){
        System.out.println("erasing");
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        drawPerfectRect(g, x1, y1, x2, y2);
    }
    public void draw(){
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        drawPerfectRect(g, x1, y1, x2, y2);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        drawPerfectRect(g, x1, y1, x2, y2);
    }

    public static void main(String[] args) {
        JPanel jp2 = new JPanel();
        Graphics g = jp2.getGraphics();
        JFrame f = new JFrame("Draw Box Mouse 2");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(new DrawRect(g,0,0,0,0,Color.WHITE));
        f.setSize(300, 300);
        f.setVisible(true);
    }
}