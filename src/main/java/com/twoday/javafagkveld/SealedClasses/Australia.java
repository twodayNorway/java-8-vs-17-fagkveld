package com.twoday.javafagkveld.SealedClasses;

public class Australia {
    public void printRelevantState(AustralianState state) {

    }
}

/**
 * Australian City
 */
interface AustralianCity { }

interface Sydney extends AustralianCity { }


/**
 * Australian States
 */
class AustralianState { }

class WesternAustralia extends AustralianState{ }
class SouthAustralia extends AustralianState{ }
class Queensland extends AustralianState{ }
class NewSouthWales extends AustralianState{ }
class Victoria extends AustralianState{ }
class Tasmania extends AustralianState{ }