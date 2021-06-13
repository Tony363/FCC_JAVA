package IIT.OOP;
import java.util.Scanner;

public class reverseInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int []memo = new int[20];
        int i;
        for (i=0; i<memo.length; i++){
            memo[i] = scanner.nextInt();
            if(memo[i] <= 0 ){
                break;
            }
        }
        for (; --i>=0;){
            System.out.println(memo[i]);
        }
    }
}