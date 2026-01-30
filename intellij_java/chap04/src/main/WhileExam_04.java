package main;

import java.util.Scanner;

public class WhileExam_04 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int input_num = 0;
        int temp = 0;
        int balance = 0;

        while(input_num != 4){

            Thread.sleep(500); // 위험한 코드 !!, 모든 스레드가 멈춤
            System.out.println("--------------------------------");
            System.out.println("1. 예금ㅣ2.출금ㅣ3.잔고ㅣ4.종료");
            System.out.println("--------------------------------");

            System.out.print("선택> ");
            input_num = input.nextInt();

            switch (input_num){
                case 1:
                    System.out.print("예금액> ");
                    temp = input.nextInt();
                    if(temp > 0){
                        balance +=  temp;
                        System.out.println(temp + "원이 성공적으로 예금 되었습니다.");
                    } else {
                        System.out.println("올바른 값을 입력하세요.");
                    }
                    break;
                case 2:
                    System.out.print("출금액> ");
                    temp = input.nextInt();
                    if(temp <= balance){
                        balance -= temp;
                        System.out.println(temp + "윈이 성공적으로 출금 되었습니다.");
                    } else {
                        System.out.println("현재 잔액보다 높은 값을 출금할 수 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("현재 잔고 : " + balance);
                    break;
                case 4:
                    System.out.println("ATM기를 종료합니다.");
                    break;
                default:
                    System.out.println("올바른 값을 입력하세요.");
            }

        }
    }
}
