package IIT.OOP;
import java.util.Scanner;

public class Kintervals{
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Please enter M N range:");
            return;
        }
        int n = Integer.parseInt(args[0]);int m = Integer.parseInt(args[1]);
        Scanner s = new Scanner(System.in);int interval = s.nextInt();
        int min = Math.min(m,n);int max = Math.max(m,n);
        double M  = min;
        double N = max;
        double Kintervals = (N-M)/(double)interval;
        System.out.println(Kintervals);
        
        for(;M<N;M+=Kintervals){
            System.out.println(M);
        }
    }
}