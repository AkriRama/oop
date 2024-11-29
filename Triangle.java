package day4;

public class Triangle extends Shape {
    public Triangle() {
    }

    public Triangle(Float base, Float height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(Float side) {
        this.side = side;
    }

    public Triangle(Float base, Float height, Float prismHeight) {
        this.base = base;
        this.height = height;
        this.prismHeight = prismHeight;
    }

    public Float base, height, side, prismHeight;

    public Float process(Float base, Float height) {
        return 0.5f * base * height;
    }

    public Float process(Float side) {
        return 3 * side;
    }

    public Float process(Float base, Float height, Float prismHeight) {
        return ((base * height) / 2) * prismHeight;
    }

    public void display(String type, String name) {
        super.display(type, name);
        float result;
        if (type.equalsIgnoreCase("area")) {
            result = process(base, height);
        } else if (type.equalsIgnoreCase("around")) {
            result = process(side);
        } else {
            result = process(base, height, prismHeight);
        }
        System.out.println(result);
    }

}
