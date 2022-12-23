package com.twoday.javafagkveld.Records;

import java.util.Arrays;
import java.util.List;

public class Forest {
    List<Koala> koalasInForest = Arrays.asList(
            new Koala("Birgitte", 4, 20),
            new Koala("Johnny", 2, 10),
            new Koala("Adam", 8, 25)
    );

    public Koala findJohnnyTheKoala() {
        return koalasInForest.stream()
                .filter(k -> k.getName().equals("Johnny"))
                .findFirst()
                .orElseThrow();
    }

    // TODO lag en Record av Koala
    static class Koala {
        private final String name;
        private final int age;
        private final int leavesEatenToday;

        public Koala(String name, int age, int leavesEatenToday) {
            this.name = name;
            this.age = age;
            this.leavesEatenToday = leavesEatenToday;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getLeavesEatenToday() {
            return leavesEatenToday;
        }

        @Override
        public String toString() {
            return "Koala " + name + " er " +
                    age + " år gammel, og har spist " +
                    leavesEatenToday + " blader i dag.";
        }
    }
}
