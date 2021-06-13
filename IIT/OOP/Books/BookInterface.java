package IIT.OOP;

public interface BookInterface{

    public abstract String getISBN();
    public abstract void setISBN( String isbn);
    public abstract int getNumWords();
    public abstract void setNumWords(int n);
    public abstract String getTitle();
    public abstract void setTitle(String title);

    @Override 
    public abstract boolean equals(Object o);
    public abstract String getShipmentInfo();
    static boolean isEqual(String s1, String s2){
        return (s1==null && s2==null) || (s1!=null && s1.equals(s2));
    };
}

