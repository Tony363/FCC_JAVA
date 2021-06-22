import java.util.ArrayList;

public class Switch{
    ArrayList<Character> toLetterGrades(ArrayList<Integer> a) {
        ArrayList<Character> l = new ArrayList<Character>();
        for (int g : a) {
            switch(g/10) {
                case 8:
                    l.add('B');
                    break;
                case 7:
                    l.add('C');
                    break;
                case 6:
                    l.add('D');
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    l.add('F');
                    break;
                default:
                    l.add('A');
                    break;
            }
        }
        return l;
    }
    public static void main(String[] args){
        
    }
}
