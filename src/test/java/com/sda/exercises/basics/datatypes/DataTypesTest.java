package com.sda.exercises.basics.datatypes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class DataTypesTest {
    private DataTypes sut;

    @Before
    public void setup() {
        sut = spy(new DataTypes());
    }

    @Test
    public void testAllPrintsCalled() {
        sut.printValues();

        verify(sut).write(anyInt());
        verify(sut).write(anyDouble());
        verify(sut).write(anyFloat());
        verify(sut).write(anyString());
        verify(sut).write(anyLong());
    }
}
