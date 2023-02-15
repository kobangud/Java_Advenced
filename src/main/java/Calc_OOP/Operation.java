package Calc_OOP;

import java.util.InputMismatchException;
import java.util.Objects;

public class Operation {
    private double firstOperand = 0;
    private double secondOperand = 0;
    private String arifznak = ("[+]|-|[*]|/$");
    private double resultat;

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

    public void setArifznak(String arifznak) {
        this.arifznak = arifznak;
    }

    public String getArifznak() {
        return arifznak;
    }

    public double getResultat() {
        return resultat;
    }

    public double result() {
        try {

            if (Objects.equals(arifznak, "+")) {
                resultat = getFirstOperand() + getSecondOperand();

            } else if (Objects.equals(arifznak, "-")) {
                resultat = getFirstOperand() - getSecondOperand();

            } else if (Objects.equals(arifznak, "*")) {
                resultat = getFirstOperand() * getSecondOperand();

            } else if (Objects.equals(arifznak, "/")) {

                if (getSecondOperand() == 0) {
                    try {
                        //Вызываем искуственно ошибку,если второй операнд = 0
                        throw new ArithmeticException("");
                    } catch (ArithmeticException e) {
                        System.out.println("На ноль делить нельзя: " + e);
                    }
                } else {
                    resultat = getFirstOperand() / getSecondOperand();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода: " + e);
        }

        return resultat;
    }
}






