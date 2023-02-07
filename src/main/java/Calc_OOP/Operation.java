package Calc_OOP;

public class Operation {
    private double fierstOperand;
    private double secondOperand;
    public int arifznak;

    public Operation() {};

    public double getFierstOperand() {
        return fierstOperand;
    }

    public void setFierstOperand(double fierstOperand) {
        this.fierstOperand = fierstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public void result() {
        if (arifznak == '+') {
            System.out.printf("Результат сложения аргументов равен  %.4f", (getFierstOperand() + getSecondOperand()));
        } else if (arifznak == '-') {
            System.out.printf("Результат вычетания аргументов равен  %.4f", (getFierstOperand() - getSecondOperand()));
        } else if (arifznak == '*') {
            System.out.printf("Результат умножения аргументов равен  %.4f", (getFierstOperand() * getSecondOperand()));
        } else if (arifznak == '/') {
            System.out.printf("Результат деления аргументов равен  %.4f", (getFierstOperand() / getSecondOperand()));
        }
    }

}

