package IIT.OOP;
import java.util.Scanner;

public class getWidthHeight{
    private int width,height;
    private Scanner scanner;
    getWidthHeight() {
        Scanner s = new Scanner(System.in);
        this.scanner = s;
    }
    public int getWidth() {
        System.out.println("Please Enter Width: ");
        this.width = this.scanner.nextInt();
        return this.width;
    }
    public int getHeight(){
        System.out.println("Please Enter Height: ");
        this.height = this.scanner.nextInt();
        return this.height;
    }
}