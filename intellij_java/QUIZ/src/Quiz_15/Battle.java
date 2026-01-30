package Quiz_15;

import java.util.ArrayList;

public class Battle {

    void run(Pokemon p1,  Pokemon p2) {
        while(p1.maxHealth > 0 && p2.maxHealth > 0) {
            // 전투 메서드

            System.out.print(p1.getName() + "이/가");
            p2.maxHealth -= p1.attack(p1, p2);
            System.out.println("\n"+p2.name + "[HP] : " + p2.getMaxHealth());
            System.out.println();

            System.out.print(p2.getName() + "이/가");
            p1.maxHealth -= p2.attack(p2, p1);
            System.out.println("\n"+p1.name + "[HP] : " +  p1.getMaxHealth());
            System.out.println();
        }
    }
}
