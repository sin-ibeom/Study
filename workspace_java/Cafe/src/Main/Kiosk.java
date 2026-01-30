package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    static int count = 0;
    static int total_price;
    static ArrayList<Menu> menus = new ArrayList<>();



    static void printMenu(){
        for(Menu menu : menus){
            count++;
            System.out.print(count+". [메뉴명] "+menu.name);
            System.out.println("  [가격] "+menu.price);
        }
    }

    static void task(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("프로그램 종료 : -1");
        System.out.print("Enter >>>");
        int choice = sc1.nextInt();

        if(choice == -1){

        } else {
            Menu.clearMenu();
            menus.get((choice - 1)).printSubMenu();
            total_price += menus.get((choice - 1)).price;
            Kiosk.Subtask();
        }
        sc1.close();
    }

    static void Subtask(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("메뉴로 가기 : -1ㅣ프로그램 종료 : 0");
        System.out.print("Enter >>>");
        String choice2 = sc2.nextLine();
        if(choice2.equals("-1")){
            count = 0;
            choice2 = "";
            Kiosk.printMenu();
            Kiosk.task();
        } else if(choice2.equals("0")){
            System.exit(0);
        } else {
            if(choice2.equals("연하게")){
                total_price += Menu.sub_menu.get(0).price;
            }
            if(choice2.equals("샷 추가")) {
                total_price += Menu.sub_menu.get(1).price;
            }
            if(choice2.equals("바닐라시럽 추가")){
                total_price += Menu.sub_menu.get(2).price;

            }
            if(choice2.equals("아몬드밀크변경")){
                total_price += Menu.sub_menu.get(3).price;

            }
        }
        System.out.println("[총 가격] " +Kiosk.total_price);
    }

}
