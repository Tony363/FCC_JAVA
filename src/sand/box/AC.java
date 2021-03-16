package src.sand.box;

abstract class abstractClass { 
    abstract void abstractMethod(); 
    void concreteMethod() { // concrete methods are still allowed in abstract classes 
        System.out.println("This is a concrete method."); 
    } 
}

class B extends abstractClass { 
    void abstractMethod() { 
        System.out.println("B's implementation of abstractMethod."); 
    } 
}

class C extends abstractClass { 
    // Your code goes here
    void abstractMethod() { 
        System.out.println("C's implementation of abstractMethod."); 
    } 
}

public class AC { 
    public static void main(String args[]) { 
        B b = new B(); 
        b.abstractMethod(); 
        b.concreteMethod();
        C c = new C(); 
        c.abstractMethod(); 
        c.concreteMethod();
    } 
}