package com.sda.exercises.generics.examples;

public class GenericTwoValues<T, U> {
    private final T item;
    private final U additionalItem;


    public GenericTwoValues(T item, U additionalItem) {
        this.item = item;
        this.additionalItem = additionalItem;
    }

    public T getItem() {
        return item;
    }

    public U getAdditionalItem() {
        return additionalItem;
    }
}
