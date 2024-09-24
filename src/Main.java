import franchise.Food;
import franchise.Store;
import team.Animal;
import team.Cat;
import team.Person4;

public class Main {
    public static void main(String[] args) {
        Store store = null;
        store.print();
        Food f =new Food();
        System.out.println(store.addMenu(f));
        // 총 수가 올라가야 하고 , 총 금액 올라가야하고 , 평균 도 올라가야하고
        store.print();
//        이거로 잘들어 갔나 확인도 해보고
        System.out.println(store.getMenuArr());
        System.out.println(store.removeMenu("아메리카노"));
        store.print();
//        이거로 잘들어 갔나 확인도 해보고
        System.out.println(store.getMenuArr());

    }
}