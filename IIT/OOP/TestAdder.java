package IIT.OOP;

public class TestAdder{
    public static void main(String[] args){
        try{
            IntAdder a1 = new IntAdder(new int[] {1,2,3});
            System.out.println(a1.addAll());
            DoubleAdder a2 = new DoubleAdder(new double[] {1,2,3});
            System.out.println(a2.addAll());
            GenericAdder<Integer> a3 = new GenericAdder<Integer>(new Integer[] {1,2,3});
            System.out.println(a3.addAll());
            GenericAdder<Double> a4 = new GenericAdder<Double>(new Double[] {1.0,2.0,3.0});
            System.out.println(a4.addAll());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}