package day4;

public class LatihanClass {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.display("Volume", "Prism");

        Circle circle = new Circle(5f);
        circle.display("area", "circle");

        Square square = new Square(10f);
        square.display("around", "square");

    }
}
