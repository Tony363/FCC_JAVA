package IIT.OOP;

public class EBook extends Book{
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
            this.getISBN(),this.getNumwords(),
            this.getTitle(),this.getDownload()
        );
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof EBook){
            EBook b = (Bbook)o;
            return super.equals(b) && isEquals(this.getDownloadURL(),b.getDownloadURL());;
        }
        return false;
    }
    @Override
    public int HashCode() {
        int h = this.getISBN().hashCode();
        h = 31 *h+Integer.valueOf(this.getNumwords()).hashCode();
        h = 31*h+this.getTitle().hashCode();
        h = 31*h+this.getDownloadURL().hashCode();
        return h;
    }
    public String getShipmentInfo() {
        return this.downloadURL;
    }
}