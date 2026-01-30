package Quiz_07;

public class Fan {
    int power = 0;
    boolean fan_power = false;




    void power_2(){
        if(fan_power){
            power = 2;
            System.out.println("바람이 나옵니다 : " + power);
        } else {
            System.out.println("전원은 먼저 켜주세요.");
        }
    }
    void power_1(){
        if(fan_power){
            power = 1;
            System.out.println("바람이 나옵니다 : " + power);
        } else {
            System.out.println("전원은 먼저 켜주세요.");
        }
    }

    void power_on(){
        fan_power = true;
        System.out.println("선풍기의 전원이 켜졌습니다.");
    }
    void power_off(){
        fan_power = false;
        System.out.println("선풍기의 전원이 꺼졌습니다.");
    }
}
