package src.sand.box;

public class ArrayConcat{
    private static int[] Concat(int[] a, int[] b) {
        int[] New = new int[a.length + b.length];
        System.arraycopy(a,0,New,0,a.length);
        System.arraycopy(b,0,New,a.length,b.length);
        return New;
    }
    public static void PrintConcat(int[] c){
        for(Object C:c){
            System.out.println(C);
        }
    }
    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = Concat(a,b); 
        PrintConcat(c);
    }
}