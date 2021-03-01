package IIT.OOP;

public class odd{
    public static void main(String[] args) {
        for (int i=0;i<Integer.parseInt(args[0]);i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}