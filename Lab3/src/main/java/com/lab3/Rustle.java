package com.lab3;

public class Rustle extends Abstract_SimplePerson{
    public Rustle() {
        super("Шелест", HeroType.NOTLIVE);
    }

    public void move(){
        System.out.println(getName() + " раздался;");
    }
}
