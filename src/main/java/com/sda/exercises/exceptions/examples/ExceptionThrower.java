package com.sda.exercises.exceptions.examples;

import java.io.IOException;

public class ExceptionThrower {
    public void doSomethingWithException() throws IOException {
        throw new IOException("Good to catch");
    }

    public void doThrowConditionally(boolean doThrow) throws IOException {
        if (doThrow) {
            throw new IOException("Good to catch");
        }
    }
}
