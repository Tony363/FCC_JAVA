package IIT.OOP.Final;
import java.util.Scanner;
public class containsAT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        while(!word.contains("@")){
            word = sc.next();
        }
        System.out.println(word);

    }
}