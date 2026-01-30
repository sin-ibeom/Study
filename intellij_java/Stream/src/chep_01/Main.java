package chep_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello");
        list.add("World");

        list.stream()
                .filter(s -> s.equals("Hello"))
                .limit(1)
                .forEach(System.out::println);
    }
}
