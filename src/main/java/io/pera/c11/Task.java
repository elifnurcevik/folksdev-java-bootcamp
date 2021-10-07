package io.pera.c11;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        System.out.println("Calculate your Body Mass Index, you must enter your height and weight");

        System.out.print("Height(e.g. 1,63) : ");
        float height = new Scanner(System.in).nextFloat();

        System.out.print("Weight: ");
        float weight = new Scanner(System.in).nextFloat();

        // BMI Formula = kg/m2
        float result = weight / (height * height);
        System.out.println("Result: " + result);

        if (result < 18)
            System.out.println("You are weak.");
        else if (result < 25)
            System.out.println("You are at normal weight.");
        else if (result < 30)
            System.out.println("You are a little overweight. It is beneficial not to consume fat and heavy foods too much.");
        else if (result < 35)
            System.out.println("You are 1st Degree Obese. It will be beneficial for you to go to a dietitian and apply a new nutrition program.");
        else
            System.out.println("You are 2nd degree fat. Your Health could be at risk. We recommend that you see a doctor immediately.");

    }

}

// OUTPUT
/*

Calculate your Body Mass Index, you must enter your height and weight
Height(e.g. 1,63) : 1,75
Weight: 70
Result: 22.857143
You are at normal weight.

 */
