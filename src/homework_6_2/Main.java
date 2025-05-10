package homework_6_2;

public class Main {

    public static void main(String[] args) {

        Figures[] figures = Figures.createArrayOfFigures();
        int sumPerimeters = 0;
        for (Figures figure : figures) {
            sumPerimeters += figure.calculatePerimeter();
        }
        System.out.println(sumPerimeters);
    }
}
