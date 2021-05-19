package IIT.OOP;
import java.util.*;

public class percentBool{
    static double percentageFalse(boolean[][] a){
        double count = 0,total = 0;
        List<Boolean> A = new ArrayList<Boolean>(a);
        for (Boolean[] row : A){
            count += (double)(Collections.frequency(Arrays.asList(row),false));
            total += (double)(Collections.frequency(Arrays.asList(row),true));
        }
        System.out.println(count);
        System.out.println(total);
        return (total!=0)?(count/total)*100:0;
    }
    public static void main(String[] args){
        boolean [][] a = { { true, false, false, true },
                   { true, true },
                   { false, true },
                   { false, false, false, false, false },
                   { true, false } };
        System.out.println(percentageFalse(a));
    }
}