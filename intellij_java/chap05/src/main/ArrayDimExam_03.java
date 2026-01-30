package main;

public class ArrayDimExam_03 {
    public static void main(String[] args) {

        int a0 = 5;
        int a1 = 15;
        int a2 = 34;
        int[] b = new int[3];
        b[0] = a0;
        b[1] = a1;
        b[2] = a2;

        int[] b1 = new int[3];
        b1[0] = a0+1;
        b1[1] = a1+1;
        b1[2] = a2+1;

        int[][] b3 = new int[2][3];

        int[][] c1 = new int[][] {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[] d1  = new int[]{1, 2, 3};
        int[] d2 = d1;
        // 얕은 복사
        // = 기호는 stack 의 값만 복사
        // 값을 변경하는 경우 원본도 바뀐다

        // 깊은 복사
        int[] d3 = new int[d1.length];
        for(int i= 0; i < d1.length; i++){
            d3[i] = d1[i];
        }

        ////////////////////////////////////////////////

        int[][][] numbers = new int[][][]{
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20,21}, {22, 23, 24}, {25, 26, 27}}
        };

        for(int i= 0; i < 3; i++){
            for(int j= 0; j < 3; j++){
                for(int k= 0; k < 3; k++){
                    System.out.print(numbers[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }
}
