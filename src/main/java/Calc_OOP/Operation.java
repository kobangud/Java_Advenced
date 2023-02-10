package Calc_OOP;

import java.io.IOException;

public class Operation {
    private double firstOperand;
    private double secondOperand;
    private String arifznak;

    public Operation(double firstOperand, double secondOperand, String arifznak) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.arifznak = arifznak;
    }

    public Operation() {
    }



    public double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public void result() {
        if (arifznak == "+") {
            System.out.printf("Результат сложения аргументов равен  %.4f", (getFirstOperand() + getSecondOperand()));
        } else if (arifznak == "-") {
            System.out.printf("Результат вычетания аргументов равен  %.4f", (getFirstOperand() - getSecondOperand()));
        } else if (arifznak == "*") {
            System.out.printf("Результат умножения аргументов равен  %.4f", (getFirstOperand() * getSecondOperand()));
        } else if (arifznak == "/") {
            try {
            if (getSecondOperand() == 0) {
               int val = (int) getFirstOperand() / (int) getSecondOperand();
            }
                System.out.printf("Результат деления аргументов равен  %.4f", (getFirstOperand() / getSecondOperand()));

        }
            catch (ArithmeticException e) {
                System.out.println("На ноль делить нельзя");
            }
        }
    }
}



