package Calc_DZ_1;

/**
 *
 */

public class CalcBase {

    double argument_1;
    double argument_2;
    int arifznak;

    /**
     * Метод расчета и вывода результата над введенными аргументами в консоль пользователем.
     */

    void result() {
        if (arifznak == '+') {
            System.out.printf("Результат сложения аргументов равен  %.4f", (argument_1 + argument_2));
        } else if (arifznak == '-') {
            System.out.printf("Результат вычетания аргументов равен  %.4f", (argument_1 - argument_2));
        } else if (arifznak == '*') {
            System.out.printf("Результат умножения аргументов равен  %.4f", (argument_1 * argument_2));
        } else if (arifznak == '/') {
            System.out.printf("Результат деления аргументов равен  %.4f", (argument_1 / argument_2));
        }
    }

}
