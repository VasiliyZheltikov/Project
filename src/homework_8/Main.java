package homework_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки:");
        String[] mass = new String[]{scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        findShortestAndLongest(mass);
    }

    public static void findShortestAndLongest(String[] mass) {
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
}
