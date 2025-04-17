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
            int value = random.nextInt(10);
            mass[i] = value;
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(mass));

        // Здесь вывод всех элементов массива в обратном порядке

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
    }
}
