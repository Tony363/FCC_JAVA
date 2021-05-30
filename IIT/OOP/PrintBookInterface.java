package IIT.OOP;

public interface PrintBookInterface {
    public abstract String getMailingAddress();
    public abstract void setMailingAddress(String addr);

    @Override
    public abstract String toString();
    @Override
    public abstract int hashCode();
}