package IIT.OOP.Final;
import java.util.Scanner;
public class punctuation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();
        switch (sentence.charAt(sentence.length()-1)){
            case '.': 
                System.out.println("declarative");
                break;
            case '!': 
                System.out.println("exclamatory");
                break;
            case '?':
                System.out.println("interrogative");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}