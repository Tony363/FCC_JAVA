package IIT.OOP;

public class inrange{
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Please Enter M < N input range");
            return;
        }
        for (int i=Integer.parseInt(args[0]);i<Integer.parseInt(args[1]);i++){
            System.out.println(i);
        }
    }
}