package com.sda.exercises.datatypes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysTest {
    private Arrays sut;

    @Before
    public void setup() {
        sut = new Arrays();
    }

    @Test
    public void testFirstItem() {
        assertEquals(5, sut.firstItemInArray());
    }

    @Test
    public void testLastItem() {
        assertEquals(3, sut.lastItemInArray());
    }

    @Test
    public void testSumOfItemsInArray() {
        assertEquals(23, sut.sumOfItemsInArray());
    }

}
