package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //chained operations
        //negatives
        //loop

        Scanner scanner = new Scanner(System.in);
        Inputs inputs = new Inputs();
        Logic logic = new Logic();

        do {
            System.out.println("for addition use +, subtraction use -, division use /, and multiplication use *.\nFor squaring, use ^2 (can also cube!), and for sqaure roots use √. Type C to reset the calculation.");
            inputs.firstCalculation(scanner, logic);
        }while(logic.isCleared());
        do{
            inputs.subsequentCalculations();
        }while(!logic.isCleared());
        //have loop - if cleared is true, then run first calculation
        // after, set cleared to false, then run subsequent in a loop until cleared is true (typed C)
    }
}