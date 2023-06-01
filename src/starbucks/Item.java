package starbucks;

import java.util.ArrayList;

public class Item extends Menu {
    // 상품 클래스는 이름, 가격, 설명 필드를 가지는 클래스로 만들어주세요.
//상품 클래스의 이름, 설명 필드는 메뉴 클래스를 상속받아 사용하는 구조로 개발해주세요.
    double price;


    public Item(String name, String description, double price) {

        super(name, description);
        this.price = price;


    }

    public String toString() {
        return name + " | " + description + " | " + price;
    }


//    @Override
//    public String getMenu(){
//
//        name =
//
//
//    }


}



