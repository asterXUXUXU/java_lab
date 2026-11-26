public class Example6 {
    public static void main(String[] args){
        double e = 1;
        double temp = 1.0;
        int n = 1;

        while(temp >= 0.0001){
            temp = temp / n;
            e = e + temp;
            n++;
        }
        System.out.println("计算出的e的近似值为："+ e);
        System.out.println("循环结束时，n的值为：" + (n - 1));
    }
}
