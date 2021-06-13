package IIT.OOP.Files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.StringBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConvertFile{
    public static void main(String[] args){
        FileReader file = null;
        try{
            file = new FileReader(args[0]);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(file);

        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        try{
            while ((line = reader.readLine()) != null){
                stringBuilder.append(line);
                stringBuilder.append(ls);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        String content = stringBuilder.toString();
        // System.out.println(content);
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter("./txt/converted.txt"));
            writer.write(content);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if (writer != null){
                    writer.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}