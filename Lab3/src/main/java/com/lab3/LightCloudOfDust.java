package com.lab3;

public class LightCloudOfDust extends Abstract_SimplePerson {
    public LightCloudOfDust() {
        super("Лёгкое облако пыли", HeroType.NOTLIVE);
    }

    public void move() {
        System.out.println(getName() + " поднялось с полок;");
    }
}
