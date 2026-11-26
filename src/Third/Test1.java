package Third;

public class Test1 {

    public static void main(String[] args){
        Cylinder cy = new Cylinder(3.0,6.0);

        System.out.println("圆的半径为：" + cy.getRadius());
        System.out.println("圆的周长为：" + cy.getPerimeter());
        System.out.println("圆的面积为：" + cy.gerArea());
        System.out.println("圆柱体的体积为：" + cy.getVol());
    }
}
