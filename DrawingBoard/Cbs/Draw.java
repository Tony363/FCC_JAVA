//draw class
package DrawingBoard.Cbs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
   * Draw class, used for the initialization of the interface
 * @author CBS
 */
@SuppressWarnings("serial")
public class Draw extends JFrame {
    private DrawListener dl;
    private Graphics g;
    //Save a collection of graphic objects
    private List<NetJavaShape> shapesArray = new ArrayList<NetJavaShape>();
    //  Interface initialization method

    public Draw(){this.dl = new DrawListener(this);}
    public void showUI() {
        setTitle("Draw a picture");//Form name
        setSize(1200, 900);//Window size
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);//Center the form
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);//Flow layout left aligned
        setLayout(layout);//The form uses the flow layout manager
        this.setResizable(false);//The window size remains unchanged
        
        //Use an array to save button names
        String buttonName[] = {
            "Draw a straight line", 
            "Draw an ellipse", 
            "Draw a curve", 
            "REraser", 
            "Eraser", 
            "Drag line", 
            "Triangle", 
            "Draw a sphere", 
            "Brush", 
            "Airbrush",
            "Dice", 
            "3D Rectangle", 
            "3D Circle", 
            "3D Triangle", 
            "Iterative Fractal", 
            "Modern Fractal", 
            "Maple Leaf", 
            "Drawing Tree", 
            "Mandelbrot Set", 
            "L -System", 
            "Iterative line drawing", 
            "Iterative triangle", 
            "Sierpinski carpet", 
            "Drawing characters", 
            "Empty", "Straw" ,
            "Rectangle",
            "Five-pointed star",
            "Multi-line",
            " character"
        };
        JPanel jp1 = new JPanel(new GridLayout(15, 2,10,10));//Used to save graphic buttons, use grid layout
        jp1.setPreferredSize(new Dimension(200, 800));
        
        //Loop to add buttons to the button panel
        for (int i = 0; i < buttonName.length; i++) {
            JButton jbutton = new JButton(buttonName[i]);
            jbutton.addActionListener(dl);//Add a listener to the button
            jp1.add(jbutton);
        }
        
        JPanel jp2=new JPanel();//Canvas panel
        jp2.setPreferredSize(new Dimension(970, 800));
        jp2.setBackground(Color.WHITE);
        

        //  Define the Color array to store the color information to be displayed on the button
        Color[] colorArray = { Color.BLUE, Color.GREEN, Color.RED, Color.BLACK,Color.ORANGE,Color.PINK,Color.CYAN,Color.MAGENTA,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,Color.YELLOW};
        //Panel for saving color buttons
        JPanel jp3=new JPanel(new GridLayout(1,colorArray.length,3,3));
        //  Loop through the colorArray array and instantiate the button object according to the elements in the array
        for (int i = 0; i < colorArray.length; i++) {
            JButton button = new JButton();
            button.setBackground(colorArray[i]);
            button.setPreferredSize(new Dimension(30, 30));
            button.addActionListener(dl);//Add a listener to the button
            jp3.add(button);
        }
        //Add the panel to the main form
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        //Add button as current color
        JButton nowColor=new JButton();
        nowColor.setPreferredSize(new Dimension(40,40));
        nowColor.setBackground(Color.BLACK);//Default black
        add(nowColor);
        //Set the components of the form to be visible, if it is FALSE, no components are visible
        setVisible(true);    
        //Get the brush object
        g=jp2.getGraphics();
        dl.setG(g);
        dl.setNowColor(nowColor);
        //Get the saved collection
        shapesArray=dl.getShapesArray();
        //Add mouse monitor to the panel for drawing graphics
        jp2.addMouseListener(dl);
        jp2.addMouseMotionListener(dl);
    }
    @Override
    //Override the paint method
    public void paint(Graphics g) {
        //Call the paint method of the parent class to draw the components on the interface
        super.paint(g);
        //foreach traverse the collection
        for (NetJavaShape l : shapesArray) {
            l.draw();
        }
    }

} 