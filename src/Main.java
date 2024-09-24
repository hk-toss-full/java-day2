import team.Animal;
import team.Cat;
import team.Person4;

public class Main {
    public static void main(String[] args) {
        Animal p = new Person4("sdaf", 213);
        p.sound();
        System.out.println(p);
        Animal cat = new Cat("ㅇㅇㅇ", 1);
        cat.sound();
    }
}