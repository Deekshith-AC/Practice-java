// Problem Statement:
// Objective: To understand the usage and implementation of Methods with variable arguments.

 

// Problem Description: Create a class as per the class diagram given below, to perform the following operations for a list of items with variable length.

// Display all the items on the list.
// Find the maximum value from the list.
// Sort the list in ascending order.
// Find the average of all the items on the list.
 

// Package Description: Create a package com.infy.varargs and place the class "VarargsExercise1" in it.

// VaragsExercise1:

 


 

// Provide the variable number of integer arguments and check the results.

// Note: In class diagram, the method with variable arguments is represented with [].

// Hint: Use varargs (…) to store variable length values.

// Methods Description:

// displayList (int... input): displays all the items in the list.
// maxOfList (int... input): retrieves the maximum item from the list.
// sortList (int... input): sorts the list in ascending order
// averageList (int... input): finds the average of the items in the list.
 

// ex35.2
// Summary of this exercise:

// You have learned

// To make methods that accept an arbitrary number of arguments.























import java.util.*;
public class VaragsExercise1
{
    public static void main(String[] args) 
    {
        VaragsExercise1 e1 = new VaragsExercise1();
        e1.displayList(200,300,500,1000,80,90,7,4,3,5000);
        e1.maxOfList(200,300,500,1000,80,90,7,4,3,5000);
        e1.sortList(200,300,500,1000,80,90,7,4,3,5000);
        e1.averageList(200,300,500,1000,80,90,7,4,3,5000);
    }
    private void displayList (int... input)
    {
        for(int a : input)
        {
            System.out.println(a);
        }
    }
// displays all the items in the list.


private void maxOfList (int... input)
    {
        int b = 0;
        for(int a : input)
        {
            if(a > b)
            {
                b = a;
            }
        }
        System.out.println(" Maximum Value is " + b);
    }
    //retrieves the maximum item from the list.


private void sortList (int... input)
{
    Arrays.sort(input);
    System.out.println(Arrays.toString(input));
}
    //: sorts the list in ascending order


private void averageList (int... input)
{
    int avg;
    int sum = 0;
    int l = input.length;

        for(int a : input)
        {
            sum += a;
        }
        avg = sum / l;
        System.out.println(avg);
}
    //: finds the average of the items in the list.
}