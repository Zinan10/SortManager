package org.Sparta.Emmanuel.SortingAlogrithms;

import java.util.Random;
import java.util.Scanner;

import org.Sparta.Emmanuel.View.Printer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort

{
    private static Logger theLogger = LogManager.getLogger(BubbleSort.class);
   static Printer printer = new Printer();

    public static int[] getBubbleSortedArray() {
        return bubbleSortedArray;
    }

    public static int[] getBubbleUnsortedArray() {
        return bubbleUnsortedArray;
    }

    static  int[] bubbleSortedArray;
    static int[] bubbleUnsortedArray;


    public static void bubblesort (int [] array)

    {
int temporary = 0;

for (int i = 0; i < array.length; i++)

{
    for (int j = 1; j <array.length - i; j++)

    {
if(array[j - 1] > array[j])

{
    temporary = array[j-1];
    array[j-1] = array[j];
    array[j] = temporary;


}
    }
}


    }

    public static void getbubbleSortArray()

    {
        printer.displayArraySize();
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;
        do {


            try {
                arraySize = scanner.nextInt();
            } catch (Exception e) {
            printer.printArrayError();
            theLogger.error("Value entered is invalid " + " " + e.getMessage());
                e.printStackTrace();
            } finally {
                scanner = new Scanner(System.in);
            }
        }

        while (arraySize < 2);


        bubbleSortedArray = new int[arraySize];
        bubbleUnsortedArray = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < bubbleSortedArray.length; i++) {
            bubbleUnsortedArray[i] = random.nextInt(20) + 1;
            bubbleSortedArray[i] = bubbleUnsortedArray[i];
        }
        bubblesort(bubbleSortedArray);


    }

}
