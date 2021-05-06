package IIT.OOP;
import java.io.FileReader;
import java.io.FileWriter;

public class MatMul{
    public static void main(String[] args){
        try{
            if (args.length<3){
                System.err.println("Need input matrix files and output file");
                exit(-1);
            }
            double[][] m1 = Matrix.readMatrix(new FileReader(args[0]));
            double[][] m2 = Matrix.readMatrix(new FileReader(args[1]));
            Matrix.printMatrix(m1);
            Matrix.printMatrix(m2);
            double[][] m3 = Matrix.mul(m1,m2);
            Matrix.printMatrix(m3);
            Matrix.writeMatrix(m3,newFileWriter(args[2]));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}