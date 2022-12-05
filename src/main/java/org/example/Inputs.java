package org.example;

import java.util.Scanner;

public class Inputs {

    public double firstCalculation(Scanner scanner, Logic logic){
        String input = scanner.next();
        String[] notOperators = input.split("\\s*([-+/*^√C])\\s*");
        String[] operators = input.split("\\s*[0-9]\\d*(\\.\\d+)?\\s*");
        String[] result = new String[operators.length+notOperators.length-1];
        for(int i=0; i<result.length; i++) {
            result[i] = i % 2 == 0 ? notOperators[i / 2] : operators[i / 2];
        }
        if(notOperators.length > 1){
            double a = Double.parseDouble(notOperators[0]);
            double b = Double.parseDouble(notOperators[1]);
            double answer = logic.calculate(a, b, operators[1]);
            System.out.println(logic.calculate(a, b, operators[1]));
            return answer;
        } else if (notOperators.length == 1){
            double a = Double.parseDouble(notOperators[0]);
            double answer = logic.calculate(a, operators[1]);
            System.out.println(logic.calculate(a, operators[1]));
            return answer;
        } else if(notOperators.length == 0) {
            logic.clear(operators[0]);
            double answer = 0;
            System.out.println("calculation reset!");
            return answer;
        }
        return 0;
    }

    public double subsequentCalculations(double a, Scanner scanner, Logic logic){
        String input = scanner.next();
        String[] notOperators = input.split("\\s*([-+/*^√C])\\s*");
        String[] operators = input.split("\\s*[0-9]\\d*(\\.\\d+)?\\s*");
        String[] result = new String[operators.length+notOperators.length-1];
        for(int i=0; i<result.length; i++) {
            result[i] = i % 2 == 0 ? notOperators[i / 2] : operators[i / 2];
        }
        if(notOperators.length > 1){
            double b = Double.parseDouble(notOperators[1]);
            double answer = logic.calculate(a, b, operators[0]);
            System.out.println(logic.calculate(a, b, operators[0]));
            return answer;
        } else if (notOperators.length == 1){
            double answer = logic.calculate(a, operators[0]);
            System.out.println(logic.calculate(a, operators[0]));
            return answer;
        } else if(notOperators.length == 0) {
            logic.clear(operators[0]);
            double answer = 0;
            System.out.println("calculation reset!");
            return answer;
        }
        return 0;
    }
}
