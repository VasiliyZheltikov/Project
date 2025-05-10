package homework_6_2;

public class Rectangle extends Figures {

    int side_a;
    int side_b;

    public Rectangle (int side_a, int side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }


    @Override
    public int calculateArea() {
        return side_a * side_b;
    }

    @Override
    public int calculatePerimeter() {
        return (side_a + side_b) * 2;
    }
}
