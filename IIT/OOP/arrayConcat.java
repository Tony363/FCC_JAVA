package IIT.OOP;
import java.util.Arrays;
public class arrayConcat{
    static String[] toStrings(char[][] a){
        // for (int i=0;i<a.length-1;i++){
        //     String temp = new String(a[i]);
        //     str[i] = temp;
        // }
        String[] str = new String[a.length];
        int count = 0;
        for (char[] carr:a){
            String temp = new String(a[count]);
            str[count] = temp;
            count ++;
        }
        for (String s: str){
            System.out.println(s);
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