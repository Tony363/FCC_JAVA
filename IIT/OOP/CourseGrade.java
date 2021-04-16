package IIT.OOP;

public class CourseGrade {
    private String courseName;
    private char letterGrade;
    private static final String INV = "INVALID VALUE";
    CourseGrade(){
        this.courseName = "TBD";
        this.letterGrade = 'B';
    }
    CourseGrade(String course,char letter){
        if (this.isValidCourse(course) && this.isValidGrade(letter)){
            String temp = course;char tempG = letter;
            this.courseName = temp;this.letterGrade = tempG;
        }else {
            System.out.println(INV);
        }
        this.courseName = "TBD";
        this.letterGrade = 'B';
    }
    Boolean isValidCourse(String str){
        return str.trim().equals(str) ? true: false;
    }
    Boolean isValidGrade(char grade){
        return (grade != ' ') && (isAlphaNumeric(grade));
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
        if (this.isValidCourse(course)){
            String temp = course;
            this.courseName = temp;
        }else{
            System.out.println(INV);
        }
    }
    public void setLetterGrade(char grade){
        if (this.isValidGrade(grade)){
            char temp = grade;
            this.letterGrade = temp;
        }else {
            System.out.println(INV);
        }
    }
    @Override // check method signature, make sure signature already defined
    public String toString(){
        return String.format("%s: %c",this.getCourseName(),this.getLetterGrade());
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof CourseGrade){
            CourseGrade d = (CourseGrade)o;
            return (this.getLetterGrade() == d.getLetterGrade()
            && this.getCourseName().equals(d.getCourseName())); 
        }
        return false;
    }
    public static boolean isAlphaNumeric(char char1) {
        return (char1 >= 'A' && char1 <= 'D') || (char1 == 'F');
    }
    public static void main(String[] args){
        CourseGrade g = new CourseGrade("\twtf\t",'A');
        System.out.println("="+g.getCourseName()+"=");
        System.out.println("="+g.getLetterGrade()+"=");
        System.out.println("="+g+"=");
        g.setLetterGrade('A');
        g.setLetterGrade('B');
        g.setLetterGrade('C');
        g.setLetterGrade('D');
        g.setLetterGrade('F');
        // g.setLetterGrade('G');
    }
}