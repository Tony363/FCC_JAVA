package IIT.OOP.Final;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class template{
    //member attributes
    private String str = "default";
    private int integer = 0;
    private boolean bool = false;
    // accessor 
    public boolean getbool(){return this.bool;}
    public int getint(){return this.integer;}
    public String getstr(){return this.str;}
    //mutator
    void setstr(String str){
        if(str!=null && str.length()>0){
            this.str = str;
        }else{
            throw new IllegalArgumentException("Null str");
        }
    }
    void setint(int i){this.integer = i;}
    void setbool(boolean bool){this.bool = bool;}

    public template(){}
    public template(String str,int i, boolean bool){
        this.setstr(str);
        this.setint(i);
        this.setbool(bool);
    }

    @Override
    public String toString(){
        return String.format("%s %d %b",this.getstr(),this.getint(),this.getbool());
    }
    @Override 
    public boolean equals(Object o){
        if(o instanceof template){
            template t = (template)o;
            return t.getstr() == this.getstr()
                && t.getint() == this.getint()
                && t.getbool() == this.getbool();
        }
        return false;
    }
    @Override
    public int hashCode(){
        return 31 
        * this.getstr().hashCode() 
        * Integer.valueOf(this.getint()).hashCode()
        * Boolean.valueOf(this.getbool()).hashCode() ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (sc.hasNext()){
            System.out.println("");
        }
    }
}