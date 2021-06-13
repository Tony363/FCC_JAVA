package IIT.OOP;
import java.util.Scanner;

public class TwoDarrays{
    int[][] matrix;
    int M,N;
    TwoDarrays(){}
    /**
     *  
     * @param M rows int
     * @param N cols int
     * @param matrix 2d array
     */
    void populate(){
        Scanner sc = new Scanner(System.in);
        this.M = sc.nextInt();
        this.N = sc.nextInt();
        this.matrix = new int[M][N];
        for (int i=0;i<this.M;i++){
            for (int j=0;j<this.N;j++){
                this.matrix[i][j] = sc.nextInt();
            }
        }
    }
    /**
     * print object matrix
     */
    void printM(){
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