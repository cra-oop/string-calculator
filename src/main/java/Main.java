import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String value = scanner.nextLine();
//        String[] splitValue = value.split(" ");
//        System.out.println(splitValue[0]);

        Calculator calc = new Calculator();
        int result = calc.add(3,4);
        System.out.println(result);
    }
}
