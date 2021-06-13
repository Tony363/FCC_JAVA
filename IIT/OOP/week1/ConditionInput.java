package IIT.OOP;
import java.util.Scanner;

public class ConditionInput{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Input Values:");
        int input =s.nextInt();
        int i=0,maxlen=20; int[] array = new int[maxlen];
        while(input != 0 && input > 0 && i < maxlen){
            array[i] = input;
            input = s.nextInt();
            // System.out.println(Math.signum(input));
            i++;
        }
        System.out.println("printing inputs in reverse order:");
        for (int j=i-1; j >= 0; j--){
            System.out.println(array[j]);
        }
    }
}
