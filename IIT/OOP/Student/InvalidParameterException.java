package IIT.OOP.Student;

public class InvalidParameterException extends Exception{
    public InvalidParameterException(){
        super();
    }
    public InvalidParameterException(String msg){
        super(msg);
    }
}