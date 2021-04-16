package IIT.OOP;

public class File{
    private String name;
    private static final String INV = "INVALID VALUE";
    File(){
        this.name = null;
    }
    File(Object name){
        if (this.isValidName(name)){
            String temp = (String)name;
            this.name = temp;
        }else{
            this.name = null;
            System.out.println(INV);
        }
    }
    Boolean isValidName(Object name){
        if (name instanceof String){
            return !(((String)name).trim().isEmpty());
        }
        return  name == null;
    }
    String getName(){
        return this.name;
    }
    void setName(Object name){
        if (this.isValidName(name)){
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
            return this.getName().equals(d.getName()); 
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