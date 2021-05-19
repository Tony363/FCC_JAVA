package IIT.OOP;
import java.util.Arrays;

public class set01{
    static void setArray(int[][] a){
        for(int i=0;i<a.length;i++){Arrays.fill(a[i],i%2);}     
    }

    public static void main(String[] args){
        int[][] a = new int[2][3];
        int[][] b = {{0,0,0}, {1,1,1}};
        setArray(a);
        System.out.println(Arrays.deepEquals(a, b));
    }
}