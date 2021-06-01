package IIT.OOP;
import java.util.Arrays;
import java.util.Comparator;
public class CmpStudents{
    public static Student[] createStudentArray(){
        Student s1 = new Student("123","Name1","IIT");
        Student s2 = new Student("543","Name2","IIT");
        Student s3 = new Student("223","Name3","IIT");
        Student s4 = new Student("098","Name4","IIT");
        Student[] sa = {s1,s2,s3,s4};
        return sa;
    }
    public static void main(String[] args){
        try{
            Student[] sa = createStudentArray();
            StudentComparator c = new StudentComparator();
            Arrays.sort(sa,c);
            for (Student s: sa){
                System.out.println(s.getID());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

class StudentComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if (s1==null && s2 == null){return 0;}
        if (s1!=null){
            return s1.getID().compareTo(s2.getID());
        }
        return -1;
    }  
    @Override
    public boolean equals(Object o){
        if (o == null){return false;}
        return this.getClass()==o.getClass();
    }
}