package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inputs inputs = new Inputs();
        Logic logic = new Logic();

        double a = 0;
        do {
            do {
                System.out.println("for addition use +, subtraction use -, division use /, and multiplication use *.\nFor squaring, use ^2 (can also cube!), and for sqaure roots use √. Type C to reset the calculation.");
                a = inputs.firstCalculation(scanner, logic);
                logic.setCleared(false);
            } while (logic.isCleared());
            do {
                a = inputs.subsequentCalculations(a, scanner, logic);
            } while (!logic.isCleared());
        }while (logic.isRunning());
    }
}