import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {

        String url = "./myFolder/data.txt";
        String fileUrl = "./myFolder/newdata.txt";
        String content = "hello world";
        Path newFilePath = Paths.get(fileUrl);

        if( !Files.exists(newFilePath)){
            Files.createFile(newFilePath);
        }
        Files.write(newFilePath, content.getBytes());




        //creating file in specified location
        // Path path = Paths.get("./myFolder/data.txt");

        // if(Files.exists(path)){
        //     System.out.println("file exists");
        // }
            
        // else{
        //     Path P = Files.createFile(path);
        //     System.out.println("file is created :" + P.toString());
        // }



        //read from file
        // Path filePath = Paths.get(url);

        // List<String> data = Files.readAllLines(filePath);
        // for(String s: data){
        //     System.out.println(s);
        // }
    }
}
