package src.sand.box;

class Generic<T,E>{
    private T string;
    private E integer;
    Generic(T string, E integer) {
        this.string = string;
        this.integer = integer;
    }
    public T getString(){
        return this.string;
    }
    public E getInteger(){
        return this.integer;
    }
}

public class genericType{
    public static void main(String[] args){
        Generic<String,Integer> strvar = new Generic<String,Integer>("I love Java",30); 
        System.out.printf("%d:%s\n",strvar.getInteger(),strvar.getString());
    }
}