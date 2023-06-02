package starbucks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;



public class Customer{


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList<>();

        // arraylist에 메뉴들 담기
        arrayList.add(new Menu("커피", "카페인이 들어간 음료입니다."));
        arrayList.add(new Menu("티", "각종 다양한 티가 있습니다."));
        arrayList.add(new Menu("빵", "맛있는 빵이 있습니다."));


        //arratlist에 담았던 걸  menu 생성자에 넣기
        Menu menu1 = (Menu) arrayList.get(0);
        Menu menu2 = (Menu) arrayList.get(1);
        Menu menu3 = (Menu) arrayList.get(2);

        //메뉴 출력
        System.out.println(menu1.name + " | " + menu1.description);
        System.out.println(menu2.name + " | " + menu2.description);
        System.out.println(menu3.name + " | " + menu3.description);

        //카테고리 메뉴들 인스턴스 생성
        Item item = new Item();

        //scanner로 데이터 입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("메뉴를 선택해주세요>>>");
        int menuselect = scanner.nextInt();

        Order order = new Order();

        order.coffeeMenu();









    }
}