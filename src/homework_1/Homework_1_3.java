package homework_1;

public class Homework_1_3 {

    public static void main(String[] args) {

        int n = 197;

        int hundreds = n / 100;
        int tens = n / 10 % 10;
        int units = n % 10;

        int result = hundreds + tens + units;
        System.out.println(result);
    }
}
