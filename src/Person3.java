import java.util.Objects;
// const i =0;
// i = 1
// let i = 0;
// i = 2
public class Person3 {
//   할당시가 마지막 final
    final String name;
    int age;
    public void 해피뉴이어(){
        age++;
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
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    // 이미 있는 것을 바꾸는 것
//    overriding
//    @Override
//    public String toString() {
//        return "name : " + name + ", age : ";
//    }
//
//
//    public Person3(String name, int age){
//        this.name = name;
//        this.age = age;
//    }



// 가장 상위 Object 상속(?)이 된다.

}
