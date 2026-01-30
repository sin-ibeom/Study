package Quiz_15;

import java.util.ArrayList;

public class League {
    String name;
    ArrayList<Pokemon> pokemons = new ArrayList<>(4);

    League(String name) {
        this.name = name;
    }

    void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    void battle_round1() {
        if (pokemons.get(0).getMaxHealth() > 0 && pokemons.get(1).getMaxHealth() > 0) {
            Battle battle = new Battle();
            battle.run(pokemons.get(0), pokemons.get(1));
        }
        if (pokemons.get(0).getMaxHealth() < 0) {
            System.out.println(pokemons.get(1).name + "이/가 쓰러졌다.");
        } else {
            System.out.println(pokemons.get(0).name + "이/가 쓰러졌다.");
        }
    }

    void battle_round2() {
        if (pokemons.get(2).getMaxHealth() > 0 && pokemons.get(3).getMaxHealth() > 0) {
            Battle battle = new Battle();
            battle.run(pokemons.get(2), pokemons.get(3));
        }
        if (pokemons.get(2).getMaxHealth() < 0) {
            System.out.println(pokemons.get(3).name + "이/가 쓰러졌다.");
        } else {
            System.out.println(pokemons.get(2).name + "이/가 쓰러졌다.");
        }
    }
}
