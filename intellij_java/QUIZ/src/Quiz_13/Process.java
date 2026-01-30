package Quiz_13;

import java.util.Scanner;

public class Process {
    Item item;


    void run(Item item){
        this.item = item;
        System.out.println(this.item.getName() + " 생산 완료");;
    }

}
