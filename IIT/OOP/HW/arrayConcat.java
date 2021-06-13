package IIT.OOP;
import java.util.Arrays;
public class arrayConcat{
    static String[] toStrings(char[][] a){
        String[] str = new String[a.length];
        for (int i=0;i<a.length;i++){
            str[i] = String.valueOf(a[i]);
        }
        return str;
    }

    public static void main(String[] args){
        char [][] letters = { { 'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' },
                { 'i', 's' },
                { 'n', 'o', 't' },
                { 'a' },
                { 's', 'p', 'e', 'c', 't', 'a', 't', 'o', 'r' },
                { 's', 'p', 'o', 'r', 't', '!' } };
        String[] strings = {"Programming", "is", "not", "a", "spectator", "sport!"};
        System.out.println(Arrays.deepEquals(toStrings(letters), strings)); 
    }
}