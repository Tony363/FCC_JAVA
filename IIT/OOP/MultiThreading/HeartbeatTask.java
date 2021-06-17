package IIT.OOP.MultiThreading;
public class HeartbeatTask implements Runnable{
    private MsgBox msgbox;
    public HeartbeatTask(MsgBox msgbox){
        this.msgbox=msgbox;
    }
    public void run(){
        int counter = 0;
        while(true){
            String msg = "Heartbeat" + counter;
//            System.out.println(msg);
            this.msgbox.sendMsg(msg);
            counter++;
        }
    }
}