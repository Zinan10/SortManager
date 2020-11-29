package org.Sparta.Emmanuel.SortingAlogrithms;


import java.util.Arrays;
import java.util.Scanner;

import org.Sparta.Emmanuel.RandomArrayGenerator;
import org.Sparta.Emmanuel.View.Printer;
import org.Sparta.Emmanuel.myExceptions.ChildNotFoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.Sparta.Emmanuel.View.SortChoice;

public class BinaryTreeImpl implements BinaryTree {

    private final Node rootNode;
    static Printer printer = new Printer();
    static RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator();



    public int[] getSortedTree() {
        return sortedTree;
    }

    public int getTheCount() {
        return theCount;
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public static Logger getTheLogger() {
        return theLogger;
    }

    public static int[] getTheArray() {
        return theArray;
    }

    private int[] sortedTree;
    private int theCount;
    private int numberOfNodes;
    private static Logger theLogger = LogManager.getLogger(BinaryTreeImpl.class);
    static int[] theArray;


    public BinaryTreeImpl(final int element) {
        rootNode = new Node(element);
        numberOfNodes = 1;

    }

    public BinaryTreeImpl(final int[] elements) {

        rootNode = new Node(elements[0]);
        for (int i = 1; i < elements.length; i++) {
            addElement(elements[i]);
        }

        numberOfNodes = elements.length;
        theArray = elements;

    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numberOfNodes;
    }

    @Override
    public void addElements(final int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }

    @Override
    public void addElement(final int element) {

        addToTree(rootNode, element);
    }

    @Override
    public boolean findElement(final int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException

    {
        if(findElement(element)) {

            return findNode(element).getLeftChild().getValue();

        }

        else
        {
            throw new ChildNotFoundException("Child Not found");
        }

    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException
    {
        if(findElement(element)) {

            return findNode(element).getRightChild().getValue();

        }

        else
        {
            throw new ChildNotFoundException("Child Not found");
        }
    }

    @Override
    public String getSortedTreeAsc() {
        sortedTree = new int[numberOfNodes];
        theCount = 0;
        sortTreeAsc(rootNode);
        return Arrays.toString(sortedTree);

    }

    public String getTreeAsc(int[]toSort) {
        toSort = new int[numberOfNodes];
        theCount = 0;
        sortTreeAsc(rootNode);
        return Arrays.toString(toSort);

    }

    @Override
    public String getSortedTreeDesc() {
        sortedTree = new int[numberOfNodes];
        theCount = 0;
        sortTreeDesc(rootNode);
        return Arrays.toString(sortedTree);
    }
    public String getTreeDesc(int[]toSort) {
        toSort = new int[numberOfNodes];
        theCount = 0;
        sortTreeDesc(rootNode);
        return Arrays.toString(toSort);
    }
    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null){
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    private void addToTree(Node node, int element) {
        if (element == node.getValue())
            System.out.println("");;

        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
                numberOfNodes++;
            } else {
                addToTree(node.getLeftChild(), element);
            }
        } else if (node.isRightChildEmpty()) {
            node.setRightChild(new Node(element));
            numberOfNodes++;
        } else {
            addToTree(node.getRightChild(), element);
        }
    }

    private void sortTreeAsc(Node node) {
        if (node.isLeftChildEmpty() == false) {
            sortTreeAsc(node.getLeftChild());
        }
        sortedTree[theCount] = node.getValue();
        theCount++;
        if (node.isRightChildEmpty() == false) {
            sortTreeAsc(node.getRightChild());
        }


    }

    private void sortTreeDesc(Node node) {
        if (node.isRightChildEmpty() == false) {
            sortTreeDesc(node.getRightChild());
        }
        sortedTree[theCount] = node.getValue();
        theCount++;
        if (node.isLeftChildEmpty() == false) {
            sortTreeDesc(node.getLeftChild());
        }
    }

public static void performTreeSort() {
    Scanner secondScanner = new Scanner(System.in);
    Scanner thirdScanner = new Scanner(System.in);
    int binaryChoice = 0;
    int arraySize = 0;
    boolean valid;


    do {
     printer.displayBinaryChoices();


        try {
            binaryChoice = secondScanner.nextInt();


            if (binaryChoice == 4) {
                do {

                            printer.displayArraySize();
                    try {
                        arraySize = thirdScanner.nextInt();
                        BinaryTreeImpl btl = new BinaryTreeImpl(randomArrayGenerator.generateRandomArray(arraySize));
                        btl.getSortedTreeAsc();
                        SortChoice.printBSTASC();
                        break;
                    } catch (Exception e) {
                        printer.printArrayError();

                    } finally {
                        thirdScanner = new Scanner(System.in);

                    }
                }
                while (arraySize < 1);

            }
              if (binaryChoice == 5) {
                  do {

                      printer.displayArraySize();

                      try {
                          arraySize = thirdScanner.nextInt();
                          BinaryTreeImpl btl = new BinaryTreeImpl(randomArrayGenerator.generateRandomArray(arraySize));
                          btl.getSortedTreeDesc();
                          SortChoice.printBSTDSC();
                          break;
                      } catch (Exception e) {
                          printer.printArrayError();
                      } finally {
                          thirdScanner = new Scanner(System.in);

                      }
                  }
                  while (arraySize < 1);
            }
        } catch (Exception e) {
                    printer.binaryError();
                    theLogger.error("Value entered is invalid " + " " + e.getMessage());

        } finally {
            secondScanner = new Scanner(System.in);
        }

    }

    while ( binaryChoice < 4 || binaryChoice > 5) ;
}

    private class Node {
        int nodeValue;
        Node left = null;
        Node right = null;
        public Node(int element) {

            this.nodeValue = element;

        }

        public int getValue()


        {
            return nodeValue;
        }

        public Node getLeftChild() 

        {

            return left;
        }

        public Node getRightChild()

        {
            return right;
        }



        public boolean isLeftChildEmpty()

        {
            if(left == null) {
                return true;
            }

            return false;
        }

        public boolean isRightChildEmpty()

        {
            if(right == null) {
                return true;
            }

            return false;
        }

        public void setRightChild(Node setRight)

        {
            right = setRight;
            }

        public void setLeftChild(Node setLeft)

        {
            left = setLeft;
        }


    }
}
