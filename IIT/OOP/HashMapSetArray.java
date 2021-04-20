package IIT.OOP;
import java.util.Scanner;
import java.util.ArrayList;

public class HashMapSetArray{
    public static String getLine(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }
    public static ArrayList<String> getWords(String line){
        Scanner word_sc = new Scanner(line);
        ArrayList<String> words = new ArrayList<String>();
        while (word_sc.hasNext()){
            String word = word_sc.next();
            words.add(word);
        }
        return words;
    }
    public static void main(String[] args){
        String line = getLine();
        ArrayList<String> words = getWords(line);
        System.out.println("Got the words");
        for (String w: words){
            System.out.println(w);
        }
    }
}