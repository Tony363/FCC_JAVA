package IIT.OOP.Student;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestWriteStudent{
    public static void main(String[] args){
        try{
            FileOutputStream f = new FileOutputStream("student.dat");
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            Student s = new Student("123","Name1","IIT");
            o.writeObject(s);
            o.close();
            f.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}