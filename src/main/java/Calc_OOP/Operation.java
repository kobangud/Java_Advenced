package Calc_OOP;

import java.util.Objects;

public class Operation {
    private double firstOperand;
    private double secondOperand;
    private String arifznak ;
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

        if (Objects.equals(arifznak, "+")) {
            resultat = getFirstOperand() + getSecondOperand();

        } else if (Objects.equals(arifznak, "-")) {
            resultat = getFirstOperand() - getSecondOperand();

        } else if (Objects.equals(arifznak, "*")) {
            resultat = getFirstOperand() * getSecondOperand();

        } else if (Objects.equals(arifznak, "/")) {
            //Искусственно вызываем ошибку при делении на ноль
            if (getSecondOperand() == 0) {
                throw new ArithmeticException();
            } else {
                resultat = getFirstOperand() / getSecondOperand();
            }
        }
        return resultat;
    }
}







