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

public class BroadcastFile{

    public static void Broadcaster(String message,List<Writer> writers){
        for(Writer writer:writers){
            try{
                writer.write(message);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        OutputStream out = null;
        Writer o1 = null;
        Writer o2 = null;
        Writer o3 = null;
        Writer o4 = null;

        try{
            out = new FileOutputStream("./txt/OutputStreamWriter.txt");
            o1 = new FileWriter("./txt/fileWriter.txt");
            o2 = new BufferedWriter(o1);
            o3 = new StringWriter();
            o4 = new OutputStreamWriter(out);
        }catch(IOException e){
            e.printStackTrace();
        }
        
        List<Writer> writers = Arrays.asList(o1,o2,o3,o4);
        String message = String.valueOf("messages");
        Broadcaster(message,writers);
    }
}