package IIT.OOP.Final;
import java.util.*;
import java.util.regex.Pattern;

public class SkipScanner{
    public static void main(String[] args){
        String str = "what the fuck!";
        Scanner scanner = new Scanner(str);
        System.out.println(str);
        scanner.skip("wh");
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.findWithinHorizon("!",26));
        String str1 = "what the crap fucking douche!";
        Scanner sc = new Scanner(str1);
        System.out.println(sc.findInLine("what"));
        System.out.println(sc.next());
        System.out.println(sc.findInLine("fucking"));
        System.out.println(sc.next());
    }   
}