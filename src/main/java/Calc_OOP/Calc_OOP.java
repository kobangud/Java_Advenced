package Calc_OOP;


public class Calc_OOP {


    public void Calc(double firstOperand, double secondOperand, String arifznak) {
        Operation play = new Operation(firstOperand, secondOperand, arifznak) {};

            play.result();
    }

    public void Calc() {
    }
}
