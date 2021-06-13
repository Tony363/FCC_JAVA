package IIT.OOP;
import java.io.Serializable;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Employee implements Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    
    public Employee(){};
    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}

public class Serialize{
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try{
            FileOutputStream fileOut = new FileOutputStream("./ser/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /ser/employee.ser");
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}