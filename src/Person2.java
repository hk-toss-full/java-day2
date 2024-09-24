public class Person2 {
    String name = "우재남";
    int age = 30;
    public String toCustomString() {
        int agePlus1 = age + 1;
        return "name : " + name + ", age : " + agePlus1;
    }
    public void print(){
        System.out.println(toCustomString());
    }

}
