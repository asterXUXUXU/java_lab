public class Example1 {
    public static void main(String[] args){
        int sum = 0;

        for(int i = 100; i <= 200; i++){
            boolean IsPrime = true;

            for(int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    IsPrime = false;
                    break;
                }
            }

            if (IsPrime){
                System.out.print(i + " ");
                sum++;

                if (sum % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
