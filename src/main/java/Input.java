import java.util.Scanner;

public class Input {
    public static String[] start(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return Parser.parse(value);
    }
}
