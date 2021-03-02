package src.sand.box;
//H3110 w0r1d 2.0 true
public class charString{
    public static void main(String[] args) {
        byte zero = 0;
        short one = 1;
        int number = 3;
        char H = 'H',r = 'r',d = 'd';
        float v2 = 2.0f;
        boolean True = true;
        String output = zero+" w"+zero+r+one+d+' '+v2+' '+True;
        System.out.printf("%c%d%d%d%s\n",H,number,one,one,output);
    }
}