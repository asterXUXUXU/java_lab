package Third;

import java.util.Scanner;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            double min = Math.min(a, Math.min(b, c));
            this.a = min;
            this.b = min;
            this.c = min;
            System.out.println("!!三边不满足三角形条件，已自动构造以最小值为边的等边三角形！");
        }
    }

    public double getArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 3 个实数：");

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        Triangle t = new Triangle(x, y, z);

        System.out.println("构造的三角形面积为: " + t.getArea());
        scanner.close();
    }
}
