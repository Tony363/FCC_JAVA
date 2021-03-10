package src.sand.box;

public class tryCatch{
    public static void main(String[] args) {
        int[] arr = new int[10];
        try{
            System.out.println(arr[9001]);
        }catch (Exception e){
            System.out.println("Problem with code detected");
        }
    }
}