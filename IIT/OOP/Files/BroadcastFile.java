package IIT.OOP.Files;
import java.util.List;
import java.util.Arrays;
import java.io.Writer;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.CharArrayWriter;
import java.io.PrintWriter;

public class BroadcastFile{
    private OutputStream out = null;
    private List<Writer> writers = null;
    private String message = null;

    public void setWriters(List<Writer> writers){
        for (Writer writer : writers){
            if (writer instanceof Writer){
                continue;
            }else{
                throw new IllegalStateException("List of writers not writer object");
            }
        }   
        this.writers = writers;
    }
    public List<Writer> getWriters(){return this.writers;}
    public void setMessage(String message){
        if (message != null || message.length() != 0){
            this.message = message;
        }else{
            throw new IllegalArgumentException("message is null");
        }
    }
    public String getMessage(){return this.message;}
    public BroadcastFile(){}
    public BroadcastFile(List<Writer> writers,String message){
       this.setWriters(writers);
       this.setMessage(message);
    }
    public void broadcast(){
        for(Writer writer:this.getWriters()){
            try{
                writer.write(this.getMessage());
                writer.flush();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        FileWriter o1 = null;
        BufferedWriter o2 = null;
        PrintWriter o3 = null;
        OutputStreamWriter o4 = null;
        CharArrayWriter o5 = null;
        StringWriter o6 = null;

        try{
            o1 = new FileWriter("./txt/fileWriter.txt");
            o2 = new BufferedWriter(o1);
            o3 = new PrintWriter(o2);
            o4 = new OutputStreamWriter(System.out);
            o5 = new CharArrayWriter(); 
            o6 = new StringWriter();
        
            List<Writer> writers = Arrays.asList(o1,o2,o3,o4,o5,o6);
            String message = String.valueOf("messages");

            BroadcastFile broadcaster = new BroadcastFile(writers,message);
            broadcaster.broadcast();
        }catch(IOException e){
            e.printStackTrace();
        } 
    }
}