package IIT.OOP.MultiThreading;

public class MTTest{
    public static void main(String[] args){
        try{
            MsgBox msgbox = new MsgBox();
            HeartbeatTask ht1 = new HeartbeatTask(msgbox);
            HeartbeatTask ht2 = new HeartbeatTask(msgbox);

            FileloggerTask logger1 = new FileloggerTask(msgbox,"./txt/runnableLog1.txt");
            FileloggerTask logger2 = new FileloggerTask(msgbox,"./txt/runnableLog2.txt");

            Thread heartbeat_th1 = new Thread(ht1);
            Thread heartbeat_th2= new Thread(ht2);

            Thread logger_th1 = new Thread(logger1);
            Thread logger_th2 = new Thread(logger2);

            heartbeat_th1.start();
            heartbeat_th2.start();
            logger_th1.start();
            logger_th2.start();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}