package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your height: ");
        while(!input.hasNextDouble())
        {
         input.next();
         System.out.print("Please enter your numerical height: ");
        }
        double height = input.nextDouble();
        System.out.println("What is your weight: ");
        while(!input.hasNextDouble())
        {
            input.next();
            System.out.print("Please enter your numerical weight: ");
        }
        double weight = input.nextDouble();
        double BMI = ((weight)/(height * height)) * 703;
        System.out.println("Your BMI is " + BMI + ".");
        if(BMI >= 18.5 && BMI <= 25 )
        {
            System.out.println("You are within the ideal weight range.");
        }
        else if(BMI > 25)
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if(BMI < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }
    }
}
