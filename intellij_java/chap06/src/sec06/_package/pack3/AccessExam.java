package sec06._package.pack3;

import sec06._package.pack2.Access2;

public class AccessExam {
    public static void main(String[] args) {

        // public이 아니여서 생성 불가
//        new Access1();
//        new Access3();

        // public이므로 생성 가능
        Access2 a2 = new Access2();


//        a2.d1 = 10; // public이 붙어있지 않음
        a2.p1 = 10; // public이니 가능

//        a2.d();
        a2.p(); // public이니 가능

//        a2.hp = 10;


    }
}
