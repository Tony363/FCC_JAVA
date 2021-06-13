package IIT.OOP;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

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
    public static HashSet<String> getSet(ArrayList<String> words){
        // constuct a set of the words
        HashSet<String> distinct_words = new HashSet<String>(words);
        return distinct_words;
    }
    public static HashMap<String, Integer> freqTable (ArrayList<String> words) {
        // construct a word-counter map
        HashMap<String,Integer> histogram = new HashMap<String,Integer>();
        for (String w: words){
            if (histogram.containsKey(w)){
                int value = histogram.get(w);
                histogram.put(w,value+1);
            }else{
                histogram.put(w,1);
            }
        }
        return histogram;
    }
    public static void main(String[] args){
        String line = getLine();
        ArrayList<String> words = getWords(line);
        HashSet<String> distinct_words = getSet(words);
        HashMap<String,Integer> histogram = freqTable(words);
        System.out.println("\nGot the words");
        for (String w: words){
            System.out.println(w);
        }
        System.out.println("\nGot the distinct words");
        for (String w: distinct_words){
            System.out.println(w);
        }
        System.out.println("\nGet Freq Table");
        for (String w : histogram.keySet()){
            String key = w.toString();
            String value = histogram.get(w).toString();
            System.out.println(key + " " + value);
        }
        
    }
}