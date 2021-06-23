package IIT.OOP.Final;

public class OptionalString{
    private String value="";
    public void setValue(String value){
        if (value!=null && value.length()>0){
            this.value = value;
        }else{
            throw new IllegalArgumentException("null string");
        }
    }
    public void unsetValue(){this.value = "";}
    public String getValue(){return this.value;}
    OptionalString(){};
    OptionalString(String value){
        this.setValue(value);
    }
    @Override
    public String toString(){return String.format("%s",this.getValue());}
    @Override
    public boolean equals(Object o){
        if (o instanceof OptionalString){
            OptionalString os = (OptionalString)o;
            return os.getValue() == this.getValue();
        }
        return false;
    }
    @Override
    public int hashCode(){return this.getValue().hashCode();}
    public static void main(String[] args){
        OptionalString s1 = new OptionalString();
        System.out.println(s1.toString().equals(""));
        OptionalString s2 = new OptionalString();
        s2.setValue("ABC");
        System.out.println(s2.toString().equals("ABC"));
        OptionalString s3 = new OptionalString();
        s3.setValue("ABC");
        s3.unsetValue();
        System.out.println(s3.toString().equals(""));
        OptionalString s4 = new OptionalString();
        s4.setValue("ABC");
        try {
        s4.setValue(null);
        } catch (IllegalArgumentException e) {
        System.out.println("Invalid");
        }
        System.out.println(s4.toString().equals("ABC"));
        OptionalString s5 = new OptionalString();
        OptionalString s6 = new OptionalString();
        s5.setValue("ABc def"); s6.setValue("ABc def");
        System.out.println(s5.equals(s6));
        System.out.println(s5.equals(s6));
        OptionalString s7 = new OptionalString();
        OptionalString s8 = new OptionalString();
        s7.setValue("aBc def"); s8.setValue("ABc def");
        System.out.println(s7.equals(s8));
        System.out.println(s7.equals(s8));
        OptionalString s9 = new OptionalString();
        OptionalString s10 = new OptionalString();
        s9.setValue("ABc def"); s10.setValue("ABc def");
        System.out.println(s9.hashCode()==s10.hashCode());
    }
    
}