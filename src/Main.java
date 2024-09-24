public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        team.name = "아메";
        team.goal = "차카게";

        Person2 p1 = new Person2();
        Person2 p2 = new Person2();
        Person2 p3 = new Person2();
        p1.name = "김";
        p1.age = 8;
        p2.name = "이";
        p2.age = 2;
        p3.name = "박";
        p3.age = 44;

        team.members = new Person2[]{p1, p2, p3, null};
        //Person p =new Person()
// p.name = "최"
// p.age = 21
// team.memberAdd(p)
// team.remove("이세연")
// 이세연 remove
// team.print()
// 이 팀명은 아메리카노 입니다
// 목표는 착하게 살자입니다
// 팀원은 {"백승일", 22}, {"조예은",3}, {"최승혁", 21}
    }
}