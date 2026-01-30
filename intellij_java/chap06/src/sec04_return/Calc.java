package sec04_return;

import java.util.Scanner;

public class Calc {

    int plus(int a, int b){
        return a+b;
    }

    double avg(int x, int b){
        int sum = plus(x,b);
        double result = (double)sum / 2;
        return result;
    }

    void execute(int j1, int j2){
        double result = avg(j1,j2);
        System.out.println(j1 + ", " + j2 + "의 평균은 " + result);
    }

}
