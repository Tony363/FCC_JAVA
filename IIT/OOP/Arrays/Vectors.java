package IIT.OOP;
import java.util.Vector;
import java.util.Scanner;
import java.util.Collections;
public class Vectors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vd = new Vector<Integer>();
        while (sc.hasNext()){
            vd.add(Integer.valueOf(sc.nextInt()));
        }
        for (int i : vd){
            System.out.printf("%d ",vd.get(i));
        }
        for (int i=vd.size(); --i >= 0;){
            System.out.printf("%d ",vd.get(i));
        }
        Collections.reverse(vd);
        System.out.println(vd);
        vd.clear();
        System.out.println(vd);
    }
}