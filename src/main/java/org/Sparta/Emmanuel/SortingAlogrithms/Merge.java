package org.Sparta.Emmanuel.SortingAlogrithms;

import java.util.Random;
import java.util.Scanner;

import org.Sparta.Emmanuel.View.Printer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.Sparta.Emmanuel.myExceptions.Log;

public class Merge
{

    private static Logger theLogger = LogManager.getLogger(Merge.class);
    static  int[] sortedArray;
    static int[] unsortedArray;

    static Printer printer = new Printer();


    public static void mergingArray ()

    {

        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;
        do {

                    printer.displayArraySize();
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


        sortedArray = new int[arraySize];
        unsortedArray = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt(20) + 1;
            sortedArray[i] = unsortedArray[i];
        }
        splitAndMerge(sortedArray);


    }



    public static void start()

    {
        Log log = new Log();
        // log.runLogger();

    }

    public static void splitAndMerge(int[] array) {
        int arrayLength = array.length;
        int midpoint = arrayLength / 2;
        int[] leftSide = new int[midpoint];
        int[] rightSide = new int[arrayLength - midpoint];


        for (int i = 0; i < midpoint; i++) {
            leftSide[i] = array[i];
        }

        for (int j = midpoint; j < arrayLength; j++) {
            rightSide[j - midpoint] = array[j];
        }
        if (arrayLength < 2) {
            return;
        }
        splitAndMerge(leftSide);
        splitAndMerge(rightSide);
        Merge.mergeArrays(leftSide, rightSide, array);
    }

    public static void mergeArrays(int[]firstArray , int[]secondArray , int[]mergedArray)


    {
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int mergedArrayIndex = 0;




        while(firstArrayIndex < firstArray.length && secondArrayIndex < secondArray.length)

        {



            if (firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) {
                mergedArray[mergedArrayIndex] = firstArray[firstArrayIndex];
                firstArrayIndex++;
                mergedArrayIndex++;



            } else {
                mergedArray[mergedArrayIndex] = secondArray[secondArrayIndex];
                secondArrayIndex++;
                mergedArrayIndex++;

            }




        }

        while(firstArrayIndex < firstArray.length )

        {
            mergedArray[mergedArrayIndex] = firstArray[firstArrayIndex];
            firstArrayIndex++;
            mergedArrayIndex++;
        }

        while(secondArrayIndex < secondArray.length )

        {
            mergedArray[mergedArrayIndex] = secondArray[secondArrayIndex];
            secondArrayIndex++;
            mergedArrayIndex++;
        }




    }

    public int[] getMergedArray(int[] unsortedArray){
        splitAndMerge(unsortedArray);
        return unsortedArray;
    }

    public static int[] getSortedArray() {
        return sortedArray;
    }

    public static int[] getUnsortedArray() {
        return unsortedArray;
    }



}
