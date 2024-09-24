import team.Person3;

public class Main {
    public static void main(String[] args) {
        Person3 p1 = new Person3("이양반" , 23);

        System.out.println(p1.getName());
        System.out.println("해피뉴이어");
        p1.해피뉴이어();
        System.out.println(p1);
    }
}