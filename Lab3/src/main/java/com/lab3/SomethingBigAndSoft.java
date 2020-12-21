package com.lab3;

public class SomethingBigAndSoft extends Abstract_Person {

    public SomethingBigAndSoft() {
        super("Что-то большое и мягкое", HeroType.UNKNOWN);
    }

    public void move(Interface_Person opponent) {
        System.out.println(getName() + " хлестнуло " + opponent.getName() + " по лицу;");
    }
}
