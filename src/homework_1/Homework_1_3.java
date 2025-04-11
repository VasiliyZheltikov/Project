package homework_1;

public class Homework_1_3 {

    public static void main(String[] args) {

        int n = 197; // число от 100 до 999

        int s = n / 100; // число сотен
        int d = n / 10 % 10; // число десятков
        int e = n % 10; // число единиц

        System.out.println(s + d + e);
    }
}
