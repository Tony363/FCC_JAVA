package IIT.OOP;
import java.io.FIleReader;
import java.io.File.Writer;
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
        int N = m1.length;
        int M = m1[0].length;
        int L = m2[0].length;
        double[][] r = new double[N][L];
        for(int i=0; i<N; i++){
            double vij = 0;
            for(int j=0; j<M; j++){
                vij += m1[i][k] * m2[k][j];
            }
            r[i][j] = vij;
        }
        return r;
    }
}