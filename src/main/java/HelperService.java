import java.util.ArrayDeque;
import java.util.Deque;

public class HelperService implements Helper {

    private Calculator calculator;

    @Override
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public boolean isOperator(String str) {
        switch (str) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }

    public String[] splitString(String str) {
        return str.split(" ");
    }

    @Override
    public int calculate(String str) {
        String[] arr = splitString(str);

        Deque<Character> operatorDeque = new ArrayDeque<>();
        Deque<Integer> operandDeque = new ArrayDeque<>();

        for (String temp : arr) {
            if (isOperator(temp)) {
                operatorDeque.add(temp.charAt(0));
            } else {
                operandDeque.add(Integer.parseInt(temp));
            }
        }

        while (operandDeque.size() != 1){
            int num1 = operandDeque.pollFirst();
            int num2 = operandDeque.pollFirst();
            char operator = operatorDeque.pollFirst();

            operandDeque.addFirst(calculator.calculate(num1, num2, operator));
        }

        return operandDeque.poll();
    }
}
