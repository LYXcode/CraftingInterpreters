package siml;

import java.io.IOException;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Siml {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage: jsiml [script]");
            System.exit(64);
        }

        else if (args.length == 1) {
            System.out.println(args[0]);
            runFile(args[0]);

        } else {
            runPromt();
        }

    }

    private static void runFile(String filePath) throws IOException {
      
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        String source = new String(bytes, Charset.defaultCharset());
        run(source);
        
    }

    private static void runPromt() throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        for(;;){
            System.out.println("> ");
            String line = bufferedReader.readLine();
            if(line == null){
                break;
            }
            run(line);
        }

    }

    private static void run(String source){
        
    }
}
