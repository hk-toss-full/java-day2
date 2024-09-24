package team2;
// 클래스 상속 은 extends 
// interface 상속은 implements
public class Cat implements AnimalAction {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("고양이고양이");
    }

    @Override
    public void eat() {
        System.out.println("냐금냐금");
    }

}
