package IIT.OOP.Final;
import java.util.Scanner;
import java.util.Arrays;

public class alphabetOrder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char arr[] = sentence.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));
    }
}