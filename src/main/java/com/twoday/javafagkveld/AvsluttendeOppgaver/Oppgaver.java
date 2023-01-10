package com.twoday.javafagkveld.AvsluttendeOppgaver;

public class Oppgaver {

    public static String animalTextBlock() {
        String animals = "Av mange dyr i Australia kan vi nevne noen: \nKoala \nKenguru \nslanger \nklovnefisk, også kalt \"nemo\"fisk";
        //TODO: skriv om animals til å være en text block
        return animals;
    }

    public static String htmlTextBlock() {
        String htmlKode = "<button>\n" +
                "    <p>\n" +
                "        'heiheih' \n"  +
                "    </p>\n" +
                "</button>";
        //TODO: skriv om htmlKode til å være en text block
        return htmlKode;
    }

    public static void patternMatching() {
        //TODO: skriv om til å sjekke og caste i samme sleng
        Human human = new Human();
        if (human instanceof Mammals) {
            Mammals mammal = (Mammals) human;
            System.out.println(mammal.toString());
        }
        //TODO: Legg til pattern matching for å sjekke (og evt caste) om Platypus er en mammal
        // og om OtherPeople er mammals
    }

    // TODO: Skriv om println ved bruk av Compact Number Formatting
    // TODO: slik at formatet på 'befolkningAU' blir på "25,69 millioner".
    public static void compactNumberFormatting() {
        var befolkningAU = 25_690_000;

        System.out.println("Befolkningen i Australia er per 2021 " + befolkningAU);
    }


    /**
     * prøv å løse først uten å kommenter ut og kjøre
     * Er kodesnuttene under gyldige?
     *
     * A
     * var number = 7;
     * number = "fire";
     *
     * B
     * var = null;
     *
     * C
     * var var = "var";
     *
     * D
     * var variable = (Animal a) -> a.canHop();
     *
     * E
     * Predicate<String> p = (var x) -> true;
     */



}
