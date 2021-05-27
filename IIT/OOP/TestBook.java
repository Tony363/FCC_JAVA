package IIT.OOP;
public class TestBook{
    public static void main(String[] args){
        try{ // play with hashCode hashMap, and implement this through pure interface
            // first coding assignment follow from textbook implement equals 
            // second assignment follow strict approach implement equals according to API spec
            // third assignment implement completely to work with hashMap with hashCode

            Book b1 = new EBook("12345",30000,"OOP","https://down.load/oop");
            Book b2 = new PrintBook("67890",30000,"OOP","180, Lin wei rd");
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b1.equals(b2));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}