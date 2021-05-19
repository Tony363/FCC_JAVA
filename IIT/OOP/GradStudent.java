package IIT.OOP;

public class GradStudent extends Student{
    private String BSDegree;

    public String getBSDegree(){ return this.BSDegree;}
    public void setBSDegree(String bs){this.BSDegree = bs;}

    public GradStudent(){
        super();
        //  BSDegree default(null)
    }
    public GradStudent(String ID, String name, String dept, String BSDegree){
        super(ID, name, dept);
        this.setBSDegree(BSDegree);
    }
    @Override
    public String toString(){
        return String.format("%s [B.S. %s]",super.toString(),this.getBSDegree());
    }
    @Override
    public boolean equals(Object o){
        // if (o instanceof GradStudent){
        if (o.getClass() == GradStudent.class){
            System.out.println("type compatible to GradStudent");
            GradStudent g = (GradStudent)o;
            return super.equals(g) && isEqual(this.getBSDegree(),g.getBSDegree());
        }   
        return false;
    }
}