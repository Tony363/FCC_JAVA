package IIT.OOP;
import java.util.Arrays;

public class set01{
    static void setArray(int[][] a){
        int count = 0;
        for(int[] row:a){
            if (count % 2 == 0){
                Arrays.fill(row,0);
            }else{
                Arrays.fill(row,1);
            }
            count ++;
        }     
    }

    public static void main(String[] args){
        int[][] a = new int[2][3];
        int[][] b = {{0,0,0}, {1,1,1}};
        setArray(a);
        System.out.println(Arrays.deepEquals(a, b));
    }
}