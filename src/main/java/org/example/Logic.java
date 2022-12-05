package org.example;

import java.util.Objects;

public class Logic {

    private boolean cleared = false;

    public boolean isCleared() {
        return cleared;
    }

    public void setCleared(boolean cleared) {
        this.cleared = cleared;
    }

    private boolean running = true;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public double calculate(double a, double b, String operator){
        double result = 0;
        switch(operator){
            case "+": result = (double) a + b;
            break;
            case "-": result = (double) a - b;
            break;
            case "*": result = (double) a * b;
            break;
            case "/": result = (double) a / b;
            break;
            case "√": result = (double) Math.sqrt(a);
            break;
            case "^": result = (double) Math.pow(a, b);
            break;
            default:
                result = 0;
                break;
        }
        return result;
    }
    public double calculate(double a, String operator){
        double result = 0;
        if(Objects.equals(operator, "√")) {
            result = (double) Math.sqrt(a);
        }
        return result;
    }

    public void clear(String operator) {
        setCleared(true);
    }
}
