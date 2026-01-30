package sec04_return;

public class CarExam {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.isLeftGas());

        car.setGas(3);
        System.out.println(car.isLeftGas());



    }
}
