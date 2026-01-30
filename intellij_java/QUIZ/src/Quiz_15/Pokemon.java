package Quiz_15;

public class Pokemon {

    String name;
    int maxHealth;
    int attack;
    int defence;

    Pokemon(String name, int maxHealth, int attack,  int defence) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getAttack(){
        return attack;
    }
    public int getDefence(){
        return defence;
    }

    int attack(Pokemon p1, Pokemon p2){
        int random_attack;
        random_attack = (int)(Math.random()*3+1);
        switch(random_attack){
            case 1:
                System.out.print(" 물대포를 발사했다!");
                break;
            case 2:
                System.out.print(" 10만 볼트를 사용했다!");
                break;
            case 3:
                System.out.print(" 몸통박치기를 사용했다!");
                break;
        }
        if(p1.getAttack() > p2.getDefence()){
            return p1.getAttack() - p2.getDefence();
        } else return 0;
    }

}
