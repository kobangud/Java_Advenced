package Calc_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Calc_OOP {


    public static void main(String[] args) throws IOException {

        Operation Operation1 = new Operation() {};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый оперант");
        Operation1.setFierstOperand(scanner.nextDouble());
        System.out.println("Введите оператор");
        Operation1.arifznak = System.in.read();
        System.out.println("Введите второй оперант");
        Operation1.setSecondOperand(scanner.nextDouble());
        Operation1.result();
        scanner.close();

    }
}
