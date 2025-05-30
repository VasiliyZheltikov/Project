package homework_9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Введите набор чисел: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        HashSet<String> distinctValues = new HashSet<>(Arrays.asList(inputString.split(",")));
        System.out.println(distinctValues);
        scanner.close();
    }
}
