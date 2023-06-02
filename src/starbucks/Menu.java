package starbucks;

public class Menu {
    // -메뉴 클래스는 이름, 설명 필드를 가지는 클래스로 만들어주세요.
//- 메인 메뉴판이 출력되며 메뉴판에는 상품 메뉴가 출력됩니다.
//- 상품 메뉴는 간단한 설명과 함께 출력되며 최소 3개 이상 출력됩니다.
//- 상품 메뉴 아래에는 Order(주문)와 Cancel(주문취소) 옵션을 출력해줍니다.
    String name;
    String description;



    public void setName(String name) {
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public String getDescription(String description) {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //부모 클래스 생성자 생성
    public Menu() {
    }

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
