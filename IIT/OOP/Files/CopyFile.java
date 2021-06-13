package IIT.OOP.Files;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
public class CopyFile{
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Please enter src file and dst file");
            System.exit(1);
        }
        try{
            Files.copy(new File(args[0]).toPath(), new File(args[1]).toPath());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}