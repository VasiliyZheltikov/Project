package homework_2;

import java.util.Scanner;

public class Homework_2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число " + number + " чётное");
        } else {
            System.out.println("Число " + number + " нечётное");
        }
        scanner.close();
    }
}
