package org.Sparta.Emmanuel.View;

import org.Sparta.Emmanuel.Manager.SortFactory;
import org.Sparta.Emmanuel.SortingAlogrithms.*;
import org.Sparta.Emmanuel.myExceptions.ChildNotFoundException;

import java.util.Arrays;

public class SortChoice

{
static Printer printer = new Printer();

    public static void printArrays()

    {
        SortFactory sortFactory = new SortFactory();
        sortFactory.choiceOfSort();

    }


    public static void printBubble()

    {
        String firstText = "Bubble sorting the Array";
        printer.printText(firstText);
        BubbleSort.getbubbleSortArray();
        printer.printBubbleArrays();
    }

    public static void printMerge()

{
    Merge.mergingArray();
    printer.printMergeArrays();
}

public static void printBSTASC() throws ChildNotFoundException {
        printer.printAscending();


}

    public static void printBSTDSC()

    {
        printer.printDesceding();

    }


}
