public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public float getD(MyPoint P){
        double distance = Math.sqrt(Math.pow(this.x - P.x,2) + Math.pow(this.y - P.y,2));
        return (float) distance;
    }

    public static void main(String[] args){
        MyPoint p1 = new MyPoint(2,3);
        MyPoint p2 = new MyPoint(4,5);

        float dist = p1.getD(p2);
        System.out.println("点（2,3）到点（4,5）的距离为：" + dist);
    }
}
