package src.sand.box;

public class stackArrays{
    public static int[] make2(int[] a, int[] b) {
        int[] New = new int[2];
        if (a.length >= 2){
          New[0] = a[0];New[1] = a[1];
        }else if (a.length == 0){
          New[0] = b[0];New[1] = b[1];
        }else if (a.length == 1){
          New[0] = a[0];New[1] = b[0];
        }
        return New;
    } 
    public static void print(int a){
        System.out.println(a);
    }
    public static void  print(int[] c){
        for(Object C:c){
            System.out.println(C);
        }
    }
    public static void main(String[] args){
        // int[] a = new int[0];
        int[] a = {4};
        int[] b = {1,2,3};
        int[] c = make2(a,b);
        print(c);

    }
}