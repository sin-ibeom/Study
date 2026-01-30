package Quiz_01;

public class ParkingTicket {

    Car car;
    Member member;
    int in_time;
    int buy_price;
    int total_price;

    ParkingTicket(Car car, Member member, int in_time){
        this.car = car;
        this.member = member;
        this.in_time = in_time;
    }

    void addReceipt(Receipt receipt) {
        this.buy_price += receipt.buy_price;
    }

}
