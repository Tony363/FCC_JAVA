package src.sand.box;
import java.util.*;


public class generics<favorite1,favorite2,favorite3>{

    private favorite1 fav1;
    private favorite2 fav2;
    private favorite3 fav3;

    generics(favorite1 fav1,favorite2 fav2,favorite3 fav3){
        this.fav1=fav1;
        this.fav2=fav2;
        this.fav3=fav3;
    }
    public favorite1 getFav1(){
        return(this.fav1);
    }
    public favorite2 getFav2(){
        return(this.fav2);
    }
    public favorite3 getFav3(){
        return(this.fav3);
    }
    public static void main(String[] args){
        List r = new ArrayList();
        r.add(6.3);
        r.add(5.9);
        generics<String,Integer,Float> a = new generics("Hello",67,r.get(0));
    
        System.out.println("My favorites are " + a.getFav1() + ", " +  a.getFav2() + ", and " + a.getFav3() + ".");
    }
}


