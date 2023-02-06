package Calc_DZ_1;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner Skaner = new Scanner(System.in);


        int ad;
        int l = 0;
        int s;
        String slovo = "";

        System.out.println("Выберете программу: \n Где Калькулятор - 1, Массив слов - 2");

        ad = Skaner.nextInt();

        if (ad == 1) {


            CalcBase dell = new CalcBase();
            System.out.println("Введите  через запятую дробное значение аргумента №1 ");
            dell.argument_1 = Skaner.nextDouble();
            System.out.println("Введите  через запятую дробное значение аргумента №2 ");
            dell.argument_2 = Skaner.nextDouble();
            System.out.println("Уточните действие, что вы хотите сделать. Введите знак один из  +, -, * или  /");
            dell.arifznak = System.in.read();

            dell.result();

        } else if (ad == 2) {


            System.out.println("Введите количество слов массива");
            int slova = Skaner.nextInt();
            String[] MassivSlov = new String[slova];
            System.out.println("Введите слова массива через Enter");
            for (int i = 0; i < slova; i++) {

                MassivSlov[i] = Skaner.next();
            }
            for (String word : MassivSlov) {
                if (word.length() > l) {
                    l = word.length();
                    slovo = word;
                }

            }
            System.out.println("Самое длинное слово массива: " + slovo);


        } else
            System.out.println("Вы сделали неправильный выбор");
        Skaner.close();

    }
}