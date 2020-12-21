package com.lab3;

public class DarkDarkness extends Abstract_SimplePerson {

    public DarkDarkness() {
        super("Кромешная тьма", HeroType.NOTLIVE);
    }

    public void move() {
        System.out.println(getName() + " стояла;");
    }
}
