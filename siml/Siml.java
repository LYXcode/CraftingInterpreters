package siml;

import java.io.IOException;
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
        System.out.println(filePath);
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
    }

    private static void runPromt() {

    }
}
