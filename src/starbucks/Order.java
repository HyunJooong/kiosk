package starbucks;

import java.util.ArrayList;

public class Order {
//    주문 클래스도 만들어서 상품 객체를 담을 수 있도록 해주세요.

    String itemOrder;
    String name;


    public Order() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(String itemOrder) {
        this.itemOrder = itemOrder;

    }

    public String toSring(String itemOrder) {

        ArrayList<String> al = new ArrayList();

        al.add(itemOrder);

        return al.toString();

    }

    public void showMenu() {
        toString();

        System.out.println();


    }
}
