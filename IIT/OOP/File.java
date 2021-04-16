package IIT.OOP;
import java.util.Scanner;

public class File{
    private String name = null;
    private static final String INV = "INVALID VALUE";
    public File(){}
    public File(Object name){
        if (isValidName(name)){
            String temp = (String)name;
            this.name = temp;
        }else{
            // this.name = null;
            System.out.println(INV);
        }
    }
    static boolean isValidName(Object name){
        if (name instanceof String){
            return ((String)name) == null || !(((String)name).trim().isEmpty());
        }
        return name == null;
    }
    String getName(){
        String Name = this.name;
        return Name;
    }
    void setName(Object name){
        if (isValidName(name)){
            String temp = (String)name;
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
            return this.getName().hashCode() == d.getName().hashCode(); 
        }
        return false;
    }
    String extName(){
        if (this.getName() == null || this.getName().indexOf('.') == -1 ){
            return null;
        }
        return this.getName().substring(this.getName().lastIndexOf(".")+1);
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