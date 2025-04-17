package homework_2;

import java.util.Scanner;

public class Homework_2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число больше 0: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                int summand = 1;
                int result = 0;
                if (i > 0) {
                    while (summand <= i) {
                        result += summand;
                        summand++;
                    }
                    System.out.println("Сумма чисел от 1 до введённого числа = " + result);
                    break;
                } else {
                    System.out.print("Ошибка: введите целое число БОЛЬШЕ 0: ");
                }
            } else {
                System.out.print("Ошибка: введите ЦЕЛОЕ ЧИСЛО больше 0: ");
                scanner.next();
            }
        }
        scanner.close();
    }
}
