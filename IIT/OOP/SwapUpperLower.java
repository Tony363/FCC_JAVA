package IIT.OOP;
import java.util.Scanner;
public class SwapUpperLower{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] name = scanner.nextLine().toCharArray();
        for (char c:name){
            if (Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }else if (Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }  
        }
        System.out.println(name);
    }
}