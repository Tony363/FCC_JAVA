package IIT.OOP;

public class methodDiff{
    int diff(int[] a){
        int i=0;
        int smallest = a[i], largest = a[i];
        for (; i<a.length; i++){
            if (a[i] < smallest){
                smallest = a[i];
            }
            if (a[i] > largest){
                largest = a[i];
            }
        }
        return largest - smallest;
    }
    public static void main(String[] args){
        int a[] = {0,1,2,3,4,5,6,7,8,9} ;
        methodDiff test = new methodDiff();
        System.out.println(test.diff(a));
    }
}