package IIT.OOP.Final;
import java.util.Scanner;

public class parseDouble{
    public parseDouble(){};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        Double v = Double.parseDouble(num);
        if (v > 3.4 && v < 4.4){
            System.out.printf("%s is in range",num);
        }else{
            System.out.printf("%s is not in range",num);
        }
    }
}