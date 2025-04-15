package homework_2;

import java.util.Scanner;

public class Homework_2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int summand = 1;
        int result = 0;
        if (i > 0) {
            while (summand <= i) {
             result += summand;
             summand++;
            }
            System.out.println(result);
        } else {
            System.out.println("Введите целое число больше 0");
        }
        scanner.close();
    }
}
