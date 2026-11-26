public class Example2 {
    public static void main(String[] args){
        double t = 3.3;
        double y = 0;
        System.out.println("当前t的值为：" + t);

        //if语句
        if (t >= 0 && t < 1){
            y = t * t - 1;
        }else if(t >= 1 && t < 3){
            y = t * t * t - 2 * t - 2;
        }else  if(t >= 3 && t < 5){
            y = t * t - t * Math.sin(t);
        }else if (t >= 5 && t > 7){
            y = t + 1;
        }else{
            y = t -1;
        }
        System.out.println("使用if语句计算y的值为：" + y);

        //switch语句
        if(t < 0){
            y = t - 1;
        }else {
            switch ((int)t){
                case 0 :
                    y = t * t - 1;
                    break;
                case 1 :
                case 2 :
                    y = t * t * t - 2 * t - 2;
                    break;
                case 3 :
                case 4 :
                    y = t * t - t * Math.sin(t);
                    break;
                case 5 :
                case 6 :
                    y = t + 1;
                    break;
                default:
                    y = t - 1;
                    break;
            }
        }
        System.out.println("使用switch语句计算y的值为：" + y);
    }
}
