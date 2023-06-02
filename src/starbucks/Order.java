package starbucks;

import java.util.ArrayList;
import java.util.Arrays;

public class Order{

    public Order() {
    }

    public static void coffeeMenu() {

        ArrayList<Item> arrayList = new ArrayList();

        arrayList.add(new Item("아메리카노: ", "물 + 2샷 | ", 3000));
        arrayList.add(new Item("카페라뗴: ", "우유 + 2샷 | ", 3000));
        arrayList.add(new Item("바닐라라떼: ", "우유 + 2샷 + 바닐라시럽 2펌프 | ", 3000));
        arrayList.add(new Item("카라멜마끼아또: ", "우유 + 2샷 + 카라멜소스 2펌프 + 바닐라시럽 1펌프 | ", 3000));

        //담을 배열 하나 선언
        Item[] coffeeList = new Item[arrayList.size()];

        // arraylist에 있는 데이터 coffeeList 배열에 옮겨 담기
        for (int i = 0; i < coffeeList.length; i++) {
            coffeeList[i] = arrayList.get(i);
        }

        for(int i = 0; i < coffeeList.length; i++) {
            System.out.println(coffeeList[i].toString());
        }


    }


}