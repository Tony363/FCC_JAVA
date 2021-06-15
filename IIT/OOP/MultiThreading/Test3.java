package IIT.OOP;
public class TestPeriodicMessages{
    public static void main(String[] args){
        try{
            PeriodicMessageThread t1 = new PeriodicMessageThread(1000,"message 1s");
            PeriodicMessageThread t3 = new PeriodicMessageThread(3000, "message 3s");
            Thread t10 = new Thread(Periodic3Message("message 10s"));
            t1.setDaemon(true);
            t3.setDaemon(true);
            t1.start();
            t3.start();
            t10.start();
            t10.join();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}