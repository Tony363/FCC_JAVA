package IIT.OOP;
import java.util.Scanner;

public class UserID{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String UserID = sc.nextLine().trim();
        if (UserID.contains(" ")){
            System.out.println("White space is not allowed");
        }else if (UserID.length() >= 6 && UserID.length() <= 8){
            System.out.printf("Welcome %s",UserID);
        }else {
            System.out.println(" Sorry, user ID invalid");
        }
    }
}