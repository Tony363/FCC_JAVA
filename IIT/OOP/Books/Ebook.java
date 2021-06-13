package IIT.OOP;

public class EBook extends Book implements EBookInterface{
    private String downloadURL;
    public String getDownloadURL(){return this.downloadURL;}
    public void setDownloadURL(String url){this.downloadURL = url;}
    public EBook(){}
    public EBook(String isbn,int n_words, String title,String download){
        super(isbn,n_words,title);
        this.setDownloadURL(download);
    }
  
    @Override 
    public String toString(){
        return String.format("%s %d %s %s",
            this.getISBN(),this.getNumWords(),
            this.getTitle(),this.getDownloadURL()
        );
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof EBook){
            EBook b = (EBook)o;
            return super.equals(b) && super.isEqual(this.getDownloadURL(),b.getDownloadURL());
        }
        return false;
    }
    @Override
    public int hashCode() {
        int h = this.getISBN().hashCode();
        h = 31 *h+Integer.valueOf(this.getNumWords()).hashCode();
        h = 31*h+this.getTitle().hashCode();
        h = 31*h+this.getDownloadURL().hashCode();
        return h;
    }
    public String getShipmentInfo() {
        return this.downloadURL;
    }
}