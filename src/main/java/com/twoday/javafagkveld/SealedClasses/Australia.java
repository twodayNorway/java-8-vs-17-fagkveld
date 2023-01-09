package com.twoday.javafagkveld.SealedClasses;

// TODO: Skriv om klassene i denne filen om til sealed klasser/interfaces slik at
// TODO: det ikke er mulig å arve/implementere noen av de fra utsiden.

/**
 * Australske byer du absolutt burde besøke
 */
interface CoolAustralianCity { }

interface Sydney extends CoolAustralianCity { }
interface Wollongong extends CoolAustralianCity { }
interface Melbourne extends CoolAustralianCity { }


/**
 * Australske stater som bare har det beste av det beste
 */
class CoolAustralianState { }

class SouthAustralia extends CoolAustralianState { }
class NewSouthWales extends CoolAustralianState implements Wollongong, Sydney { }
class Victoria extends CoolAustralianState implements Melbourne { }
class Tasmania extends CoolAustralianState { }

