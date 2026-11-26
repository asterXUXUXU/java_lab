package Third;

public class Circle {
    private double radius;
    public Circle(){
        this.radius = 0.0;
    }

    public Circle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double gerArea(){
        return Math.PI * radius *radius;
    }

    public void disp(){
        System.out.println("圆的半径：" + radius);
        System.out.println("圆的周长：" + getPerimeter());
        System.out.println("圆的面积：" + gerArea());
    }
}
