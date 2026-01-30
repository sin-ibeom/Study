package Quiz_05;

public class Gmarket {
    public static void main(String[] args) {

        User u1 = new User(1111);
        u1.buy(new Object("음료", 5000, "음료입니다"));

        System.out.println("ID: " + u1.id);
        System.out.println("상품명: " + u1.objects.get(0).name);
        System.out.println("가격: " + u1.objects.get(0).price);
        System.out.println("상품 설명: " + u1.objects.get(0).desc);
    }
}
