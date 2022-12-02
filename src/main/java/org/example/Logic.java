package org.example;

public class Logic {

    public double calculate(double a, double b, String operator){
        double result = 0;
        switch(operator){
            case "+": result = a + b;
            break;
            case "-": result = a - b;
            break;
            case "*": result = a * b;
            break;
            case "/": result = a / b;
            break;
            case "√": result = Math.sqrt(a);
            break;
            case "squared": squared(a);
            break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    public double squared(double a){
        return a * a;
    }

}
