package homework_1;

public class Homework_1_6 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        int memory_a = a;

        a = b;
        b = memory_a;

        System.out.println(a);
        System.out.println(b);
    }
}
