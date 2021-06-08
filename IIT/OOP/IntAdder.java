package IIT.OOP;


class GenericAdder<T>{
    private T[] values;
    GenericAdder(T[] array){this.values=array;}
    public double addAll(){
        double total = 0;
        for (T v : this.values){
            total += Double.valueOf(v.toString());
        }
        return total;
    }
}

class DoubleAdder{
    private double[] values;
    DoubleAdder(double[] array){this.values = array;}
    public double addAll(){
        double total = 0;
        for (double v : this.values){
            total += v;
        }
        return total;
    }
}

public class IntAdder{
    private int[] values;
    IntAdder(int[] array){this.values = array;}
    public int addAll(){
        int total = 0;
        for (int i: this.values){
            total += i;
        }
        return total;
    }
}