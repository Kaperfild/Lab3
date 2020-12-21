package com.lab3;

abstract class Abstract_SimplePerson extends Abstract_Person implements Interface_SimplePerson {

    public Abstract_SimplePerson(String name, HeroType type) {
        super(name, type);
    }

    public abstract void move();

}
