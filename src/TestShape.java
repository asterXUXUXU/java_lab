interface Shape {
    double area();
}


class Circle implements Shape {
    private double radius;
    public Circle(double r) { this.radius = r; }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double l, double w) { this.length = l; this.width = w; }

    @Override
    public double area() {
        return length * width;
    }
}

class TriangleShape implements Shape {
    private double base;
    private double height;
    public TriangleShape(double b, double h) {
        this.base = b;
        this.height = h;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// 5. 测试主类
public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new TriangleShape(6.0, 4.0);

        System.out.println("各类图形的面积如下：");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("第 " + (i + 1) + " 个图形的面积为: " + String.format("%.2f", shapes[i].area()));
        }
    }
}

