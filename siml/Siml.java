package siml;

import java.io.IOException;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.graalvm.compiler.bytecode.Bytes;


public class Siml {
    private static boolean hasError = false;
    public static void main(String[] args) throws IOException {

test();
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

    private static void test() throws IOException{
Path filepPath = Paths.get("./siml/test.siml");
byte[] bytes = Files.readAllBytes(filepPath);
String source = new String(bytes, Charset.defaultCharset());
run(source);
    }

    private static void runFile(String filePath) throws IOException {
      
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        String source = new String(bytes, Charset.defaultCharset());
        run(source);
        if(hasError) System.exit(65);
        
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
            hasError = false;
        }

    }

    private static void run(String source){
        Scanner scanner = new Scanner(source);
        List<Token> tokens = scanner.scanTokens();

        for(Token token: tokens){
            System.out.println(token);
        }
        
    }

    static void error(int line, String message){
        report(line, "", message);
    }

    private static void report(int line, String where, String message){
        System.err.println(
            "[line " + line + "]" + where + ": " + message
        );

        hasError = true;
    }
}
