package Third;

public class Cylinder extends Circle {
    public static Cylinder cy;
    private double height;

    public Cylinder(double r,double h){
        super(r);
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getCylinderArea(){
        return 2 * super.gerArea() + super.getPerimeter() * height;
    }

    public double getVol(){
        return super.gerArea() * height;
    }

    public void dispVol(){
        System.out.println("圆柱体的体积为：" + getVol());
    }
}
