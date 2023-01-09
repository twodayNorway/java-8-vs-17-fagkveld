package com.twoday.javafagkveld.AvsluttendeOppgaver;

public sealed class Mammals permits Platypus, Human {
    public String toString(){
        return "Mammal!";
    }

}
