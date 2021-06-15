package IIT.OOP;
// import java.
public class PeriodicMessageThread extends Thread {
    private int interval = 1000;
    private String message = "Default Message";

    public int getInterval(){return this.interval;}
    public void setInterval(int interval){
        if (interval > 0){
            this.interval = interval;
        }else{
            throw new IllegalArgumentException("Inteval should be positive");
        }
    }
    public String getMessage(){return this.message;}
    public void setMessage(String message){
        if (message != null){
            this.message = message;
        }else{
            throw new IllegalArgumentException("Null message is not allowed");
        }
    }
    public PeriodicMessageThread(){}
    public PeriodicMessageThread(int interval,String message){
        this.setInterval(interval);
        this.setMessage(message);
    }
    public void run(){
        while(true){
            System.out.println(this.getMessage());
            try{
                Thread.sleep(this.getInterval());
            }catch(InterruptedException ie){
                System.err.println("sleep() is interrupted");
            }
        }
    }
    // required to integrate class to default java framework
    @Override
    public String toString(){
        return String.format("%s %d",this.getMessage(),this.getInterval());
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof PeriodicMessageThread){
            PeriodicMessageThread thread = (PeriodicMessageThread)o;
            return thread.getInterval() == this.getIntervals()
                && thread.getMessage() == this.getMessage();
        }
        return false;
    }
    @Override
    public int hashCode(){
        return 33 * Integer.valueOf(this.getInterval()).hashCode() * this.getMessage().hashCode();
    }
}