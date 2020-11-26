package org.Sparta.Emmanuel;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import org.Sparta.Emmanuel.View.Printer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import java.util.Random;


public class RandomArrayGenerator
{

    static  int[] sortedArray;
    static int[] unsortedArray;
    Random random = new Random();




public int[] generateRandomArray (int arraySize)

{

    sortedArray = new int[arraySize];
    unsortedArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
        sortedArray[i] = random.nextInt(20) + 1;
        unsortedArray[i] = sortedArray[i];
    }
    return unsortedArray;

}

}
