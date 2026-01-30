package main;

public class RefExam_01 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.printf("a : %d, b : %d\n", a, b);

        b = 12;
        System.out.printf("a : %d, b : %d\n", a, b);

        String name = "최서우";
        // ==의 오른쪽이 먼저 실행 됨
        // ""를 힙 영역에 할당하면 주소값 획득
        // 주소값을 스택 영역의 변수 name에 주소값 저장
        System.out.printf("%s\n", name);
        // name의 주소값이 가르키는 값을 가져온다

        System.out.println(a == b);
        // ==, != 는 무조건 stack 의 값을 비교한다

        String name2 = new String("최서우");
        System.out.println("== 사용 : " + (name == name2));
        System.out.println(".equals 사용 : " + name.equals(name2));

        String name3 = "최서우";
        System.out.println("== 사용 : " + (name == name3));
        // String 의 경우 값이 같으면 주소값을 재활용 하는 경우도 있다

        String name4 = "최" + "서우";
        System.out.println(name == name4);
        // "A" + "B" A, B 따로 힙에 생김
        // String 이라서 주소 재활용

        String name5 = name;
        System.out.println(name5);

//        int c = null;
        // 기본 타입에는 null을 넣을 수 없다

        // null : 참조하는 주소가 없는 상태

        String addr = "천안";
        System.out.println("addr == null" + (addr == null));
        System.out.println("addr == null" + (addr != null));

        String addr2 = ""; // null : X
        System.out.println("addr2 == null" + (addr2 == null));
        System.out.println("addr2 == null" + (addr2 != null));

        addr = null;
        // "천안" 과 연결이 끊어지고
        // "천안"은 참조하고 있는 변수가 없어서
        // garbage collector ( gc )가 지워버린다.

        System.out.println("addr + \"abc\" : " + addr + "abc");
        // 출력할 때만 "null" 이라는 글씨로 바뀐다.

//        if(addr.equals(addr2)){
//            System.out.println("같다.");
//        }




    }
}
