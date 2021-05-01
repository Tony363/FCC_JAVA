package src.sand.box;
import java.util.Scanner;
public class dots{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String a = input.trim();
        System.out.println(a);
        if (a.charAt(a.length() -1)=='.'){
            System.out.println("declarative");
        }

    }
}