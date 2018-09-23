package com.sda.exercises.basics.loops;

import com.google.common.annotations.VisibleForTesting;

public class FunWithArrays {

    //Annotation is not really doing anything
    //Used to make it obvious for other programmers
    //why this field is package-visible (default access modifier)

    @VisibleForTesting
    final int[] array = {5, 6, 8, 1, 3};

    public int firstItemInArray() {
        return 0;
    }

    public int lastItemInArray() {
        return 0;
    }

    public long sumOfItemsInArray() {
        return 0;
    }
}
