package com.sda.exercises.basics;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class ConditionStatementsTest {

    private ConditionStatements sut;

    @Before
    public void setup() {
        sut = new ConditionStatements();
    }

    @Test
    public void testIsAGreaterThanB() {
        assertFalse(sut.isAGreaterThanB(2, 5));
        assertTrue(sut.isAGreaterThanB(12, 5));
    }

    @Test
    public void testBiggestFromThree() {
        assertEquals(9, sut.biggestFromThree(8, 1, 9));
        assertEquals(100, sut.biggestFromThree(-2, 100, 9));
        assertEquals(0, sut.biggestFromThree(0, -100, -100));
        assertEquals(0, sut.biggestFromThree(0, 0, 0));
    }

    @Test
    public void testBiggestFromFour() {
        assertEquals(9, sut.biggestFromFour(2, 8, 1, 9));
        assertEquals(100, sut.biggestFromFour(-90, -2, 100, 9));
        assertEquals(0, sut.biggestFromFour(0, -100, -2, -100));
        assertEquals(0, sut.biggestFromFour(0, 0, 0, 0));
    }
}
