package com.sda.exercises.loops;

import com.sda.exercises.BaseExample;

import java.util.Iterator;
import java.util.List;

public class LoopsExamples extends BaseExample {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("First", "Second", "Third", "Fourth");

        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i));
        }

        System.out.println(EXAMPLE_DELIMITER);

        for (String string : listOfStrings) {
            System.out.println(string);
        }

        System.out.println(EXAMPLE_DELIMITER);

        int i = 0;
        while (i < listOfStrings.size()) {
            System.out.println(listOfStrings.get(i));
            i++;
        }

        System.out.println(EXAMPLE_DELIMITER);

        Iterator<String> iterator = listOfStrings.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
