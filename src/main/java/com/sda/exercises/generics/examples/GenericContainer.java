package com.sda.exercises.generics.examples;

public class GenericContainer<T> {
    private final T item;

    public GenericContainer(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
