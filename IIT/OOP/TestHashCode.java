package IIT.OOP;
import java.util.HashMap;

public class TestHashCode{
    private int v;
    public TestHashCode(){}
    public TestHashCode(int v){
        this.v=v; 
    }
    @Override
    public int hashCode(){
        return this.v;
    }
    @Override
    public String toString(){return String.format("%d",this.v);}
    @Override
    public boolean equals(Object o){
        if (o instanceof TestHashCode){
            TestHashCode c = (TestHashCode)o;
            return this.v==c.v;
        }
        return false;
    }
    // PLAY WITH HASHMAPS
    public static void main(String[] args){
        try{
            HashMap<TestHashCode,String> h = new HashMap<TestHashCode,String>();
            TestHashCode k1 = new TestHashCode(1);
            TestHashCode k2 = new TestHashCode(2);
            TestHashCode k3 = new TestHashCode(3);
            TestHashCode k4 = new TestHashCode(4);
            h.put(k1,"A");h.put(k2,"B");h.put(k3,"C");h.put(k4,"D");
            TestHashCode q = new TestHashCode(1);
            String s = h.get(q);
            System.out.println(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}