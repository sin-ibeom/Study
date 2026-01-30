package Quiz_01;

import java.util.ArrayList;

public class ParkingLot {

    ArrayList<ParkingTicket> parkinglot = new ArrayList<>();
    int exit_time;
    int lot_size = 3;

    ParkingLot(int lot_size) {
        this.lot_size = lot_size;
    }


    void enter(Car car, Member m, int in_time){
        if(parkinglot.size() >= lot_size){
            System.out.println("만차입니다");
            return;
        } else {
            ParkingTicket ticket = new ParkingTicket(car, m, in_time);
            parkinglot.add(ticket);
            System.out.println("[입차완료] : " + ticket.car.car_num + "  [입차시간] : " + Calc.hour(ticket.in_time) + "시" + Calc.min(ticket.in_time) +"분");
        }
    }

    void addShopping(String carNum, int amount){
        for(ParkingTicket ticket : parkinglot){
            if(ticket.car.car_num.equals(carNum)){
                ticket.buy_price += amount;
            }
        }
    }

    void exit(String carNum, int out_time){
        this.exit_time = out_time;

        for(ParkingTicket ticket : parkinglot){
            if(ticket.car.car_num.equals(carNum)){

                // 구매 금액 할인
                if(ticket.buy_price >= 100000){
                     out_time -= 240;
                } else if(ticket.buy_price >= 50000){
                    out_time -= 120;
                } else if(ticket.buy_price >= 30000){
                    out_time -= 60;
                }

                // 기본 요금 정산
                if(out_time > 0){
                    if(out_time >= 30){
                        out_time -= 30;
                        ticket.total_price += 2000;
                    } else if(out_time < 30 && out_time > 0){
                        ticket.total_price += 2000;
                        out_time = 0;
                    }
                    ticket.total_price += (out_time / 10) * 1000;
                }

                // 회원 등급 할인
                if(ticket.member.Member_Grade.equals("VIP")){
                    ticket.total_price = Math.toIntExact(Math.round(ticket.total_price * 0.5));
                } else if(ticket.member.Member_Grade.equals("GOLD")){
                    ticket.total_price = Math.toIntExact(Math.round(ticket.total_price * 0.7));
                } else {
                    // 변동 없음.
                    ticket.total_price = Math.toIntExact(Math.round(ticket.total_price * 1));
                }

                if(ticket.member.point > 0){
                    if(ticket.member.point > ticket.total_price){
                        ticket.member.point = ticket.member.point - ticket.total_price;
                        ticket.total_price = 0;
                    } else {
                        ticket.total_price = ticket.total_price - ticket.member.point;
                    }
                }

                System.out.println("[출차완료] : " + ticket.car.car_num + "  [출차시간] : " + Calc.hour(this.exit_time) + "시" +  Calc.min(this.exit_time) + "분" +  "  [정산금액] : "  + ticket.total_price);

            }
        }
    }


}
