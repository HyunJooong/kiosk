package starbucks;

import java.util.ArrayList;

public class Item extends Menu {

    double price;


    //빈 생성자 생성
    public Item() {
    }

    public Item(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }











    public void TeaMenu() {
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("1. 얼그레이 | 물 + 티백 | w4000");
        arrayList.add("1. 잉글리쉬블래퍼스트 | 물 + 티백 | w4000");
        arrayList.add("1. 그린티 | 우유 + 샷 2 + 물 + 티백 | 4000");
        arrayList.add("1. 페퍼민트 | 우유 + 샷 2 + 물 + 티백 | w4000");

        String[] tea = new String[arrayList.size()];
        for (int i = 0; i < tea.length; i++) {
            tea[i] = arrayList.get(i);
        }

        for (String teaList : tea) {
            System.out.println(teaList);
        }


    }

    //오버라이딩해서 아이디 값이 아닌 실제 값 출력하기
    @Override
    public String toString(){
        return name + " " + description + " " + price;
    }


}