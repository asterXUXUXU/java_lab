package package2;
import package1.classA;

public class classB {
    public void methodB(){
        System.out.println("这是classB的方法");

        classA a = new classA();
        a.methodA();
    }

    public static void main(String[] args) {
        classB b = new classB();
        b.methodB();
    }
}
