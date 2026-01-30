package Main;

import java.util.ArrayList;

public class Menu {

    String name;
    int price;
    static ArrayList<SubMenu> sub_menu = new ArrayList<>();

    // 서브메뉴 설정
    SubMenu s1 = new SubMenu("연하게", 0);
    SubMenu s2 = new SubMenu("샷 추가", 500);
    SubMenu s3 = new SubMenu("바닐라시럽 추가", 500);
    SubMenu s4 = new SubMenu("아몬드밀크변경", 500);


    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
        Kiosk.menus.add(this);
    }
    public void addSubMenu(String SubMenuName) {
        if(SubMenuName.equals("연하게")){
            sub_menu.add(s1);
        }
        if(SubMenuName.equals("샷 추가")) {
            sub_menu.add(s2);
        }
        if(SubMenuName.equals("바닐라시럽 추가")){
            sub_menu.add(s3);
        }
        if(SubMenuName.equals("아몬드밀크변경")){
            sub_menu.add(s4);
        }

    }
    public static void clearMenu() {
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    void printSubMenu() {
        System.out.print("[메뉴명] "+this.name);
        System.out.println("  [가격] "+this.price);
            System.out.println("[======================]");
        for(int i = 0; i < sub_menu.size(); i++) {
            System.out.println("[옵션명] " + sub_menu.get(i).name);
            System.out.println("[가격] " + sub_menu.get(i).price);
            System.out.println("[======================]");
        }
    }

}
