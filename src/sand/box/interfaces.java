package src.sand.box;
import src.sand.box.*;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal{
    Gorilla(){
        helloworld hello = new helloworld();
    };
    public boolean feed(boolean timeToEat){
        if (timeToEat){
            System.out.println("nomnomnom");
            return true;
        }else {
            System.out.println("rarr!");
            return false;
        }
    }
    public void groom() {
        System.out.println("grooming...");
    }
    public void pet() {
        System.out.println("petting");
    }
}

public class interfaces{
    public static void main(String[] args){
        Gorilla g = new Gorilla();
        g.groom();
        g.pet();
        g.feed(true);
    }
}