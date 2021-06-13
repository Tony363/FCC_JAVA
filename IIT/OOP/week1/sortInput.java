package IIT.OOP;
import java.util.Scanner;

class takeInput{
    int[] Array;
    int iterated;
    takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Input Values:");
        int input = s.nextInt();
        int i=0,maxlen=20; int[] array = new int[maxlen];
        while(input != 0 && input > 0 && i < maxlen){
            array[i] = input;
            // System.out.println(array[i]);
            input = s.nextInt();
            i++;
        }
        this.Array = array;
        this.iterated = i;
    }

    int[] getArray(){
        return this.Array;
    }
    int getMaxlen(){
        return this.iterated;
    }
}

class Sort{
    int []array; int[]newArray;
    int maxlen;

    public Sort(int[] inArray,int maxlen){
        this.array = inArray;
        this.maxlen = maxlen;
        this.newArray = null;

    }
    void sortArray (){
        //Construct the array we're using here
        this.newArray = this.array;

        for(int i=0; i<this.maxlen; i++) {
            // a.length = # of indices in the array
            int tempValue = this.array[i];

            for(int j=0; j<this.maxlen; j++){
                if(this.newArray[i] < this.newArray[j]) {
                    tempValue = newArray[j];
                    this.newArray[j] = this.newArray[i];
                    this.newArray[i] = tempValue;
                }
            }
        }
    }
    void printArray(){
        for (int i=0;i<this.maxlen;i++){
            System.out.printf("%d ",this.newArray[i]);
        }
        System.out.println();
    }
}

public class sortInput{
    public static void main(String[] args){
        takeInput input = new takeInput();
        int[] array = input.getArray();
        int maxlen = input.getMaxlen();
        System.out.println("printing inputs in reverse order:");
        Sort sorting = new Sort(array,maxlen);
        sorting.sortArray();
        sorting.printArray();
        
    }

    // static void printArray(int[] inputArr,int maxlen){
    //     for (int i=0;i<maxlen;i++){
    //         System.out.printf("%d ",inputArr[i]);
    //     }
    //     System.out.println();
    // }

    // static int[] sortArray (int[] inArray,int maxlen){
    //     //Construct the array we're using here
    //     int[] newArray = inArray;

    //     for(int i=0; i<maxlen; i++) {
    //         // a.length = # of indices in the array
    //         int tempValue = inArray[i];

    //         for(int j=0; j<maxlen; j++){
    //             if(newArray[i] < newArray[j]) {
    //                 tempValue = newArray[j];
    //                 newArray[j] = newArray[i];
    //                 newArray[i] = tempValue;
    //             }
    //         }
    //     }
    //     return newArray;
    // }
}