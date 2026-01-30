package Quiz_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input_str;
        ArrayList<String> history = new ArrayList<>();
        int result = 0;
        int a = 0;
        int b = 0;
        char c;

        while(true){
            System.out.print(">>>");
            input_str = input.nextLine();

            if(input_str.equals("log")){
                if(history.size()==0){
                    System.out.println("내역이 없습니다.");
                } else {
                    history.stream()
                            .forEach(System.out::println);
                }
                break;
            } else {
                if(input_str.length()>4){
                    a = Integer.parseInt(String.valueOf(input_str.charAt(0)));
                    b = Integer.parseInt(String.valueOf(input_str.charAt(4)));
                    c = input_str.charAt(2);
                } else {
                    a = Integer.parseInt(String.valueOf(input_str.charAt(0)));
                    b = Integer.parseInt(String.valueOf(input_str.charAt(2)));
                    c = input_str.charAt(1);
                }
            }

            switch (c){
                case '+':
                    result = Calc.add(a, b);
                    break;
                case  '-':
                    result = Calc.sub(a, b);
                    break;
                case '*':
                    result = Calc.mul(a, b);
                    break;
                case  '/':
                    result = Calc.div(a, b);
                    break;
        }
            System.out.println("결과 : " + result + "\n( 로그를 보려면 log를 입력하세요. )");
            input_str += " = " + result;
            history.add(input_str); // 배열에 삽입
        }
    }
}
