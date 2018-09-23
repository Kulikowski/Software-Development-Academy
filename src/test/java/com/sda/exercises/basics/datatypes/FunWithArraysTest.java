package com.sda.exercises.basics.datatypes;

import com.sda.exercises.basics.loops.FunWithArrays;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunWithArraysTest {
    private FunWithArrays sut;

    @Before
    public void setup() {
        sut = new FunWithArrays();
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
