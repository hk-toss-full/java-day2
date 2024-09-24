package franchise;


public class Store implements StoreAction{
    private String name;
    private int openTime;
    private int closeTime;
    private Food[] menus;
    private double averagePrice;
    private int menuCount;
    private long totalPrice;

    @Override
    public void print() {

    }

    @Override
    public boolean addMenu(Food food) {
        return false;
    }

    @Override
    public boolean removeMenu(String name) {
        return false;
    }

    @Override
    public String getMenuArr() {
        return "";
    }
}
