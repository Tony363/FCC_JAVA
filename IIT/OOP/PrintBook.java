package IIT.OOP;

public class PrintBook extends Book{
    private String mailingAddress;
    public String getMailingAddress(){return this.mailingAddress;}
    public void setMailingAddress(String addr){this.mailingAddress = addr;}
    public PrintBook(){}
    public PrintBook(String isbn,int n_words, String title,String addr){
        super(isbn,n_words,title);
        this.setMailingAddress(addr);
    }
    @Override 
    public String toString(){
        return String.format("%s %d %s %s",
            this.getISBN(),this.getNumWords(),
            this.getTitle(),this.getMailingAddress()
        );
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof PrintBook){
            PrintBook b = (PrintBook)o;
            return super.equals(b) && super.isEqual(this.getMailingAddress(),b.getMailingAddress());
        }
        return false;
    }
    @Override
    public int hashCode() {
        int h = this.getISBN().hashCode();
        h = 31 *h+Integer.valueOf(this.getNumWords()).hashCode();
        h = 31*h+this.getTitle().hashCode();
        h = 31*h+this.getMailingAddress().hashCode();
        return h;
    }
    public String getShipmentInfo() {
        return this.getMailingAddress();
    }
}