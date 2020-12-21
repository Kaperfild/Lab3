package com.lab3;

public class Enemy extends Abstract_SimplePerson {
    public Enemy() {
        super("Враг", HeroType.UNKNOWN);
    }

    public void move(){
        System.out.println("Словно " + getName() + " был матерчатый;");
    }
}
