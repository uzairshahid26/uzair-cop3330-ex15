/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        String knownPassword  = "abc$123";
        System.out.print("Enter your Username: ");
        String username = scanner.nextLine();

        System.out.print("What is the password? ");
        String password = scanner.nextLine();

        if(knownPassword.equals(password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }

    }
}
