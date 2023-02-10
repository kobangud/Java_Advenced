package Calc_OOP;

public class Operation {
    private double fierstOperand;
    private double secondOperand;
    private String arifznak;

    public Operation(double fierstOperand, double secondOperand, String arifznak) {
        this.fierstOperand = fierstOperand;
        this.secondOperand = secondOperand;
        this.arifznak = arifznak;
    }

    public Operation() {
    }

    ;

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
        if (arifznak == "+") {
            System.out.printf("Результат сложения аргументов равен  %.4f", (getFierstOperand() + getSecondOperand()));
        } else if (arifznak == "-") {
            System.out.printf("Результат вычетания аргументов равен  %.4f", (getFierstOperand() - getSecondOperand()));
        } else if (arifznak == "*") {
            System.out.printf("Результат умножения аргументов равен  %.4f", (getFierstOperand() * getSecondOperand()));
        } else if (arifznak == "/") {
            System.out.printf("Результат деления аргументов равен  %.4f", (getFierstOperand() / getSecondOperand()));
        }

    }
}



