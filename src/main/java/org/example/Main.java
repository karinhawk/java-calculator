package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();
        System.out.println("for addition use +, subtraction use -, division use /, and multiplication use *");
        double a = scanner.nextDouble();
        String operator = scanner.next();
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(a + operator + b);
        try {
            System.out.println(logic.calculate(a, b, operator));
        } catch (Exception e) {
            System.out.println("Something doesn't seem to be working. Please try that again");
        }

    }
}