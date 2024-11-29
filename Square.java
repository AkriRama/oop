package day4;

public class Square extends Shape {

    public Square(Float side) {
        this.side = side;
    }

    public Float side;

    public Float process(String type, Float side) {
        if (type.equalsIgnoreCase("area")) {
            return side * side;
        } else if (type.equalsIgnoreCase("around")) {
            return 4 * side;
        } else {
            return side * side * side;
        }
    }

    public void display(String type, String name) {
        super.display(type, name);
        float result;
        if (type.equalsIgnoreCase("area")) {
            result = process("area", side);
        } else if (type.equalsIgnoreCase("around")) {
            result = process("around", side);
        } else {
            result = process("volume", side);
        }
        System.out.println(result);
    }
}
