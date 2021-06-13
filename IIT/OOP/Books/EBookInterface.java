package IIT.OOP;

public interface EBookInterface extends BookInterface{
    public abstract String getDownloadURL();
    public void setDownloadURL(String url);

    @Override 
    public abstract String toString();
    @Override 
    public abstract int hashCode();
}