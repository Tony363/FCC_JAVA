package IIT.OOP;


public class Kintervals{
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Please enter M N range:");
        }
        int M = Integer.parseInt(args[0]);int N = Integer.parseInt(args[1]);
        int min = Math.min(M,N);int max = Math.max(M,N);
        int count=0;
        for (;min<max;min++){
            count ++;
        }
        System.out.println(count);
    }
}