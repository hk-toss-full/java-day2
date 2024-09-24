public class Person {
    // class 틀
//    Person 틀 이름
    // 안에서 갖는 변수 = 필드
//    전역 변수
    String name = "우재남";
    int age = 30;
//    메서드 method
//    public 리턴타입 메서드명(){
//          구현
//      }
    public String toCustomString() {
        // 지역 변수
        int agePlus1 = age + 1;
        return "name : " + name + ", age : " + agePlus1;
    }
//    나는 그냥 바로 name : 최승혁, age : 19 출력하고 싶다.
    public void print(){
        System.out.println(toCustomString());
    }

}
