package IIT.OOP.MultiThreading;
import java.util.List;
import java.util.ArrayList;
import java.lang.InterruptedException;

public class MsgBox{
    private List<String> queue = new ArrayList<String>();
    public String getMsg() {return this.queue.remove(0);}
    protected void setMsg(String msg){this.queue.add(msg);}
    public MsgBox(){};
    public synchronized void sendMsg(String msg){
        try{
            while (msg==null&&msg.length()==0){wait();}
            // System.out.println(msg);
            this.setMsg(msg);
            notify();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    public synchronized String recvMsg() throws InterruptedException{
        while (this.queue.size()==0){wait();}
        String msg = this.getMsg();
        // System.out.println(msg);
        // this.setMsg(null);
        notify();
        return msg;
        }
}