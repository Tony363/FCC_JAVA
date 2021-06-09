//DrawListener class
package DrawingBoard.Cbs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import DrawingBoard.Cbs.NetJavaShape;
import javax.swing.JButton;

public class DrawListener implements ActionListener, MouseListener,
    MouseMotionListener {
        private Color color = Color.BLACK;//Color attribute, initial value is black
        private Graphics g;//Brush attributes
        private String str;//Save the string on the button to distinguish different buttons
        private int x1,y1,x2,y2;//(x1, y1), (x2, y2) are the coordinates when the mouse is pressed and released respectively
        private JButton nowColor;//Current color button
        //Save a collection of graphic objects
        private List<NetJavaShape> shapesArray = new ArrayList<NetJavaShape>();
        //Graphics
        private NetJavaShape shape;
        private Draw panel;

        public DrawListener(Draw panel){
            this.panel = panel;
        };
       
        //Get the collection in the draw class
        public List<NetJavaShape> getShapesArray() {
            return shapesArray;
        }
        //Get the brush object of the Draw class
        public void setG(Graphics g) {
            this.g = g;
        }
        //Get the current color button
        public void setNowColor(JButton nowColor) {
            this.nowColor = nowColor;
        }
        public void setStartPoint(int x, int y) {
            this.x1 = x;
            this.y1 = y;
        }
    
        public void setEndPoint(int x, int y) {
            this.x2 = (x);
            this.y2 = (y);
        }

        @Override
        //Mouse drag method
        public void mouseDragged(MouseEvent e) {

            int x = e.getX(),y = e.getY();
            //Method of drawing a curve
            if  ("Draw custom line".equals(this.str)) {
                this.g.setColor(color);
                //When instantiating the object, the curve is also drawn in a straight line, so it is different to create a new curve class
                this.shape = new ImpLine(this.g,x,y,this.x1,this.y1,this.color);
                //Call drawing method
                this.shape.draw();
                //Save the graphics in the collection
                this.shapesArray.add(this.shape);
                this.x1 = x;
                this.y1 = y;
            }else if ("Eraser".equals(this.str)){
                this.shape = new ImpLine(this.g,x,y,this.x1,this.y1,this.color);
                this.shape.Erase();
                this.shapesArray.add(this.shape);
                this.x1 = x;
                this.y1 = y;}
            // }else if ("REraser".equals(this.str)){
                
            //     this.g.setColor(Color.BLUE);
            //     this.shape = new DrawRect();
            //     this.shapesArray.add(this.shape);

            //     this.shape.setEndPoint(x,y);
            //     this.panel.repaint();

            //     this.shape.draw();
            //     this.x1 = x;
            //     this.y1 = y;
                
                
            // }
        }

        @Override
        //Mouse movement method
        public void mouseMoved(MouseEvent e) {
            // System.out.println("mouseMoved");
        }

        @Override
        //Mouse click method
        public void mouseClicked(MouseEvent e) {
            // System.out.println("mouseClicked");
        }

        // THESE 2
        // record mouse pressed 
        // then record mouse released 
        // then g.fillRect
        @Override
        //Mouse down method
        public void mousePressed(MouseEvent e) {
            // System.out.println("mousePressed");
            this.g.setColor(color);//Change the color of the pen
            this.x1 = e.getX();//Get the x coordinate of the mouse when pressed
            this.y1 = e.getY();//Get the y coordinate of the mouse when pressed
        }

        @Override
        //Mouse release method
        public void mouseReleased(MouseEvent e) {
            this.x2 = e.getX();//Get the x coordinate of the mouse when released
            this.y2 = e.getY();//Get the y coordinate of the mouse when released
            //Method of drawing a straight line
            if  ("Draw a straight line".equals(str)) {
                //Instantiate the object,
                this.shape=new ImpLine(g,this.x1,this.y1,this.x2,this.y2,this.color);
                //Call drawing method
                this.shape.draw();
                //Save the graphics in the collection
                this.shapesArray.add(shape);
            }else if ("REraser".equals(str)){
                // this.shape.setEndPoint(this.x2,this.y2);
                // this.shape.draw();
                // int px = Math.min(this.x1,this.x2);
                // int py = Math.min(this.y1,this.y2);
                // int pw = Math.abs(this.x1-this.x2);
                // int ph = Math.abs(this.y1-this.y2);
                // this.g.setColor(Color.white);
                // this.g.fillRect(px,py,pw,ph);
            }
        }

        @Override
        //Mouse access method
        public void mouseEntered(MouseEvent e) {
            // System.out.println("mouseEntered");
        }

        @Override
        //Mouse exit method
        public void mouseExited(MouseEvent e) {
            // System.out.println("mouseExited");
        }

        @Override
        //Handle mouse clicks on buttons
        public void actionPerformed(ActionEvent e) {
            
            if ("".equals(e.getActionCommand())) {
                JButton jb = (JButton) e.getSource();
                color = jb.getBackground();
                nowColor.setBackground(color);//Process current color
            } else {
                str = e.getActionCommand();
                System.out.println(str);
            }
        }
    }