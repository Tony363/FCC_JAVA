package IIT.OOP;
import java.util.Scanner;
import java.util.Collection;

public class Nvalues{
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Please Enter N values:");
        }
        int Nvalues = Integer.parseInt(args[0]);
        int smallest = Integer.MIN_VALUE;
        int largest = Integer.MAX_VALUE;
        
        Scanner s = new Scanner(System.in);
        int total = 0;int i;
        for (i = 0; i < Nvalues; i++){
            System.out.println("Please enter input:");
            int input = s.nextInt();
            
            if (i == 0){
                largest = input;
                smallest = input;
            }
            if (input > largest){
                largest = input;
            }
            if (input < smallest){
                smallest = input;
            }
            total += input;
        }

        System.out.printf("Sum %d\n",total);
        System.out.printf("Average %d\n",total/i);
        System.out.printf("Max %d\n",largest);
        System.out.printf("Min %d\n",smallest);
    }
}