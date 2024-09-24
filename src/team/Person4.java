package team;

import java.util.Objects;

/*
상속 extends
키워드로 animal에 있는 모든 것들을
받아와서 내것처럼 쓰는 것
안에 있는 것은 this 부모에 있는것 super
 */
public class Person4 extends Animal {
    private boolean isAdult;
    public Person4(String name, int age) {
        super(name, age);
        this.isAdult = age > 19;
    }
    @Override
    public void sound() {
        System.out.println("안녕");
    }

    public void talk(){
        System.out.println("안녕");
    }

    @Override
    public String toString() {
        return "{" +
                "age =" + getAge() +
                ",name =" + getName() +
                ",isAdult=" + isAdult +
                '}';
    }
}
