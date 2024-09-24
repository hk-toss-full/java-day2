package team;

import java.util.Objects;

/*
public 다 가능
protected 패키지 다르면 x
(default) 패키지 다르면 x
private 나 아니면 x
 */
public class Person3 {

    private final String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void 해피뉴이어(){
        age++;
    }
    public void 미국다녀옴(){
        age+=3;
    }
    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person3 person3 = (Person3) o;
        return age == person3.age && Objects.equals(name, person3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "team.Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
