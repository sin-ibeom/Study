package Quiz_15;

public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon(
                "피카츄",
                10,
                3,
                1
        );
        Pokemon p2 = new Pokemon(
                "파이리",
                30,
                3,
                1
        );
        Pokemon p3 = new Pokemon(
                "꼬북이",
                15,
                2,
                1
                );
        Pokemon p4 = new Pokemon(
                "라이츄",
                17,
                2,
                1
        );




        League league = new League(
                "골드 리그"
        );
        league.addPokemon(p1);
        league.addPokemon(p2);
        league.addPokemon(p3);
        league.addPokemon(p4);

        league.battle_round1();
        System.out.println("===================");
        league.battle_round2();

    }
}
