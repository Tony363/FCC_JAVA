package IIT.OOP;
import java.util.Scanner;

public class TwoDarrays{
    /**
     *  
     * @param M rows int
     * @param N cols int
     * @param matrix 2d array
     */
    int[][] matrix;
    public void populate(){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        this.matrix = new int[M][N];
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                this.matrix[i][j] = sc.nextInt();
            }
        }
    }
    public void printM(){
        System.out.printf("[");
        for (int i=0;i<this.matrix.length;i++){
            System.out.printf("[");
            for (int j=0;j<this.matrix[0].length;j++){
                System.out.printf("%d,",this.matrix[i][j]);
            }
            System.out.printf("]");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args){
        TwoDarrays Td = new TwoDarrays();
        Td.populate();
        Td.printM();
    }   
}