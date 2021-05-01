package src.sand.box;
import java.util.Scanner;

// class Test {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String word = scanner.next();
//         while (!word.contains("@")) {
//             word = scanner.next();
//         }
//         System.out.println(word);
//     }
// }

public class contains{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String input = sc.nextLine();
            if (input.contains("@")){
                System.out.println(input);
                break;
            }
        }
    }
}


