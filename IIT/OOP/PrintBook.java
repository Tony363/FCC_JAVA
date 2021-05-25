public class PrintBook extends Book{
    private String mailingAddress;
    public String getMailingAddress(){return this.mailingAddress;}
    public void setMailingAddress(String url){this.mailingAddress = url;}
    public PrintBook(){}
    public PrintBook(String isbn,int n_words, String title,String addr){
        super(isbn,n_words,title);
        this.setMailingAddress(addr);
    }
    @Override 
    public String toString(){
        return String.format("%s %d %s %s",
            this.getISBN(),this.getNumwords(),
            this.getTitle(),this.getDownload()
        );
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof PrintBook){
            PrintBook b = (Printbook)o;
            return super.equals(b) && isEquals(this.getMailingAddress(),b.getMailingAddress());
        }
        return false;
    }
    @Override
    public int HashCode() {
        int h = this.getISBN().hashCode();
        h = 31 *h+Integer.valueOf(this.getNumwords()).hashCode();
        h = 31*h+this.getTitle().hashCode();
        h = 31*h+this.getMailingAddress().hashCode();
        return h;
    }
    public String getShipmentInfo() {
        return this.getMailingAddress;
    }
}