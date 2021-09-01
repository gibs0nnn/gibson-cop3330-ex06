package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Calendar;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int age = scanner.nextInt();
        System.out.print("At what age would you like to retire? ");
        int retire = scanner.nextInt();
        int workLeft = retire - age;
        int year = Calendar.getInstance().getWeekYear();
        int retireYear = year + workLeft;

        if(workLeft <= 0) {
            System.out.println("You can retire now!");
        } else {
            System.out.println("You have " + workLeft + " years left until you can retire.");
            System.out.println("Its " + year + ", so you can retire in " + retireYear);
        }
    }
}
