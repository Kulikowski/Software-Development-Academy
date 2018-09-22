package com.sda.exercises.classes.inheritance.examples.cats;

import com.sda.exercises.BaseExample;

public class CatExample extends BaseExample {
    public static void main(String[] args) {
        AbstractCat homeCat = new HomeCat();
        System.out.println(homeCat.whatNoiseDoYouMake());
        System.out.println(homeCat.tellMeSomethingAboutYou());

        System.out.println(EXAMPLE_DELIMITER);

        AbstractCat wildCat = new WildCat();
        System.out.println(wildCat.whatNoiseDoYouMake());
        System.out.println(wildCat.tellMeSomethingAboutYou());
    }
}
