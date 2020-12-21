package com.lab3;

public class TerribleNoise extends Abstract_SimplePerson {

    public TerribleNoise() {
        super("Страшный грохот", HeroType.NOTLIVE);
    }

    public void move() {
        System.out.println(getName() + " донёсся;");
    }
}
