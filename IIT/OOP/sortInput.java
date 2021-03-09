package IIT.OOP;
import java.util.Scanner;

public class sortInput{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Input Values:");
        int input =s.nextInt();
        int i=0,maxlen=20; int[] array = new int[maxlen];
        while(input != 0 && input > 0 && i < maxlen){
            array[i] = input;
            // System.out.println(array[i]);
            input = s.nextInt();
            i++;
        }
        System.out.println("printing inputs in reverse order:");
        array = sortArray(array,i);
        printArray(array,i);
        
    }

    static void printArray(int[] inputArr,int maxlen){
        for (int i=0;i<maxlen;i++){
            System.out.printf("%d ",inputArr[i]);
        }
        System.out.println();
    }

    static int[] sortArray (int[] inArray,int maxlen){
        //Construct the array we're using here
        int[] newArray = inArray;

        for(int i=0; i<maxlen; i++) {
            // a.length = # of indices in the array
            int tempValue = inArray[i];

            for(int j=0; j<maxlen; j++){
                if(newArray[i] < newArray[j]) {
                    tempValue = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = tempValue;
                }
            }
        }
        return newArray;
    }
}