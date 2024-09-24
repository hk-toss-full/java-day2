package team;

public class Person2 {
    String name = "우재남";
    int age = 30;
    public String toCustomString() {
        return "name : " + name + ", age : ";
    }
    public void print(){
        System.out.println(toCustomString());
    }
    // 생성자(constructor) 를 우리가 만들자
//    AllArgumentConstructor
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 이름은 같은데 아규먼트를 다르게 설계해서 재사용성을 늘리는 것을 overloading
//    public team.Person2(String name){
//        this.name = name;
//        this.age = 0;
//    }
//    public team.Person2(int age){
//        this.name = "";
//        this.age = age;
//    }
//    public team.Person2(){}

}
