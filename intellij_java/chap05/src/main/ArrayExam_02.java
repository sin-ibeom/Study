package main;

import java.util.ArrayList;

public class ArrayExam_02 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList <Integer>();
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(80);
        list.add(20);
        System.out.println(list);

        // 배열 array : 한번에 여러 변수를 만드는 방법
        int[] a1;

        // 배열 변수는 참조 타입이라서 null을 넣을 수 있다.
        a1 = null;

        // 배열을 선언하는 첫번째 방법
        int score[] = new int[5];
        score[0] = 1;

        // 배열을 선언하는 두번째 방법
        int[] i1 = new int[] {1,2,3,4,5};

        // 배열을 선언하는 세번째 방법
        int[] i3 = {90, 85, 70};
        for(int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }


        int temp[] = new int[10];
        for(int i = 0; i < temp.length; i++){
            temp[i] = i + 1;
            System.out.println(temp[i]);
        }

        System.out.println(args.length); // 0

        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("====== 문제 2 ======");
        // ========== 문제 2 ===========
        // 1, 2, 3을 순서대로 저장한 배열이 있을 때,
        // 다른 배열에도 1, 2, 3으로 저장되게 복사
        // 단 b = a 안 됨

        int array1[] = new int[]{ 1, 2, 3 };
        int array2[] = new int[3];

        for(int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
        // ========== 문제 3 ===========
        System.out.println("====== 문제 3 ======");

        int array3[] = new int[]{7 , 12 , 8};
        int array4[] = new int[array3.length];
        int count = 0;

        for(int i = array3.length - 1; i >= 0; i--){
            array4[count] = array3[i];
            count++;
        }
        for(int i = 0; i < array4.length; i++){
            System.out.println(array4[i]);
        }
        // ========== 문제 4 ===========
        System.out.println("====== 문제 4 ======");

        int h_count = 0;
        int f_count = 0;
        int array5[] = new int[]{3, 4, 7, 5, 1, 4, 6};

        for(int num : array5){
            if(num % 2 == 1){
                h_count++;
            }
            if(num > 4){
                f_count++;
            }
        }
        System.out.println("홀수 : " + h_count + "\n4보다 큰 수 : " + f_count);


        // ========== 문제 5 ===========
        System.out.println("====== 문제 5 ======");

        int player_count = 5;
        int finisher[] = new int[]{2, 4, 5, 1};
        int player[] = new int[player_count];

        for(int i = 0; i < player_count; i++){
            player[i] = i + 1;
        }
        for(int i = 0; i < finisher.length; i++){
            for(int j = 1; j <= player_count; j++){
                if(finisher[i] == j){
                    player[finisher[i] - 1] = 0;
                }
            }
        }
        for( int num : player){
            if(num != 0){
                System.out.printf("완주한 선수 : %d\n", num);
            }
        }

        // ============ 문제 6 ============
        System.out.println("====== 문제 6 ======");

        int result = -1;
        int numbers[] = new int[] { 3, 4, 7, 5, 1, 4, 6};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }

        System.out.println("가장 큰 수 : " + result);

    }
}
