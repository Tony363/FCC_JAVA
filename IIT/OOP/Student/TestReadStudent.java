package IIT.OOP;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadStudent{
    public static void main(String[] args){
        try{
            FileInputStream f = new FileInputStream("student.dat");
            ObjectInputStream o = new ObjectInputStream(f);
            
            Student s = (Student)o.readObject();
            System.out.println(s);
            o.close();
            f.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}