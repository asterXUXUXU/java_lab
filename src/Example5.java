public class Example5 {
    public static void main(String[] args){
        for(int i = 0; i <= 1000; i++){
            int sum = 0;
            for(int j = 1; j <= i/2; j++ ){
                if(i % j ==0){
                    sum = sum + j;
                }
            }
            if(sum == i && i != 0){
                System.out.println(i + "是一个完全数");
            }
        }
    }
}
