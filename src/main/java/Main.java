import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        String[] splitValue = Input.start();
        int result = Integer.parseInt(splitValue[0]);

        for (int i =1; i<splitValue.length; i++){
            //TODO: if-else를 oop 패턴으로 없애거나 한단계 숨겨보자
            if (splitValue[i].equals("+")){
                result = calc.add(result, Integer.parseInt(splitValue[i+1]) );
            }else if(splitValue[i].equals("-")){
                result = calc.sub(result, Integer.parseInt(splitValue[i+1]));
            }
        }
        System.out.println(result);
    }
}
