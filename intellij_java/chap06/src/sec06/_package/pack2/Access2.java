package sec06._package.pack2;

public class Access2 {
    // 내 class 한정
    private int hp = 100;

    public Access2() {
        System.out.println("Access2 생성자 실행");
        this.hp = 200;
    }

    // 기본 생성자는 public이 붙어있다.
//    public Access2() { ... }

    int d1 = 10;
    public int p1 = 20;


    void d() {
        System.out.println("default 접근 제한자 실행");
    }

    public void p() {
        System.out.println("public 접근 제한자 실행");
    }
}
