package homework_6_2;

public class Triangle extends Figures {

    int side_a;
    int side_b;
    int side_c;

    public Triangle (int side_a, int side_b, int side_c) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    @Override
    public int calculateArea() {
        int half_perimeter = calculatePerimeter() / 2;
        return (int) Math.sqrt(half_perimeter * (half_perimeter - side_a) * (half_perimeter - side_b) *
                (half_perimeter - side_c));
    }

    @Override
    public int calculatePerimeter() {
        return side_a + side_b + side_c;
    }
}
