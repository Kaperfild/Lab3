package com.lab3;

public class ScreamOfMisa extends Abstract_SimplePerson {
    public ScreamOfMisa() {
        super("Крик Мисы", HeroType.NOTLIVE);
    }

    public void move() {
        System.out.println(getName() + " донёсся;");
    }
}
