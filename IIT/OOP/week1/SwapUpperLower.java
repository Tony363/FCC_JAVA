package IIT.OOP;
import java.util.Scanner;
public class SwapUpperLower{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] n = scanner.nextLine().toCharArray();
        for (char c:n){
            if (Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }else if (Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }  
            System.out.printf("%c",c);
        }
    }
}