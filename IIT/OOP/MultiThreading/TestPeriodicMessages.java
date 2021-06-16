package IIT.OOP.MultiThreading;
public class TestPeriodicMessages{
    public static void main(String[] args){
        try{
            PeriodicMessageThread t1 = new PeriodicMessageThread(1000,"message 1s");
            PeriodicMessageThread t3 = new PeriodicMessageThread(3000, "message 3s");
            PeriodicMessageThread t10 = new PeriodicMessageThread(10000,"message 10s");
            t1.start();
            t3.start();
            t10.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}