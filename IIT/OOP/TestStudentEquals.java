package IIT.OOP;

public class TestStudentEquals{
    public static void main(String[] args){
        try{
            Student s = new Student("123","Name1","Dept1");
            GradStudent g = new GradStudent("123","Name1","Dept1","IIT-SE");
            GradStudent g2 = new GradStudent("123","Name1","Dept1","IIT-SE");
            System.out.println(s.equals(g));
            System.out.println(g.equals(s));
            System.out.println(g.equals(g2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}