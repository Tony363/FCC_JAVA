package IIT.OOP;

public class printRectangle{
    private int w,h;
    printRectangle(int w, int h){
        this.w = w;
        this.h = h;
    }
    printRectangle(rectangles rect){
        this.w = rect.getH();
        this.h = rect.getW();
    }
    public void printing(){
        for (int i=0;i<this.h;i++){
            for (int j=0;j<this.w;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}