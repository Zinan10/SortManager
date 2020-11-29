package org.Sparta.Emmanuel.View;

import org.Sparta.Emmanuel.SortingAlogrithms.BinaryTreeImpl;
import org.Sparta.Emmanuel.SortingAlogrithms.BubbleSort;
import org.Sparta.Emmanuel.SortingAlogrithms.Merge;
import org.Sparta.Emmanuel.myExceptions.ChildNotFoundException;

import java.util.Arrays;

public class Printer
{
  BinaryTreeImpl btl = null;
  BubbleSort bubbleSort = new BubbleSort();
    public void printArray(int[]theArray)

    {
        System.out.println(Arrays.toString(theArray));
    }

    public void printText(String text)

    {
        System.out.println(text);
    }

    public void displayChoices()

    {
        System.out.println("What choice do you want to sort?");
        System.out.println("Press 1 for bubble sort");
        System.out.println("Press 2 for merge sort");
        System.out.println("Press 3 for Binary Tree sort");
    }
    public void displayArraySize() {
        System.out.println("Please enter the size of the given array that is greater than 1: ");

    }

    public void printArrayError()

    {
        System.err.println("Enter a proper Value for the Array size");
    }

    public void binaryError()

    {
        System.err.println("Enter a proper Value for the Array size");
    }


    public void displayBinaryChoices()

    {
        System.out.println("Do you want to sort the tree in Ascending or Descending");
        System.out.println("Press 4 for Ascending");
        System.out.println("Press 5 for Descending");
    }

    public void displayBinaryError()

    {
        System.err.println("Please enter a valid number for the sorting");

    }

    public void printBubbleArrays()

    {
        System.out.println("Old array " + Arrays.toString(bubbleSort.getBubbleUnsortedArray()));
        System.out.println("Sorted array " + Arrays.toString(bubbleSort.getBubbleSortedArray()));
    }

    public void printMergeArrays()

    {
        System.out.println("Old array " + Arrays.toString(Merge.getUnsortedArray()));
        System.out.println("Sorted Array " + Arrays.toString(Merge.getSortedArray()));
    }

    public void printAscending()  {
             btl = new BinaryTreeImpl(BinaryTreeImpl.getTheArray());
        System.out.println("This is the old Array " + Arrays.toString(btl.getTheArray()));
        System.out.println("The root element is " + btl.getRootElement());
        System.out.println("Sorting in Ascending order " + btl.getSortedTreeAsc());

    }

    public void printDesceding()

    {
        btl = new BinaryTreeImpl(BinaryTreeImpl.getTheArray());
        System.out.println("This is the old Array " + Arrays.toString(btl.getTheArray()));
        System.out.println("The root element is " + btl.getRootElement());
        System.out.println("Sorting in Ascending order " + btl.getSortedTreeAsc());
    }

}
