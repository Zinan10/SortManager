# Sort Manager Project
<img src = "https://embed-ssl.wistia.com/deliveries/70d6f4e10e2badb5ef394f00c17ad2bc1c14f6e7.jpg" width = "650px" >

The task given was to implement a sort manager program whereby a user through a user input will be able to have a given array of values sorted with whichever one of the three choices given to them. The user is also forced to valid input as input validation is placed in check to manage this. The user is given a choice of either a bubble sort , a merge sort and a binary sort.


##### Table of Contents  
[Requirements](#requirements)  
[Brief Introduction](#brief-introduction)  

 
  

## Requirements 
- The user should be able to select any choice of three sort algorithms.
- A random array should be generated for the user to sort as opposed to typing the values themselves
- Input validation should be put in place to ensure only valid input is given to the program.
- The implementaion of the factory design pattern so ensure loose coupling of the code.
- SOLID principles followed throughout the development of this project.

## Brief Introduction

This program was given to us to develop after learning about exceptions, loggers, user input, interfaces and input validation.

- Exceptions were used throughout this project and we were tasked to develop our own exception called the ChildNotFoundException for the tree sorting alogrthm
- Loggers to keep track of warnings, errors and any message that migh tbe of interest to the program
- User input to collect the user input and return an array based on the given values.
- Interfaces in other to follow I in the SOLID principles, interface segregation was to be followed
- Input validation was also required as the user should only be allowed to enter reasonable values into the program (e.g typing "five" when asked for the size of the random array)


## Code Snippets

```java
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
```
