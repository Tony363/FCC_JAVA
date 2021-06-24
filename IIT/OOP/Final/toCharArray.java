package IIT.OOP.Final;
import java.util.Arrays;
public class toCharArray{
    public static char[] convert(String str){
        return (str!=null&&str.length()>0)?str.toCharArray():null;
    }
    public static void main(String[] args){
        char[] hello = {'H','e','l','l','o'};
        System.out.println(Arrays.equals(convert("Hello"),hello));
    }
}