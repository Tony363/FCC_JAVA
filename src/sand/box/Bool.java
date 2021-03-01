package src.sand.box;

public class Bool {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a != b;
        boolean b2 =!d.equals(b + "!");
        boolean b3 = c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}