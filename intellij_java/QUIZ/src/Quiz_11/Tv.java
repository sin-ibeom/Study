package Quiz_11;

public class Tv {

    boolean power = false;
    int volume = 0;
    int channel;

    void powerOn(){
        power = true;
    }
    void powerOff(){
        power = false;
    }
    void volumeup(){
        if(power && volume < 10){
            volume++;
            System.out.println("현재 볼륨 : " + volume);
        } else System.out.println("ERROR");
    }
    void volumedown(){
        if(power && volume > 0){
            volume--;
            System.out.println("현재 볼륨 : " + volume);
        } else System.out.println("ERROR");
    }
    void channel(int channel){
        if(power && 999 > channel && channel >= 1){
            this.channel = channel;
            System.out.println("채널이 변경되었습니다.");
        } else System.out.println("ERROR");
    }
    void info(){
        System.out.println("현재 전원 여부 : ");
        if (power){
            System.out.print("켜짐");
        } else System.out.print("꺼짐");
        System.out.println("현재 볼륨 : " + volume);
        System.out.println("현재 채널 : " + channel);
    }

}
