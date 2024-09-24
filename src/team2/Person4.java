package team2;

/*
상속 extends
키워드로 animal에 있는 모든 것들을
받아와서 내것처럼 쓰는 것
안에 있는 것은 this 부모에 있는것 super
 */
public class Person4  implements AnimalAction{
    private String name;
    private int age;
    private boolean isAdult;
    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAdult = age > 19;
    }
    @Override
    public void sound() {
        System.out.println("안녕");
    }

    @Override
    public void eat() {
        System.out.println("냠냠");
    }

    public void talk(){
        System.out.println("안녕");
    }

}
