package IIT.OOP;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class readFile{
    int[][] matrix;
    int M,N;
    readFile(){}
    /**
     *  
     * @param M rows int
     * @param N cols int
     * @param matrix 2d array
     */
    void populate(File f){
        if (f == null){return;}
        try{
            Scanner sc = new Scanner(f);
            this.M = sc.nextInt();
            this.N = sc.nextInt();
            this.matrix = new int[M][N];
            for (int i=0;i<this.M;i++){
                for (int j=0;j<this.N;j++){
                    this.matrix[i][j] = sc.nextInt();
                }
            }
        }catch (FileNotFoundException notfound){
            System.err.println(notfound.getMessage());
            Scanner sc = new Scanner(System.in);
            this.M = sc.nextInt();
            this.N = sc.nextInt();
            this.matrix = new int[M][N];
            for (int i=0;i<this.M;i++){
                for (int j=0;j<this.N;j++){
                    this.matrix[i][j] = sc.nextInt();
                }
            }
            notfound.printStackTrace();
        }finally{
            System.out.println("Matrix read");
        }
        
    }
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
        for (int[] i :this.matrix){
            System.out.printf("[");
            for (int j:i){
                System.out.printf("%d,",j);
            }
            System.out.printf("]");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args){
        try{
            readFile Td = new readFile();
            Td.populate(new File(args[0]));
            Td.printM();
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }   
}