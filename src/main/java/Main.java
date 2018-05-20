import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] separates = value.split(" ");
        Calculator calc = new Calculator();
        int temp;
        int result = Integer.parseInt(separates[0]);
        char operator = ' ';
        for(String op : Arrays.copyOfRange(separates,1,separates.length)){
            if(isInteger(op)){
                temp = Integer.parseInt(op);
                switch(operator){
                    case '+':
                        result = calc.add(result, temp);
                        break;
                    case '-':
                        result = calc.sub(result, temp);
                        break;
                    case '*':
                        result = calc.mul(result, temp);
                        break;
                    case '/':
                        result = calc.div(result, temp);
                        break;
                    default:
                        //exception
                }
                continue;   //else 안쓰려고
            }
            operator = op.toCharArray()[0];

        }
        System.out.println(result);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
