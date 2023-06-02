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

//    public void CoffeeMenu() {
//
//        ArrayList<Item> arrayList = new ArrayList();
//
//        arrayList.add(new Item("아메리카노", "물 + 2샷", 3000));
//        arrayList.add(new Item("카페라뗴", "우유 + 2샷", 3000));
//        arrayList.add(new Item("바닐라라떼", "우유 + 2샷 + 바닐라시럽 2펌프", 3000));
//        arrayList.add(new Item("카라멜마끼아또", "우유 + 2샷 + 카라멜소스 2펌프 + 바닐라시럽 1펌프", 3000));
//
//        //담을 배열 하나 선언
//        Item[] coffeeList = new Item[arrayList.size()];
//
//        // arraylist에 있는 데이터 coffeeList 배열에 옮겨 담기
//        for (int i = 0; i < coffeeList.length; i++) {
//            coffeeList[i] = arrayList.get(i);
//        }
//
//        System.out.println(coffeeList.toString());
//
//
//    }
    @Override
    public String toString(){

       return this.name + this.description + this.price;
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


}