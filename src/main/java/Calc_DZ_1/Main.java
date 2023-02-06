package Calc_DZ_1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner Skaner = new Scanner(System.in);


            CalcBase dell = new CalcBase();
            System.out.println("Введите  через запятую дробное значение аргумента №1 ");
            dell.argument_1 = Skaner.nextDouble();
            System.out.println("Введите  через запятую дробное значение аргумента №2 ");
            dell.argument_2 = Skaner.nextDouble();
            System.out.println("Уточните действие, что вы хотите сделать. Введите знак один из  +, -, * или  /");
            dell.arifznak = System.in.read();

            dell.result();


    }
}