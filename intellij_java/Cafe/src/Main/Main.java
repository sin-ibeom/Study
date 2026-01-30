package Main;

public class Main {
    public static void main(String[] args) {
        // 메뉴 설정
    Menu m1 = new Menu("바닐라라떼", 3200);
    m1.addSubMenu("연하게");
    m1.addSubMenu("샷 추가");
    m1.addSubMenu("바닐라시럽 추가");
    Menu m2 = new Menu("카푸치노", 2900);
    m2.addSubMenu("연하게");
    m2.addSubMenu("샷 추가");
    Menu m3 = new Menu("아메리카노", 2000);


    Kiosk.printMenu();
    Kiosk.task();



    }
}
