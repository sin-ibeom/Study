package Quiz_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    String sangho;
    int need_money;
    ArrayList<Menu> menus;

    Cafe(String sangho, int need_money) {
        this.sangho = sangho;
        this.need_money = need_money;
    }
    void menu_add(Menu menu) {
        menus.add(menu);
    }
}
