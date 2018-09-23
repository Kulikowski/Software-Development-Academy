package com.sda.exercises.exceptions.examples;

import java.io.IOException;

public class ExceptionalCases {
    public static void main(String[] args) throws IOException {
        ExceptionThrower thrower = new ExceptionThrower();

        try {
            thrower.doSomethingWithException();
        } catch (IOException e) {
            System.out.println("Got exception: " + e);
        }

        thrower.doThrowConditionally(false);
    }
}
