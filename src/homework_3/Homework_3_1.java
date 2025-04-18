package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Homework_3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;
        System.out.print("Введите размер массива (простое целое число): ");
        while (true) {
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: размер массива не может быть нулевым");
                    System.out.print("Ошибка: введите размер массива (простое целое число): ");
                }
            } else {
                System.out.print("Ошибка: введите размер массива (простое целое число): ");
                scanner.next();
            }
        }
        int[] mass = new int[size];
        // ЗАДАНИЕ 1
        for (int i = 0; i < mass.length; i++) {
            int value = random.nextInt(10);                                          // для заполнения массива рандомными значениями
//            System.out.print("Введите значение " + (i + 1) + "-го элемента массива: ");  // для ручного ввода элементов массива
//            int value = scanner.nextInt();
            mass[i] = value;
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(mass));
        System.out.print("Элементы массива в обратном порядке: ");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        // ЗАДАНИЯ 2 И 3
        int maxMassValue = mass[0];
        int maxMassValueIndex = 0;
        for (int i = 0; i < mass.length; i++) {
            if (maxMassValue < mass[i]) {
                maxMassValue = mass[i];
                maxMassValueIndex = i;
            }
        }
        System.out.println("Наибольшее значение в массиве = " + maxMassValue);
        System.out.println("Индекс наибольшего значения в массиве = " + maxMassValueIndex);
        int minMassValue = mass[0];
        int minMassValueIndex = 0;
        for (int i = 0; i < mass.length; i++) {
            if (minMassValue > mass[i]) {
                minMassValue = mass[i];
                minMassValueIndex = i;
            }
        }
        System.out.println("Наименьшее значение в массиве = " + minMassValue);
        System.out.println("Индекс наименьшего значения в массиве = " + minMassValueIndex);
        // ЗАДАНИЕ 4
        int countZero = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                countZero += 1;
            }
        }
        if (countZero == 0) {
            System.out.println("В массиве отсутствуют элементы, равные нулю");
        } else {
            System.out.println("Количество элементов в массиве, равных нулю: " + countZero);
        }
        // ЗАДАНИЕ 5
        int[] mass1 = mass.clone();
        for (int i = 0; i < (mass1.length / 2); i++) {
            int temp = mass1[i];
            mass1[i] = mass1[mass1.length - 1 - i];
            mass1[mass1.length - 1 - i] = temp;
        }
        System.out.println("Отзеркаленный массив: " + Arrays.toString(mass1));
        // ЗАДАНИЕ 6
        boolean flag = false;
        if (mass.length == 1) {
            flag = true;
        } else {
            for (int i = 0; i < mass.length - 1; i++) {
                for (int j = 1; j < mass.length; j++) {
                    if (mass[i] >= mass[j]) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        if (flag) {
            System.out.println("Массив не является возрастающей последовательностью");
        } else {
            System.out.println("Массив является возрастающей последовательностью");
        }
        // ЗАДАНИЕ 7*
        int number = 0;
        for (int i = 0; i < mass.length; i++) {
            number += (int) (mass[i] * Math.pow(10, mass.length - i - 1));
        }
        number++;
        int[] mass2 = new int[String.valueOf(number).length()];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = (int) (number / Math.pow(10, mass2.length - i - 1) % 10);
        }
        System.out.print("Исправленный массив: " + Arrays.toString(mass2));
//        scanner.close();
        // решение работает только для длины массива < 10, далее упираемся в ограничение формата данных int
    }
}