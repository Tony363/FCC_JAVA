package IIT.OOP.Final;
import java.util.Arrays;
import java.util.ArrayList;

public class grades{
    public static ArrayList<Character> toLetterGrades(ArrayList<Integer> grades){
        ArrayList<Character> letterGrade = new ArrayList<Character>();
        for (Integer i :grades){
            switch(i/10){
                case 9:
                    letterGrade.add('A');
                    break;
                case 8: 
                    letterGrade.add('B');
                    break;
                case 7: 
                    letterGrade.add('C');
                    break;
                case 6: 
                    letterGrade.add('D');
                    break;
                default:
                    letterGrade.add('F');
                    break;
            }
        }
        return letterGrade;
    }
    public static void main(String[] args){
        ArrayList<Integer> grades = new ArrayList<Integer>( );
        grades.add( 78 );
        grades.add( 95 );
        grades.add( 86 );
        Character[] c = {'C', 'A', 'B'};
        System.out.println(Arrays.equals(toLetterGrades(grades).toArray(), c));
    }
}