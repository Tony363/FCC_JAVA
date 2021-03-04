package IIT.OOP;
import java.util.Scanner;

public class reverseInput{
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Please Enter Number of Inputs");
            return;
        }
        int[] memo = new int[Integer.parseInt(args[0])];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < Integer.parseInt(args[0]);i++){
            int input = s.nextInt();
            memo[i] = input;
        }
        for (int i = 0; i < memo.length;i++){
            System.out.println(memo[(memo.length-1)-i]);
        }
    }
}