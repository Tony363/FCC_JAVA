package IIT.OOP;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.PrintWriter;

public class Matrix{
    Matrix(){}
    public static double[][] readMatrix(FileReader f){
        Scanner sc = new Scanner(f);
        int M = sc.nextInt();
        int N = sc.nextInt();
        double[][] m = new double[M][N];
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                m[i][j] = sc.nextDouble();
            }
        }
        return m;
    }
    public static void writeMatrix(double[][] m,FileWriter f){
        PrintWriter p = new PrintWriter(f);
        p.printf("%d %d\n",m.length,m[0].length);
        for(double[] row : m){
            for(double col : row){
                p.printf("%f ",col);
            }
            p.println();
        }
        p.println();
    }
    public static void printMatrix(double[][] m){
        for(double[] row : m){
            for(double col : row){
                System.out.printf("%f ",col);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static double[][] mul(double[][] m1,double[][] m2){
        // assume that m1 is NxM and m2 is MxL (no error handling)
        int N = m1.length-1;
        int M = m1[0].length-1;
        int L = m2[0].length-1;
        if (M!=L){
            System.out.println("invalid dimensions");
            System.exit(-1);
        }
        double[][] r = new double[N][L];
        for(int i=0; i<N; i++){
            for (int j=0; j<L; j++){
                for(int k=0; k<M; k++){
                    r[i][j] += m1[i][k] * m2[k][j];
                }
            }            
        }
        return r;
    }
}