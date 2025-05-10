package homework_6_2;

public class Circle extends Figures {

    int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI * radius);
    }
}
