package IIT.OOP;

public class rectangles{
    private int H,W;
    rectangles(){

    }
    public void takeWH(String[] args){
        if (args.length != 2){
            getWidthHeight input = new getWidthHeight();
            this.W = input.getWidth();
            this.H = input.getHeight();
        } else {
            this.H = Integer.parseInt(args[0]);
            this.W = Integer.parseInt(args[1]);
        }
    }
    public int getH(){
        return this.H;
    }
    public int getW(){
        return this.W;
    }
    public static void main(String[] args){
        rectangles rect = new rectangles();
        rect.takeWH(args);
        printRectangle print = new printRectangle(rect);
        print.printing();
    }
}