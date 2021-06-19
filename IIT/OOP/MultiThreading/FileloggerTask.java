package IIT.OOP.MultiThreading;
import java.io.FileWriter;
import java.io.IOException;

public class FileloggerTask implements Runnable{
    private MsgBox msgbox;
    private FileWriter writer;
    public FileloggerTask(MsgBox msgbox,String filename)throws IOException{
        this.msgbox = msgbox;
        this.writer = new FileWriter(filename);
    }
    public void run(){
        try{
            while(true){
                String msg = this.msgbox.recvMsg();
                // System.out.println(msg);
                writer.write(msg);
                writer.write("\n");
                writer.flush();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }catch(IOException io){
            io.printStackTrace();
        }
    }   
}