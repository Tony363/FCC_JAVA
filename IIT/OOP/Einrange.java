package IIT.OOP;

public class Einrange{
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Please Enter M < N input range");
            return;
        }
        for (int i=Integer.parseInt(args[0]);i<Integer.parseInt(args[1]);i++){
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}