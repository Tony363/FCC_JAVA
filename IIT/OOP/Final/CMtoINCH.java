package IIT.OOP.Final;
import java.lang.IllegalArgumentException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CMtoINCH{
    public static void convert(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println((Double.valueOf(sc.next()))*2.54);
        }catch(InputMismatchException ie){
            throw new InputMismatchException("received no input");
        }
    }
    public static void main(String[] args){
        convert(); 
    }  
}