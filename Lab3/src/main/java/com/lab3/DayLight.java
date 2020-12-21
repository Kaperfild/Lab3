package com.lab3;

public class DayLight extends Abstract_SimplePerson {
    public DayLight() {
        super("Дневной свет", HeroType.NOTLIVE);
    }

    public void move() {
        System.out.println(getName() + " лился;");
    }
}
