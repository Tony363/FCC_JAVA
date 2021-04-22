package IIT.OOP;
import java.util.Scanner;

public class File{ // file name could be white space
    private String name = null;
    private static final String INV = "INVALID VALUE";
    public File(){}
    public File(String name){
        if (isValidName(name)){
            String temp = name;
            this.name = temp;
        }else{
            System.out.println(INV);
        }
    }
    static boolean isValidName(String name){
        return name == null || !name.isEmpty();
    }
    String getName(){
        String Name = this.name;
        return Name;
    }
    void setName(String name){
        if (isValidName(name)){
            String temp = name;
            this.name = temp;
        }else{
            System.out.println(INV);
        }
    }
    @Override // check method signature, make sure signature already defined
    public String toString(){
        return String.format("%s",this.getName());
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof File){
            File d = (File)o;
            return this.getName() == d.getName(); // this.getName() can be null
        }
        return false;
    }
    String extName(){
        if (this.getName() == null || this.getName().indexOf('.') == -1 ){
            return null;
        }
        return this.getName().substring(this.getName().lastIndexOf(".")+1);
    }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        File f1 = new File();
        f1.setName("Test.java");
        System.out.println("="+f1.getName()+"=");
        System.out.println("="+f1+"=");
        f1.setName("Test.java  ");
        System.out.println("="+f1.getName()+"=");
        System.out.println("="+f1+"=");
        f1.setName(" Test.java");
        System.out.println("="+f1.getName()+"=");
        System.out.println("="+f1+"=");
        f1.setName(" Test.java    ");
        System.out.println("="+f1.getName()+"=");
        System.out.println("="+f1+"=");
        f1.setName("Test HELLO.java");
        System.out.println("="+f1.getName()+"=");
        System.out.println("="+f1+"=");
        f1.setName(" $Test @HELLO.javafilename");
        System.out.println("="+f1.getName()+"=");
        System.out.println("="+f1+"=");
        f1.setName("");
        System.out.println("="+f1.getName()+"=");
        System.out.println("="+f1+"=");
        f1.setName(null);
        System.out.println("="+f1.getName()+"=");
        System.out.println("="+f1+"=");
    }
}