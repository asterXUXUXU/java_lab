import java.util.Random;

public class Example4 {
    public static void main(String[] args){
        Random random = new Random();

        //生成第一个随机数
        int n = random.nextInt(9) + 1;
        System.out.println("生成的随机数n的值为：" + n);

        int sum = 0;
        System.out.println("生成的" + n + "个随机数分别是：");

        for(int i = 0; i < n; i++){
            int num = random.nextInt(101);
            System.out.println(num + " ");

            sum = sum + num;
        }
        System.out.println();
        System.out.println("这" + n + "个随机数的总和为：" + sum);
    }
}
