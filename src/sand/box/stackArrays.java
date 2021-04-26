package src.sand.box;

public class stackArrays{
    private static int[] make2(int[] a, int[] b) {
        int[] New = new int[2];
        int i=0;
        while(i<(a.length<2?a.length:2)){
          New[i] = a[i];
          i++;
        }
        // print(i);
        if (i >= 2){
            return New;
        }
        // print(New);
        for (int j=0;j<((Math.abs(b.length-1)-(a.length-1))<2?(Math.abs(b.length-1)-(a.length-1)):1);j++){
          New[i+j] = b[j];
          if (i+j >= 2){
              return New;
          }
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