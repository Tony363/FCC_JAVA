package DrawingBoard.Cbs;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class DrawRect extends JPanel implements NetJavaShape {

    int x1, y1, x2, y2;
    Graphics g;
    Color c;
    public static void main(String[] args) {
        JPanel jp2 = new JPanel();
        Graphics g = jp2.getGraphics();
        JFrame f = new JFrame("Draw Box Mouse 2");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(new DrawRect(g,0,0,0,0,Color.WHITE));
        f.setSize(300, 300);
        f.setVisible(true);
        
    }

    DrawRect(Graphics g,int x1,int y1,int x2,int y2, Color c) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.c = c; 
        this.g = g;
        // MyMouseListener listener = new MyMouseListener();
        // addMouseListener(listener);
        // addMouseMotionListener(listener);
    }

    public void drawPerfectRect(Graphics g, int x, int y, int x2, int y2) {
        int px = Math.min(x,x2);
        int py = Math.min(y,y2);
        int pw=Math.abs(x-x2);
        int ph=Math.abs(y-y2);
        g.fillRect(px, py, pw, ph);
    }

    // class MyMouseListener extends MouseAdapter {

    //     public void mousePressed(MouseEvent e) {
    //         setStartPoint(e.getX(), e.getY());
    //     }

    //     public void mouseDragged(MouseEvent e) {
    //         setEndPoint(e.getX(), e.getY());
    //         repaint();
    //     }

    //     public void mouseReleased(MouseEvent e) {
    //         setEndPoint(e.getX(), e.getY());
    //         repaint();
    //     }
    // }
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
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        drawPerfectRect(g, x1, y1, x2, y2);
    }

}