public class Example3 {
    public static void main(String[] args){
        for(int num = 100; num <= 999; num ++){
            int b = num / 100;
            int s = num / 10 % 10;
            int g  = num % 10;
            if(num == (b * b * b) + (s * s * s) + (g * g * g)){
                System.out.print(num + " ");
            }
        }
    }
}
