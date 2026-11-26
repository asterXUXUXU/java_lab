public class TestSuansu {
    public static void main(String[] agrs){
        Suansu cal = new Suansu(10,5);

        int Sum   = cal.AddAB();
        int Multi = cal.MultiAB();
        int Dive  = cal.DiveAB();

        System.out.println("a + b的和为："+ Sum);
        System.out.println("a * b的和为："+ Multi);
        System.out.println("a / b的和为："+ Dive);
    }
}
