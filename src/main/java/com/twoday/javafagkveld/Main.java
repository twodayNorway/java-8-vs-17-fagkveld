package com.twoday.javafagkveld;

import com.twoday.javafagkveld.Records.Forest;
import com.twoday.javafagkveld.Switch.AustralianAnimals;

public class Main {
    public static void main(String[] args) {
        // TODO: For hver oppgave, kommenter ut den
        // TODO: forrige og fjern kommentar fra neste
        // TODO: og kjør.
        // Kanskje lage tester istedenfor?

        // Records
        // Skal printe: "Koala Coco er 4 år gammel, og har spist 20 blader i dag."
        Forest forest = new Forest();
        System.out.println(forest.findCocoTheKoala());

        AustralianAnimals aa = new AustralianAnimals();
        aa.animalFoodGammel(AustralianAnimals.AnimalsInAustralia.KANGAROO);
    }
}
