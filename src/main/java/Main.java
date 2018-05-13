import jdk.internal.util.xml.impl.Input;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Calculator calculator = new CalculatorService();

        Helper helper = new HelperService();

        int result = helper.calculate(str);

        System.out.println(result);

    }
}
