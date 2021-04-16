package IIT.OOP;

class Grade{
    private String courseName = "TBD";
    private char letterGrade = 'B';
    private static final String invalid = "INVALID VALUE";
    Grade(){}
    Grade(String course,char letter){
        if (this.isValidCourse(course) && this.isValidGrade(letter)){
            String temp = course;
            this.courseName = temp;
            char tempG = letter;
            this.letterGrade = tempG;
        }else {
            System.out.println(invalid);
        }
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
            System.out.println(invalid);
        }
    }
    public void setGradeName(char grade){
        if (this.isValidGrade(grade)){
            char temp = grade;
            this.letterGrade = temp;
        }else {
            System.out.println(invalid);
        }
    }
    @Override // check method signature, make sure signature already defined
    public String toString(){
        return String.format("%s: %c",this.getCourseName(),this.getLetterGrade());
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Grade){
            Grade d = (Grade)o;
            return (this.getLetterGrade() == d.getLetterGrade()
            && this.getCourseName() == d.getCourseName()); 
        }
        return false;
    }
    public static boolean isAlphaNumeric(char char1) {
        return (char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z');
    }
}

public class CourseGrade{
    public static void main(String[] args){
        Grade g = new Grade("OOP",'A');
        System.out.println("="+g.getCourseName()+"=");
        System.out.println("="+g.getLetterGrade()+"=");
        System.out.println("="+g+"=");
        g.setCourseName("\twtf");
        g.setGradeName(' ');
    }
}