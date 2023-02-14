package Calc_OOP;

public class Operation {
    private double firstOperand = 0;
    private double secondOperand = 1;
    private int arifznak;
    private double resultat;


    public Operation(double firstOperand, double secondOperand, int arifznak) {
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

    public void setArifznak(int arifznak) {
        this.arifznak = arifznak;
    }

    public double getResultat() {
        return resultat;
    }

    public double result() {

        if (arifznak == '+') {
            resultat = getFirstOperand() + getSecondOperand();

        } else if (arifznak == '-') {
            resultat = getFirstOperand() - getSecondOperand();

        } else if (arifznak == '*') {
            resultat = getFirstOperand() * getSecondOperand();

        } else if (arifznak == '/') {
            resultat = getFirstOperand() / getSecondOperand();

        }
        return resultat;
    }

}







