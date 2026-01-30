package Quiz_01;

public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(3); // 생성자로 남은 자리 지정

        Member m1 = new Member(1111, "Java", "VIP");
        m1.point = 5000; // 포인트 테스트 지정
        Member m2 = new Member(2222, "Python", "NORMAL");
        Member m3 = new Member(3333, "C", "GOLD");

        Car c1 = new Car("111가 1111", "경차");
        Car c2 = new Car("222나 2222", "중형");
        Car c3 = new Car("333다 3333", "대형");

        lot.enter(c1, m1, 600); // 10:00시 입장
        lot.enter(c2, m2, 600); // 10:00시 입장
        lot.enter(c3, m3, 600); // 10:00시 입장
        lot.enter(c3, m3, 600); // 자리 3개, 만차.

        lot.addShopping("111가 1111", 50000);
        lot.addShopping("222나 2222", 10000);
        lot.addShopping("333다 3333", 150000);

        lot.exit("111가 1111", 1230);
        lot.exit("222나 2222", 1650);




    }
}


// 시간 계산
class Calc {
    static int hour(int min){
        if(min / 60 >= 24){
            return (min / 60) - 24;
        } else {
            return min / 60;
        }
    }

    static int min(int min){
        return min % 60;
    }
}
