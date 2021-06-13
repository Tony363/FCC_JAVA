package IIT.OOP;

public class astericksLine{
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Please Enter Int:");
            return;
        }
        for (int i=0;i<Integer.parseInt(args[0]);i++){
            System.out.printf("*");
        }
        System.out.println();
    }
}