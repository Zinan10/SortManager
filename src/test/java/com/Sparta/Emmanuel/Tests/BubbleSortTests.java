package com.Sparta.Emmanuel.Tests;
import org.Sparta.Emmanuel.SortingAlogrithms.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTests {

    int[] bubbleArrayToSort = {3,6,2,7,3,9,4,55,43,214};
    int[] bubbleArraySorted = {2, 3,3, 4, 6,7, 9,43,55,214};
    BubbleSort bubbleSort = new BubbleSort();




    @Test
    public void testBubbleSort()
    {
        Assertions.assertEquals(Arrays.toString(bubbleArraySorted), Arrays.toString(bubbleSort.getSortedArray(bubbleArrayToSort)));
        Assertions.assertEquals(10 , (bubbleSort.getSortedArray(bubbleArrayToSort).length ));

    }
}
