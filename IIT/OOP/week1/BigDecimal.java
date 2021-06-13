package IIT.OOP;
import java.util.Scanner;
import java.math.BigInteger;

public class BigDecimal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(),n2 = scanner.nextInt();
        BigInteger result=new BigInteger("1");
        int i=(n1>n2)?n2:n1,j=(n1>n2)?n1:n2;
        for (;i<=j;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}