package IIT.OOP;

public class percentBool{
    static double percentageFalse(boolean[][] a){
        int count = 0,total = 0;
        for (boolean[] row : a){
            for (boolean col: row){
                if (!col){
                    count ++;
                }
                total ++;
            }
        }
        return (total!=0)?((double)count/(double)total)*100:0;
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