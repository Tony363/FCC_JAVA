package src.sand.box;

public class Exceptions {
    public static void main(String[] args){
        int n = -1;
        if (n<0){
            throw new IllegalArgumentException("Error n < 0");
        }
    }
}
