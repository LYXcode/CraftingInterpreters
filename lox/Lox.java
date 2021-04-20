import java.nio.file.Files;
import java.nio.file.Paths;

public class Lox {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Usage: jlox [script]");
            System.exit(64);
        }

        else if (args.length == 1) {
            System.out.println(args[0]);
            runFile(args[0]);

        } else {
            runPromt();
        }

    }

    private static void runFile(String filePath) {
        System.out.println(filePath);
        byte[] bytes = Files.readAllBytes(Paths.get(filePath))
    }

    private static void runPromt() {

    }
}
