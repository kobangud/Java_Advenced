package Massiv_Array_3;

import java.util.Arrays;

public class Massiv_array {

    public static void main(String[] args) {

        System.out.println("Задаем массив из 15 чисел от -10 до 10");
        int max = Integer.MIN_VALUE;                // условно мах мы присваиваем минус бесконечность
        int min = Integer.MAX_VALUE;
        int posis = 0;
        int negativ = 0;


        int[] masRond = new int[20];                  //создаем массив из 20 чисел
        for (int i = 0; i < masRond.length; i++) {
            masRond[i] = ((int) (Math.random() * 21) - 10); //с помощью оператора math.random заполняем массив рандомными числами
            // в диапозоне от -10 до +10, всего 21 число включая 0

        }
        System.out.println(Arrays.toString(masRond));

        for (int i = 0; i < masRond.length; i++) {
            if ((masRond[i] < 0) && (max < masRond[i])) {       //в данном случае проверяем masRond > минус бесконечности. т.е. если в массиве самое минимальное =-10, далее мах присваем -10,
                                                                // далее проверяем,  -10 меньше чем - 9, и таким образом вычисляем ближайшее отрицательное значение близкое к 0.
                max = masRond[i];
                negativ = i;

            }
            if ((masRond[i] > 0) && (min > masRond[i])) {
                min = masRond[i];
                posis = i;
            }

        }
        System.out.println("Максимальное значение в отрицательном ряде: " + max);
        System.out.println("Минимальное значение в положительном ряде: " + min);

        int temp = masRond[negativ];
        masRond[negativ] = masRond[posis];
        masRond[posis] = temp;
        System.out.println(Arrays.toString(masRond));


    }
}
