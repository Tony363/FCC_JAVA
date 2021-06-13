package IIT.OOP;

public class TestStudent{
    public static void main(String[] args){
        Student s1 = new Student("123","John","IIT-SE");
        Student s2 = new Student("321","Mary","IIT-AI");
        Student s3 = new Student("123","John","IIT-SE");
        System.out.printf("s1==s2? %b\n", s1.equals(s2));
        System.out.printf("s2==s3? %b\n", s2.equals(s3));
        System.out.printf("s1==s3? %b\n", s1.equals(s3));
        
        GradStudent g1 = new GradStudent("123","John","CSIE","IIT-SE");
        GradStudent g2 = new GradStudent("321","Mary","CSIE","IIT-AI");
        GradStudent g3 = new GradStudent("123","John","CSIE","IIT-SE");
        
        System.out.printf("g1==g2? %b\n", g1.equals(g2));
        System.out.printf("g2==g3? %b\n", g2.equals(g3));
        System.out.printf("g1==g3? %b\n", g1.equals(g3));

        System.out.printf("s1==g1? %b\n", s1.equals(g1));

        // type compatibility
        Student s4 = g1;
        System.out.println(s4.toString()); // done to object type not reference type
        System.out.println(s4.equals(s1));
        System.out.println(s1.equals(s4));


    }
}