package team;

public class Cat extends Animal{
//    private String name;
//    private int age;

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("고양이고양이");
    }

//    public void sound(){
//        System.out.println("고양이고양이");
//    }

}
