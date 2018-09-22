package com.sda.exercises.generics.examples;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GenericTwoValuesComplex<T, U> {
    private final T item;

    public GenericTwoValuesComplex(T item) {
        this.item = item;
    }

    public List<U> wrapIntoList(U value) {
        return Collections.singletonList(value);
    }

    public T getItem() {
        return item;
    }

    /**
     * Type act as a declaration of type which is child of Object
     */
    public static <Type> Map<Type, String> wrapToMap(Type value) {
        return Collections.singletonMap(value, "Example");
    }

    public static <E extends Throwable> void throwMeConditional(boolean conditional, E exception) throws E {
        if(conditional) {
            throw exception;
        }
    }
}
