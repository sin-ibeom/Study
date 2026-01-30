import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class IfExam_01 {
    public static void main(String[] args) {

//        pm.p2(); // 문제2
//        pm.p3(); // 문제3
//        pm.p4(); // 문제4
//        pm.p5(); // 문제5
//        pm.p6(); // 문제6
        pm.p7(); // 문제7
    }
}

class pm {
// =======================================================
    public static void p2(){
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d * %d = %dㅣ", i, j, 2*j);
            }
            System.out.println();
        }
    }

// =======================================================
    public static void p3(){
        for(int i = 1; i <= 9; i++){
            for(int j = 2; j <= 9; j++){
                System.out.printf("%d * %d = %dㅣ", j, i, 2*i);
            }
            System.out.println();
        }
    }

// =======================================================
    public static void p4(){
        for(int i = 1; i <= 6; i++){ // 왼쪽 주사위 수
            for(int j = 1; j <= 6; j++){ // 오른쪽 주사위 수
                System.out.printf("[%d, %d] ", i, j);
            }
            System.out.println("\n");
        }

    }

// =======================================================
    public static void p5(){
        int input = 5;
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6; j++){
                if(i+j == input){
                    System.out.printf("[%d, %d] ", i, j);
                }
            }
        }

    }
// =======================================================
    public static void p6(){
        int input = 3;
        double input_num = input / 2;
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6; j++){
                if(i+j == input){
                    if(i <= input_num){
                        System.out.printf("[%d, %d] ", i, j);
                    }
                }
            }
        }
    }
// =======================================================
    public static void p7(){
        Scanner  input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        num += 1;
        for(int i = 1; i < num; i++){

            for(int j = num; j >= i + 2; j--){
                System.out.print("-");
            }
            for(int j = 0; j < (2 * i - 1); j++){
                System.out.print("*");
            }
            for(int j = num; j >= i + 2; j--){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
