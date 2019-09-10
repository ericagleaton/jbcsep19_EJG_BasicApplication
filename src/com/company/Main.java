package com.company;
/*
Basic Application
Write a Java program to solve the following:

Your 6 year old client needs an application that will receive an integer from the user banging on the keyboard, add 5 to it, double it, subtract 7 from it, and display the result to the screen.
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number");
    	num = scanner.nextInt();
    	System.out.println("The result of " + num + " (your input + 5) * 2 - 7 is :"+ (((num + 5) * 2)-7)) ;

    }
}
