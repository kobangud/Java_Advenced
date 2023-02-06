package Calc_DZ_1;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {

       CalcBase dell = new CalcBase();
        Scanner sk = new Scanner(System.in);
        System.out.println("Введите  через запятую дробное значение аргумента №1 ");
        dell.argument_1 = sk.nextDouble();
        System.out.println("Введите  через запятую дробное значение аргумента №2 ");
        dell.argument_2 = sk.nextDouble();
        System.out.println("Уточните действие, что вы хотите сделать. Введите знак один из  +, -, * или  /");
        dell.arifznak = System.in.read();

        dell.result();


    }
}