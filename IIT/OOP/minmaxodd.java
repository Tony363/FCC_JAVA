package IIT.OOP;
import java.util.Collections;
import java.util.Arrays;

public class minmaxodd{
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Please enter Int M & N:");
        }
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int min = Math.min(M,N);
        int max = Math.max(M,N);
        for (int i=min;i<max;i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}