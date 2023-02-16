package Calc_OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaseCalc {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Operation calk = new Operation();
        System.out.println("Введите первое число (разделитель запятая)");
        try {
            calk.setFirstOperand(s.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода: " + e);
        }
        System.out.println("Введите второе  число (разделитель запятая)");
        try {
            calk.setSecondOperand(s.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода: " + e);
        }

        System.out.println("Введите знак операции ");
        try {

            calk.setArifznak(s.next("[+]|-|[*]|/$"));

        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода: " + e);
        }

        try {
            calk.result();
            System.out.printf("Результат: %.4f", calk.getResultat());
            s.close();

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя: " + e);
        }

    }

}


