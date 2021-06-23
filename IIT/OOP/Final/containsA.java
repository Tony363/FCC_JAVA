package IIT.OOP.Final;
import java.util.Scanner;
import java.util.ArrayList;
public class containsA{
    public static void main(String[] args){
        Scanner sc = new Scanner("abc def ghi fed cba");
        ArrayList<String> arr = new ArrayList<String>();
        while(sc.hasNext()){
            String str = sc.next();
            if (str.indexOf("a")>=0){
                arr.add(str);
            }
        }
        for(int i=arr.size();--i>=0;){
            System.out.println(arr.get(i));
        }
    }
}