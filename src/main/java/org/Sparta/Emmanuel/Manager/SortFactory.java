package org.Sparta.Emmanuel.Manager;
import org.Sparta.Emmanuel.SortingAlogrithms.*;
import org.Sparta.Emmanuel.View.Printer;
import org.Sparta.Emmanuel.View.SortChoice;
import org.Sparta.Emmanuel.View.Starter;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SortFactory
{
    static Logger theLogger = LogManager.getLogger(Starter.class);
    static Printer printer = new Printer();

    public static void choiceOfSort() {
        Scanner firstScanner = new Scanner(System.in);
        int choice = 0;

        do {

            printer.displayChoices();


            try {
                choice = firstScanner.nextInt();

                if (choice == 1)
                {
                    SortChoice.printBubble();
                    break;

                }

                else if (choice == 2) {


                    SortChoice.printMerge();
                    break;

                } else if (choice == 3) {
                    BinaryTreeImpl.performTreeSort();
                    break;
                }
            } catch (Exception e) {

                        printer.displayBinaryError();
                        theLogger.error("Value entered is invalid " + " " + e.getMessage());

            } finally {
                firstScanner = new Scanner(System.in);
            }

        }

        while (choice >= 1 || choice <= 3);
    }

}
