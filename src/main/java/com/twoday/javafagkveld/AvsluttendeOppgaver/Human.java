package com.twoday.javafagkveld.AvsluttendeOppgaver;

public sealed class Human extends Mammals permits Aborigines, OtherPeople{
    public String toString(){
        return "Human!";
    }
}
non-sealed class Aborigines extends Human{
    public String toString(){
        return "aborigine!";
    }
}

non-sealed class OtherPeople extends Human{
    public String toString(){
        return "non-aborigine person!";
    }
}
