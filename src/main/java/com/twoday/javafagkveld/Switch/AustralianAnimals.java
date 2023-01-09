package com.twoday.javafagkveld.Switch;

public class AustralianAnimals {

    public enum AnimalsInAustralia{SPIDER, SNAKE, KOALA, KANGAROO};

    enum AnimalFood{INSECTS, RATS, LEAVES};
    public AnimalFood animalFoodGammel(AnimalsInAustralia animal) {
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

