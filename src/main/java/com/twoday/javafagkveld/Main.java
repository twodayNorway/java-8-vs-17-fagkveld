package com.twoday.javafagkveld;

import com.twoday.javafagkveld.AvsluttendeOppgaver.Oppgaver;
import com.twoday.javafagkveld.Records.Forest;
import com.twoday.javafagkveld.Switch.AustralianAnimals;

public class Main {
    public static void main(String[] args) {
        // TODO: For hver oppgave, kommenter ut den forrige og kjør.

        // Records
        // Skal printe: "Koala Coco er 4 år gammel, og har spist 20 blader i dag."
        Forest forest = new Forest();
        System.out.println(forest.findCocoTheKoala());

        // Switch expressions
        // Skal printe "LEAVES"
        AustralianAnimals aa = new AustralianAnimals();
        System.out.println(aa.animalFoodGammel(AustralianAnimals.AnimalsInAustralia.KANGAROO));

        // Text Blocks
        // Skal ramse opp Koala, Kenguru, Slanger og Klovnefisk under hverandre
        System.out.println(Oppgaver.animalTextBlock());
        // Skal skrive ut lesbar html-kode
        System.out.println(Oppgaver.htmlTextBlock());

        // Pattern matching
        // skal skrive: Human!, platypus" og non-aborigine person!
        Oppgaver.patternMatching();
    }
}
