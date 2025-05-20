package homework_7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void divide(int number, int divider) {
        try {
            System.out.println(number / divider);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено");
        }
    }

    public static void divideSomeElement(int[] mass, int position, int divider) {
        try {
            mass[position] /= divider;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Позиция заданного элемента массива находится за пределами массива");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено");
        }
    }

    public static void createAndFillIncreasingMass(int first_number) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите значение длины массива: ");
            int size = scanner.nextInt();
            int[] mass = new int[size];
            for (int i = 0; i < size; i++) {
                mass[i] = first_number;
                first_number++;
            }
            System.out.println(Arrays.toString(mass));
        } catch (NegativeArraySizeException | InputMismatchException e) {
            System.out.println("Некорректное значение длины массива");
        }
    }

    public static void findSumm() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите 1-ое число: ");
            int number1 = scanner.nextInt();
            System.out.print("Введите 2-ое число: ");
            int number2 = scanner.nextInt();
            System.out.println(number1 + number2);
        } catch (InputMismatchException e) {
            System.out.println("Введён некорректный тип данных");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        Main.divide(10, 0);
        Main.divideSomeElement(new int[]{1, 2}, 2, 2);
        Main.divideSomeElement(new int[]{1, 2, 3}, 2, 0);
        Main.createAndFillIncreasingMass(1); // Ввод отрицательного значения для NegativeArraySizeException
        Main.createAndFillIncreasingMass(1); // Ввод буквы/символа для InputMismatchException
        Main.findSumm(); // Ввод буквы/символа
    }
}
