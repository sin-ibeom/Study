package sec04;

import java.util.Scanner;

public class CalcExam {
    public static void main(String[] args) {
        String input_str;
        int a = 0;
        int b = 0;
        int result = 0;

        Calc calc = new Calc();
        Scanner input = new Scanner(System.in);
        System.out.print(">>>");
        input_str = input.nextLine();

        // String 0번째 문자 Char타입 변경 -> Char 타입 String으로 변경 -> String 타입 Int 타입으로 변경
        a = Integer.parseInt(Character.toString(input_str.charAt(0)));
        b = Integer.parseInt(Character.toString(input_str.charAt(4)));

        switch (input_str.charAt(2)){
            case '+':
                result = calc.add(a, b);
                break;
            case '-':
                result = calc.sub(a, b);
                break;
            case '*':
                result = calc.mul(a, b);
                break;
            case '/':
                result = calc.div(a, b);
                break;
        }
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("결과 : " + result);
    }
}
