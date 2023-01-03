package com.twoday.javafagkveld.Switch;

public class AustralianAnimals {

    enum AnimalsInAustralia{SPIDER, SNAKE, KOALA, KANGAROO};

    String animalDescription(AnimalsInAustralia animals) {
        var description = switch(animals) {
            case SNAKE, SPIDER ->  "scary looking";
            case KOALA -> {yield "Soooo cute";}
            case KANGAROO -> "very jumpy";
        };
        return description;
    }

    enum AnimalFood{INSECTS, RATS, LEAVES};
    AnimalFood animalFood(AnimalsInAustralia animal) {
        var food = switch(animal) {
            case KOALA, KANGAROO -> AnimalFood.LEAVES;
            case SPIDER -> AnimalFood.INSECTS;
            case SNAKE -> AnimalFood.RATS;
        };
        return food;
    }

    AnimalFood animalFoodGammel(AnimalsInAustralia animal) {
        AnimalFood food;
        switch(animal) {
            case KANGAROO:
            case KOALA:
                food = AnimalFood.LEAVES;
                break;
            case SPIDER:
                food = AnimalFood.INSECTS;
                break;
            case SNAKE:
                food = AnimalFood.RATS;
                break;
            default:
                food = null;
        };
        return food;
    }
}

