package com.Sparta.Emmanuel.Tests;

import org.Sparta.Emmanuel.SortingAlogrithms.Merge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class MergeSortTests {

    int[] arrayToSort = {1,6,2,7,3,9,4,55,43,213};
    int[] arraySorted = {1, 2, 3, 4, 6,7, 9,43,55,213};
    Merge merge = new Merge();


    @Test
    public void testMergeSort(){

        Assertions.assertEquals(Arrays.toString(arraySorted), Arrays.toString(merge.getMergedArray(arrayToSort)));
        Assertions.assertEquals(10 , (merge.getMergedArray(arraySorted).length ));

    }

}
