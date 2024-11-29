package day4;

public class Circle extends Shape {

    public Circle(Float r) {
        this.r = r;
    }

    public final Float phi = 3.14f;
    public Float r;

    public Float process(String type, Float r) {
        if (type.equalsIgnoreCase("area")) {
            return phi * r * r;
        } else if (type.equalsIgnoreCase("around")) {
            return 2 * phi * r;
        } else {
            return 4 / 3 * (phi * (r * r * r));
        }
    }

    public void display(String type, String name) {
        super.display(type, name);
        float result;
        if (type.equalsIgnoreCase("area")) {
            result = process("area", r);
        } else if (type.equalsIgnoreCase("around")) {
            result = process("around", r);
        } else {
            result = process("volume", r);
        }
        System.out.println(result);
    }
}
