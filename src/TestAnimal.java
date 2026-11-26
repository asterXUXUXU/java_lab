abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void ShowInfo(){
        System.out.println("动物名：" + name + "，年龄：" + age + "，质量：" + weight);
    }

    public abstract void move();
    public abstract void eat();
}

class Bird extends Animal{
    public Bird(String name,int age,double weight){
        super(name,age,weight);
    }

    @Override
    public void move(){
        System.out.println("运动方式：飞翔");
    }

    @Override
    public void eat(){
        System.out.println("吃食：虫子");
    }
}

public class TestAnimal {
    public static void main(String[] args){
        Animal MyBird = new Bird("小鸟",1,0.15);

        MyBird.ShowInfo();
        MyBird.move();
        MyBird.eat();
    }
}
