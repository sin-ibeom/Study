package Quiz_04;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe(
                "상호",
                1000000
        );
        cafe.menu_add(new Menu("아아"));
        cafe.menu_add(new Menu("따아"));



    }
}
