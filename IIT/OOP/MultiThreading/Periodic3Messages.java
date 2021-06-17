package IIT.OOP.MultiThreading;

public class Periodic3Messages implements Runnable{
    private String message = "Default Message";
    public String getMessage() {return this.message;}
    public void setMessage(String message){
        if (message != null){
            this.message = message;
        }else{
            throw new IllegalArgumentException("Message should not be null");
        }
    }
    public Periodic3Messages(){}
    public Periodic3Messages(String message){
        this.setMessage(message);
    }
    public void run(){
        for (int i=0; i<3;i++){
            System.out.println(this.getMessage());
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){
                System.err.println("sleep() is interrupted");   
            }
        }
    }
}