package starbucks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Customer {


    public static void main(String[] args) {

        // order 인스터스 생성
        Order order = new Order();

        //scanner로 데이터 입력
        Scanner scanner = new Scanner(System.in);

        // while문으로 메뉴판 계속 츌력하기
        while(true) {
            // mainMenu 출력
            Order.mainMenu("카페에 오신 걸 환영합니다.");
            //카테고리 메뉴들 인스턴스 생성
            Item item = new Item();

            System.out.print("위 메뉴 중 하나를 선택해주세요>>> ");
            int menuselect = scanner.nextInt(); // 지정된 번호를 입력 시 카테고리가 나오게 하기

            order.showCategory(menuselect);

            // 4 또는 5를 누르면 while문을 빠져 나가기 위해
            if (menuselect == 4 || menuselect == 5) break;


            //카테고리 안 메뉴 선택하기
            System.out.print("메뉴를 골라주세요 >>> ");
            int categorySelect = scanner.nextInt();

            //선택한 메뉴 출력
            order.selectedCategory(menuselect, categorySelect);
            //선택 메뉴 카트에 담기
            order.inTheCart(menuselect, categorySelect);

        }

        //리스트에 장바구니 출력
        order.showCart();

        //메뉴완료 혹은 메뉴판
        int okOrder = scanner.nextInt();
        order.orderClick(okOrder);




//
    }


}
