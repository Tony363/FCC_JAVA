package IIT.OOP;
public class CourseGrade {
    private String courseName = "TBD";
    private char letterGrade = 'B';
    private static final String INV = "INVALID VALUE";
    public CourseGrade(){}
    public CourseGrade(String course,char letter){ // problem with to check char parameter as object
        if (isValidCourse(course) && isValidGrade(letter)){
            this.courseName = course;
            this.letterGrade = letter;
        }else {
            if (isValidCourse(course)){
                this.courseName = course;
            }
            if (isValidGrade(letter)){
                this.letterGrade = letter;
            }
            System.out.println(INV);
        }
    }
    private static boolean isValidCourse(String str){
        if (str == null){
            return false;
        }
        return str.trim().equals(str) && !str.isEmpty();
    }
    private static boolean isValidGrade(char grade){
        return (grade >= 'A' && grade <= 'D') || (grade == 'F');
    }
    public String getCourseName(){
        String course = this.courseName;
        return course;
    }
    public char getLetterGrade(){
        char grade = this.letterGrade;
        return grade;
    }
    public void setCourseName(String course){
        if (isValidCourse(course)){
            String temp = course;
            this.courseName = temp;
        }else{
            System.out.println(INV);
        }
    }
    public void setLetterGrade(char grade){
        if (isValidGrade(grade)){
            char temp = grade;
            this.letterGrade = temp;
        }else {
            System.out.println(INV);
            // throw new IllegalArgumentException();
        }
    }
    @Override // check method signature, make sure signature already defined
    public String toString(){
        return String.format("%s: %c",this.getCourseName(),this.getLetterGrade());
    }
    @Override
    public boolean equals(Object o){
        if (o == null){
            return false;
        }
        if (o instanceof CourseGrade){
            CourseGrade d = (CourseGrade)o;
            return (this.getLetterGrade() == d.getLetterGrade()
            && this.getCourseName().equals(d.getCourseName())); 
        }
        return false;
    }
    @Override
    public int hashCode(){
        return this.courseName.hashCode();
    }
    public static void main(String[] args){
        CourseGrade g = new CourseGrade("\\",'\0');
        CourseGrade h = new CourseGrade("\\",'\0');
        CourseGrade N = null;
        System.out.println("="+g.getCourseName()+"=");
        System.out.println("="+g.getLetterGrade()+"=");
        System.out.println("="+g+"=");
        System.out.println("="+g.equals(N)+"=");
        System.out.println("="+g.equals(h)+"=");
        // g.setCourseName("Test.java");
        // System.out.println("="+g.getCourseName()+"=");
        // System.out.println("="+g+"=");
        // g.setCourseName("Test.java  ");
        // System.out.println("="+g.getCourseName()+"=");
        // System.out.println("="+g+"=");
        // g.setCourseName(" Test.java");
        // System.out.println("="+g.getCourseName()+"=");
        // System.out.println("="+g+"=");
        // g.setCourseName(" Test.java    ");
        // System.out.println("="+g.getCourseName()+"=");
        // System.out.println("="+g+"=");
        // g.setCourseName("Test HELLO.java");
        // System.out.println("="+g.getCourseName()+"=");
        // System.out.println("="+g+"=");
        // g.setCourseName(" $Test @HELLO.javafilename");
        // System.out.println("="+g.getCourseName()+"=");
        // System.out.println("="+g+"=");
        // g.setCourseName("");
        // System.out.println("="+g.getCourseName()+"=");
        // System.out.println("="+g+"=");
        // g.setCourseName(null);
        // System.out.println("="+g.getCourseName()+"=");
        // System.out.println("="+g+"=");
    }
}