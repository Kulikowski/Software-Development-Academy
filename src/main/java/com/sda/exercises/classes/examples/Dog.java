package com.sda.exercises.classes.examples;

public class Dog {
    private final String name;
    private final Type type;

    /**
     * Class can have multiple constructors
     * @param name
     * @param type
     */

    public Dog(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Class can have multiple constructors
     * @param name
     */
    public Dog(String name) {
        this.name = name;
        this.type = Type.UNKNOWN;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String introduceYourself() {
        return "Hi, I am: " + name + " and I am of type: " + type;
    }
}
