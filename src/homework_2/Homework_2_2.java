package homework_2;

import java.util.Scanner;

public class Homework_2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5) {
            if (t > -20) {
                System.out.println("Normal");
            } else if (t <= -20) {
                System.out.println("Cold");
            }
        }
        scanner.close();
    }
}
