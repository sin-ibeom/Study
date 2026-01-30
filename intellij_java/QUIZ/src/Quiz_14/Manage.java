package Quiz_14;

import java.util.ArrayList;

public class Manage {

    ArrayList<Room> rooms = new ArrayList<Room>();

    void addRoom(Room room, int in_time, int out_time){
        if(10 >= out_time && out_time > in_time && in_time >= 1) {
            if(rooms.size() < 5){
                this.rooms.add(room);
                System.out.println("[입실] " + in_time + "일" + "  [퇴실] " + out_time + "일");
                System.out.println("예약이 완료 되었습니다.");
            } else {
                System.out.println("만실입니다.");
            }
        } else {
            System.out.println("해당 날짜에는 예약이 불가합니다.");
        }
    }

}
