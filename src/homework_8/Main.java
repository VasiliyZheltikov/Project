package homework_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки:");
        String[] mass = new String[]{scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        findShortestAndLongest(mass);
        sortedUp(mass);
        lengthLessMedian(mass);
    }

    public static void findShortestAndLongest(String[] mass) { // ЗАДАЧА 1
        String shortest = mass[0];
        String longest = mass[0];
        for (String s : mass) {
            if (s.length() < shortest.length()) {
                shortest = s;
            } else if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.printf("Самая короткая строка: \"%s\" имеет длину: %s%n", shortest, shortest.length());
        System.out.printf("Самая длинная строка: \"%s имеет длину: %s%n", longest, longest.length());
    }

    public static void sortedUp(String[] mass) { // ЗАДАЧА 2
        String temp;
        for (int i = 0; i < mass.length - 1 ; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j].length() < mass[i].length()) {
                    temp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void lengthLessMedian(String[] mass) { // ЗАДАЧА 3
        int medianLength = 0;
        int divider = 0;
        for (String s : mass) {
            medianLength += s.length();
            divider++;
        }
        medianLength /= divider;
        for (String s: mass) {
            if (s.length() < medianLength) {
                System.out.printf("Строка \"%s\" имеет длину (%s) меньше средней длины строк в массиве (%s)%n",
                        s, s.length(), medianLength);
            }
        }

    }
}
