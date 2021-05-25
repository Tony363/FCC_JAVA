public abstract class Book{
    private String ISBN;
    private int numWords;
    private String title;

    public String getISBN(){return this.ISBN;}
    public void setISBN(String isbn){this.ISBN = isbn;}
    public int getNumWords(){return this.numWords;}
    public void setNumWords(int n){this.numWords = n;}
    public String getTitle(){return this.title;}
    public void setTitle(String title){this.title = title;}
    public Book(){}
    public Book(String isbn,int n_words,String title){
        this.setISBN(isbn);
        this.setNumWords(n_words);
        this.setTitle(title);
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Book){
            Book b = (Book)o;
            return this.isEqual(this.getISBN(),b.getISBN()) 
                && this.getNumWords()==b.getNumWords()
                && isEqual(this.getTitle(),b.getTitle());
        }
        return false;
    }
    protected boolean isEqual(String s1,String s2){
        return (s1==null && s2==null) || (s1!=null && s1.equals(s2));
    }
    public abstract String getShipmentInfo();
}