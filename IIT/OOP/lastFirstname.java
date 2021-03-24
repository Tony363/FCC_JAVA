package IIT.OOP;
import java.util.Scanner;

public class lastFirstname{
    public static void main(String[] args){
        String firstname,lastname;
        Scanner s = new Scanner(System.in);
        firstname = s.next();
        lastname = s.next();
        System.out.println(lastname.toUpperCase()+", "+firstname);
    }
}