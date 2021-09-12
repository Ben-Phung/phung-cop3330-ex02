/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int i;

        // Prompt for input
        System.out.println( "What is the input string? ");
        String input = scan.nextLine();

        // input.length() is a built in function to determine the length of a string
        System.out.println( input+" has "+input.length()+" characters. ");
    }
}
