package QUIZ_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RandomNumberPicker ra = new RandomNumberPicker();
        int try_ = 0;
        int number = -1;

        do {
            try_++;
            System.out.print(">>>");
            number = input.nextInt();
            if(ra.decideNumber(number) == 1){
                System.out.println("업");
            } else if(ra.decideNumber(number) == 2){
                System.out.println("다운");
            }
        } while(number != ra.number);
        System.out.println("정답 : " + try_ + "번째만에 정답");
    }
}
