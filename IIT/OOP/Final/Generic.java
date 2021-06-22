package IIT.OOP.Final;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Generic<T>{
    private T value = null;

    T getT(){return this.value;}
    void setT(T value){
        if (value!=null){
            this.value = value;
        }else{
            throw new IllegalArgumentException("null arg");
        }
    }

    Generic(){}
    Generic(T value){
        this.setT(value);
    }

    @Override 
    public boolean equals(Object o){
        if(o instanceof Generic<?>){
            Generic<?> t = (Generic<?>)o;
            return t.getT() == this.getT();
        }
        return false;
    }
    @Override
    public String toString(){
        return String.format("%s",String.valueOf(this.getT()));
    }
    @Override
    public int hashCode(){
        return 31 * String.valueOf(this.getT()).hashCode();
    }
    public static void main(String[] args){

    }
}
