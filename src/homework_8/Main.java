package homework_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки:");
        String[] mass = new String[]{scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
        String string = scanner.nextLine();

        findShortestAndLongest(mass);
        sortedUp(mass);
        lengthLessMedian(mass);
        findFirstWordWithDiffLetters(mass);
        doDoubleLetters(string);
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
        for (int i = 0; i < mass.length - 1; i++) {
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
        int medianLength = findMedianLength(mass);
        for (String s : mass) {
            if (s.length() < medianLength) {
                System.out.printf("Строка \"%s\" имеет длину (%s) меньше средней длины строк в массиве (%s)%n",
                        s, s.length(), medianLength);
            }
        }
    }

    public static int findMedianLength(String[] mass) {
        int medianLength = 0;
        int divider = 0;
        for (String s : mass) {
            medianLength += s.length();
            divider++;
        }
        return medianLength / divider;
    }

    public static void findFirstWordWithDiffLetters(String[] mass) { // ЗАДАЧА 4
        String[] words;
        char[] letters;
        for (String s : mass) {
            words = s.split(" ");
            for (String word : words) {
                letters = word.toCharArray();
                for (char letter : letters) {
                    if (word.length() < 2) {
                        break;
                    } else if (word.indexOf(letter) != word.lastIndexOf(letter)) {
                        break;
                    } else {
                        System.out.printf("Первое слово, полностью состоящее из разных букв: %s%n", word);
                        return;
                    }
                }
            }
        }
    }

    public static void doDoubleLetters(String string) {
        StringBuilder doubleString = new StringBuilder(string);
        for (int i = 0; i < doubleString.length(); i += 2) {
            doubleString.insert(i, doubleString.charAt(i));
        }
        System.out.println(doubleString);
    }
}