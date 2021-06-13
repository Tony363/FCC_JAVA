package IIT.OOP;

class Sorter{
    private int[] a;
    Sorter(){

    }
    Sorter(int[] input){
        this.a = input;
    }
    int findLargest(int[] a, int endIdx){
        int maxIdx = 0;
        for (int i=0;i<=endIdx;i++){
            if(a[i]>a[maxIdx]){
                maxIdx = i;
            }
        }
        return maxIdx;// stub implementation
    }
    int[] swap(int[] a, int aIdx,int bIdx){
        int tmp = a[aIdx];
        a[aIdx] = a[bIdx];
        a[bIdx] = tmp;
        // int tmp = a[i];
        // a[i] = a[k];
        // a[k] = tmp;
        return a;
    }
}

public class SelectionSort{
    public static void selectionSort(int[] a){
        Sorter sort = new Sorter();
        for (int k=a.length-1;k>0; k--){
            int i = sort.findLargest(a,k);// find largest index
            a = sort.swap(a,i,k);
        }
    }
    public static void main(String[] args){
        int[] a = {11,4,30,87,6};
        selectionSort(a);
    }
}