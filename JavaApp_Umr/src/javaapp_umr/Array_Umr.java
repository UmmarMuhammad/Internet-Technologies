/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_umr;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;
import java.util.Collections;

class student_ {

    int rollno;
    String name;
}

/**
 * 1-D Array illustration for BCA V Semester Batch 2017
 *
 * @author UMMAR MUHAMMAD
 *
 */
public class Array_Umr {

    //Array declaration
    int DArray[];
    //initialised array
    int number[] = {7, 3, 1, 4, 2, 5, 6};
    int n = number.length;

    //two dimensional array
    int tdArray[][];
    int table[][];
    //static variables
    final static int ROWS = 10;
    final static int COLS = 5;

    //populates an array
    void PopulateArray() {
        DArray = new int[10];
        //System.out.println("the array  is: ");
        for (int i = 0; i < DArray.length; i++) {
            DArray[i] = (i + 1) * 10;
        }
    }

    //enter array elements through keyboard
    void InputArray() {
        //creating an array of 10 ints
        DArray = new int[5];
        System.out.println("input an array: ");
        //input array elements using for-each loop
        for (int i = 0; i < DArray.length; i++) {
            Scanner element = new Scanner(System.in);
            DArray[i] = element.nextInt();
        }
    }

    /*
    *displays the contents of the instance variable DArray
     */
    void Display(int array[]) {
        System.out.println("the array  is: ");
        for (int element : array) {
            System.out.print(element + "\t");//   =(i+1)*10;
        }
    }

    /*
    *Sorts an array
     */
    void Sort() {
        System.out.println("\nthe unordered list is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(number[i] + "\t");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (number[i] > number[j]) {
                    //Swap(& number[i], number[j]);
                    int z = number[i];
                    number[i] = number[j];
                    number[j] = z;
                }
            }
        }
        System.out.println("\nthe sorted list is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(number[i] + "\t");
        }
        System.out.println();
    }

    /*
    *Some of the mostly used Arrays class methods
     */
    void ArraysClass() {
        //performs binary search on an ordered array & returns the index of the key
        int index = Arrays.binarySearch(DArray, 555);
        System.out.print("found at: " + index + "\t");//
        //makes a copy of DArray with a new length & returns the new array
        int newArr[] = Arrays.copyOf(DArray, 10);
        System.out.println("new array after copy: ");//
        Display(newArr);
        //compares two given arrays & returns truth value
        boolean b = Arrays.equals(DArray, newArr);
        System.out.println(b);//
        //copies a range of elements & returns the new array
        int[] newarr1 = Arrays.copyOfRange(DArray, 0, n);
        //fills each element of the array with a given value 0
        Arrays.fill(newArr, 0);
        //returns the first mismatch index where two arrays differ
        int m = Arrays.mismatch(newArr, number);
        //sorts a given array
        Arrays.sort(newArr);
        //converts the array to a string
        String str = Arrays.toString(newArr);
    }

    //java.util.ArrayList class
    void ArrayListClass() {
// size of ArrayList
        int n = 5;
//declaring ArrayList with initial size n
        ArrayList<Integer> arrlst = new ArrayList<Integer>(n);
// Appending the new element at the end of the list
        for (int i = 1; i <= n; i++) {
            arrlst.add(i);
        }
// Printing elements
        System.out.println(arrlst);
// Remove element at index 3
        arrlst.remove(3);
// Displaying ArrayList after deletion
        System.out.println(arrlst);
//adding elements
        arrlst.add(9);
// Displaying ArrayList after deletion
        System.out.println(arrlst);
//arrlst.removeAll(arrlst);
        arrlst.add(3, 555);
        Object o = arrlst.clone();
// Displaying ArrayList after deletion
        System.out.println("clone" + o);
// Displaying ArrayList after deletion
        System.out.println(arrlst);
//checks if 555 is there in arrlst
        boolean b = arrlst.contains(555);
        ArrayList<Integer> arrlst2 = new ArrayList<Integer>(n);

        for (int i = 1; i <= n; i++) {
            arrlst2.add(i);
        }
//if the arrlst2 is in arrlst
        b = arrlst.containsAll(arrlst2);
//is arrlst equal; to o
        b = arrlst.equals(o);
//ensures max capacity
        arrlst.ensureCapacity(55);
//returns index of
        int index = arrlst.indexOf(o);//.indexOf(555);

        b = arrlst.isEmpty();
        index = arrlst.lastIndexOf(555);
        int pel = arrlst.set(index, 555);
        java.util.List<Integer> sl = arrlst.subList(0, 3);
        System.out.println("sublist = " + sl);
        arrlst.addAll(arrlst);
// Printing elements one by one
        for (int i = 0; i < arrlst.size(); i++) {
            System.out.print(arrlst.get(i) + " ");
        }
    }
}