package com.Sparta.Emmanuel.Tests;
import org.Sparta.Emmanuel.SortingAlogrithms.BinaryTreeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinarySortTest {

    int[] bubbleArrayToSort = {3,6,2,7,3,9,4,50,44,43,214};
    int[] bubbleArraySortedAsc = {2, 3, 3, 4, 6, 7, 9, 43,44,44, 50, 214};
    int[] bubbleArraySortedDesc = {214, 50,44,44, 43, 9, 7, 6, 4, 3, 3, 2};


    @Test
    public void testBinaryImplementation()
    {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl(44);
        binaryTree.addElements(bubbleArrayToSort);
        Assertions.assertEquals(12, binaryTree.getNumberOfElements());
        Assertions.assertEquals(44, binaryTree.getRootElement());
        Assertions.assertEquals(false, binaryTree.findElement(88));
        Assertions.assertEquals(true, binaryTree.findElement(9));
        Assertions.assertEquals(Arrays.toString(bubbleArraySortedAsc), (binaryTree.getSortedTreeAsc()));
        Assertions.assertEquals(Arrays.toString(bubbleArraySortedDesc), (binaryTree.getSortedTreeDesc()));












    }
}
