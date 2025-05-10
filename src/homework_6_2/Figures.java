package homework_6_2;

public abstract class Figures {

    public abstract int calculateArea();

    public abstract int calculatePerimeter();

    public static Figures[] createArrayOfFigures() {
        return new Figures[] {
                new Circle(10),
                new Rectangle(4,5),
                new Triangle(3,4,5),
                new Circle(3),
                new Rectangle(8,10)};
    }
}
