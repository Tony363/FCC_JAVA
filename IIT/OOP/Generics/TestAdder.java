package IIT.OOP;

public class TestAdder{
    public static void main(String[] args){
        try{
            IntAdder a1 = new IntAdder(new int[] {1,2,3});
            System.out.println(a1.addAll());
            DoubleAdder a2 = new DoubleAdder(new double[] {1,2,3});
            System.out.println(a2.addAll());
            GenericAdder<?> a3 = new GenericAdder<Integer>(new Integer[] {1,2,3});
            System.out.println(a3.addAll());
            GenericAdder<Double> a4 = new GenericAdder<>(new Double[] {1.0,2.0,3.0});
            System.out.println(a4.addAll());
            // GenericAdder<String> a5 = new GenericAdder<String>(new String[] {"a","b","c"});
            // System.out.println(a5.addAll());
            System.out.println(GenericAdder.addAll(new Long[]{4L,5L,6L}));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}