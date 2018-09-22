package com.sda.exercises.generics;

import com.sda.exercises.BaseExample;
import com.sda.exercises.generics.examples.GenericContainer;
import com.sda.exercises.generics.examples.GenericTwoValues;
import com.sda.exercises.generics.examples.GenericTwoValuesComplex;

import java.io.IOException;
import java.util.Map;

public class GenericsExamples extends BaseExample {
    public static void main(String[] args) {
        GenericContainer<String> stringGenericContainer = new GenericContainer<>("Example");
        System.out.println(stringGenericContainer.getItem());

        System.out.println(EXAMPLE_DELIMITER);

        GenericTwoValues<Integer, String> genericTwoValues = new GenericTwoValues<>(5, "Another Example");
        System.out.println(genericTwoValues.getItem() + " " + genericTwoValues.getAdditionalItem());

        System.out.println(EXAMPLE_DELIMITER);

        Map<Integer, String> map = GenericTwoValuesComplex.wrapToMap(15);
        map.entrySet().forEach(System.out::println);

        System.out.println(EXAMPLE_DELIMITER);

        boolean doThrowException = true;
        try {
            GenericTwoValuesComplex.throwMeConditional(doThrowException, new IOException("Test of Generic Exception"));
        } catch (IOException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
