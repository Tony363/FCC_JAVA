package IIT.OOP;

public class rectangles{
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Please Enter W H:");
            return ;
        }
        int H = Integer.parseInt(args[0]);
        int W = Integer.parseInt(args[1]);
        for (int i=0;i<H;i++){
            for (int j=0;j<W;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}