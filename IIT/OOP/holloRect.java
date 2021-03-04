package IIT.OOP;

public class holloRect{
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Please enter [w][h]:");
            return;
        }
        int w = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        // System.out.println(h/2);
        // System.out.println(w/2);
        for (int i = 0; i < h;i++){
            for (int j = 0; j < w;j++){
                if ((i != 0 && i != (h-1)) && (j != 0 &&  j != (w-1)) && (i!=(h/2)||j!=(w/2))){
                    System.out.printf(" ");
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
        
}