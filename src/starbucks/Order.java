package starbucks;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {

    int waiting = 0; // 대기번호
    //생성자
    public Order() {
    }

    private Item[] coffeeList; // 지역 멤버 변수로 선언
    private Item[] teaList; // 지역 멤버 변수로 선언
    private Item[] breadList; // 지역 멤버 변수로 선언

    //메인메뉴 츌력 메소드
    public static void mainMenu(String mainTitle) {

        System.out.println("[ " + mainTitle + " ]");

        ArrayList<Menu> menuArrayList = new ArrayList<>();
        // arraylist에 메뉴들 담기
        menuArrayList.add(new Menu("1. 커피", "카페인이 들어간 음료입니다."));
        menuArrayList.add(new Menu("2. 티", "각종 다양한 티가 있습니다."));
        menuArrayList.add(new Menu("3. 빵", "맛있는 빵이 있습니다."));

        Menu menu1 = menuArrayList.get(0);
        Menu menu2 = menuArrayList.get(1);
        Menu menu3 = menuArrayList.get(2);

        System.out.println(menu1.name + " | " + menu1.description);
        System.out.println(menu2.name + " | " + menu2.description);
        System.out.println(menu3.name + " | " + menu3.description);


    }

    //커피 메뉴들 담기
    public void coffeeMenu() {

        ArrayList<Item> arrayList = new ArrayList();

        arrayList.add(new Item("1. 아메리카노: ", "물 + 2샷 | ", 3000));
        arrayList.add(new Item("2. 카페라뗴: ", "우유 + 2샷 | ", 3000));
        arrayList.add(new Item("3. 바닐라라떼: ", "우유 + 2샷 + 바닐라시럽 2펌프 | ", 3000));
        arrayList.add(new Item("4. 카라멜마끼아또: ", "우유 + 2샷 + 카라멜소스 2펌프 + 바닐라시럽 1펌프 | ", 3000));

        //위에서 선언한 coffeeList에 담아서 나중에 내부 다른 메소드에서 쓸 거임
        coffeeList = new Item[arrayList.size()];
//        Item[] coffeeList = new Item[arrayList.size()];

        // arraylist에 있는 데이터 coffeeList 배열에 옮겨 담기
        for (int i = 0; i < coffeeList.length; i++) {
            coffeeList[i] = arrayList.get(i);
        }

    }

    public void teaMenu() {

        ArrayList<Item> arrayList = new ArrayList();

        arrayList.add(new Item("1. 얼그레이: ", "물 + 얼그레이 티백 | ", 4000));
        arrayList.add(new Item("2. 잉글리쉬 블랙퍼스트: ", "물 + 홍차 티백 | ", 4000));
        arrayList.add(new Item("3. 페퍼민트: ", "물 + 페퍼민트 티백 | ", 4000));
        arrayList.add(new Item("4. 그린티: ", "물 + 녹차 티백| ", 4000));

        //담을 배열 하나 선언
        teaList = new Item[arrayList.size()];

        // arraylist에 있는 데이터 coffeeList 배열에 옮겨 담기
        for (int i = 0; i < teaList.length; i++) {
            teaList[i] = arrayList.get(i);
        }


    }


    public void breadMenu() {

        ArrayList<Item> arrayList = new ArrayList();

        arrayList.add(new Item("1. 피자빵: ", " ", 4000));
        arrayList.add(new Item("2. 마늘빵: ", " ", 4000));
        arrayList.add(new Item("3. 소금빵: ", " ", 4000));
        arrayList.add(new Item("4. 고로케: ", " ", 4000));

        //담을 배열 하나 선언
        breadList = new Item[arrayList.size()];

        // arraylist에 있는 데이터 coffeeList 배열에 옮겨 담기
        for (int i = 0; i < breadList.length; i++) {
            breadList[i] = arrayList.get(i);
        }


    }

    // 메뉴판 보여주기
    public void showMenus(int menuSelect) {

        if (menuSelect == 1) coffeeMenu();
        else if (menuSelect == 2) teaMenu();
        else if (menuSelect == 3) breadMenu();
        else if (menuSelect == 4) showCart();
        else if (menuSelect == 5) System.out.println("Cancel");
        else System.out.println();


    }

    //선택한 메뉴 출력하기
    public void showCategory(int menuSelect) {

        coffeeMenu(); // coffee menu 메소드의 멤버 변수 선언
        teaMenu();// team enu 메소드의 멤버 변수 선언
        breadMenu();// bread menu 메소드의 멤버 변수 선언

        if (menuSelect == 1) {
            for (int i = 0; i < coffeeList.length; i++) {
                System.out.println(coffeeList[i].toString());
            }

        } else if (menuSelect == 2) {
            for (int i = 0; i < teaList.length; i++) {
                System.out.println(teaList[i].toString());
            }

        } else if (menuSelect == 3) {
            for (int i = 0; i < breadList.length; i++) {
                System.out.println(breadList[i].toString());
            }

        }

    }

    // 선택한 카테고리 출력
    public void selectedCategory(int menuS, int cateS) {

        coffeeMenu(); // coffee menu 메소드의 멤버 변수 선언
        teaMenu();// team enu 메소드의 멤버 변수 선언
        breadMenu();// bread menu 메소드의 멤버 변수 선언

        switch (menuS) {
            case 1:
                switch (cateS) {
                    case 1:
                        System.out.println(coffeeList[0].name + coffeeList[0].price);
                        break;
                    case 2:
                        System.out.println(coffeeList[1].name + coffeeList[1].price);
                        break;
                    case 3:
                        System.out.println(coffeeList[2].name + coffeeList[2].price);
                        break;
                    case 4:
                        System.out.println(coffeeList[3].name + coffeeList[3].price);
                        break;
                    default:
                }
                break;

            case 2:
                switch (cateS) {
                    case 1:
                        System.out.println(teaList[0].name + teaList[0].price);
                        break;
                    case 2:
                        System.out.println(teaList[1].name + teaList[1].price);
                        break;
                    case 3:
                        System.out.println(teaList[2].name + teaList[2].price);
                        break;
                    case 4:
                        System.out.println(teaList[3].name + teaList[3].price);
                        break;
                    default:
                }
                break;

            case 3:
                switch (cateS) {
                    case 1:
                        System.out.println(breadList[0].name + breadList[0].price);
                        break;
                    case 2:
                        System.out.println(breadList[1].name + breadList[1].price);
                        break;
                    case 3:
                        System.out.println(breadList[2].name + breadList[2].price);
                        break;
                    case 4:
                        System.out.println(breadList[3].name + breadList[3].price);
                        break;
                }
                break;
            default:
        }
    }


    public void inTheCart(int menuS, int cateS) {

        coffeeMenu(); // coffee menu 메소드의 멤버 변수 선언
        teaMenu();// team enu 메소드의 멤버 변수 선언
        breadMenu();// bread menu 메소드의 멤버 변수 선언

        switch (menuS) {
            case 1:
                switch (cateS) {
                    case 1:
                        addToCart(coffeeList[0]);
                        break;
                    case 2:
                        addToCart(coffeeList[1]);
                        break;
                    case 3:
                        addToCart(coffeeList[2]);
                        break;
                    case 4:
                        addToCart(coffeeList[3]);
                        break;
                    default:
                }
                break;

            case 2:
                switch (cateS) {
                    case 1:
                        addToCart(teaList[0]);
                        break;
                    case 2:
                        addToCart(teaList[1]);
                        break;
                    case 3:
                        addToCart(teaList[2]);;
                        break;
                    case 4:
                        addToCart(teaList[3]);
                        break;
                    default:
                }
                break;

            case 3:
                switch (cateS) {
                    case 1:
                        addToCart(teaList[0]);
                        break;
                    case 2:
                        addToCart(teaList[1]);
                        break;
                    case 3:
                        addToCart(teaList[2]);
                        break;
                    case 4:
                        addToCart(teaList[3]);
                        break;
                }
                break;
            default:
        }
    }
    public ArrayList<Item> cart = new ArrayList<>();

    public void addToCart(Item item){
        cart.add(item);
    }

    public void showCart() {
        System.out.println("아래와 같이 주문하시겠습니까?");
        double total = 0;

        for (Item item : cart) {
            System.out.println(item.getName() + " " + item.getPrice());
            total += item.getPrice();
        }
        System.out.print("W " + total);
        waiting++;
    }

    public void orderClick(int click){
        if(click == 1) {
            System.out.println( "주문이 완료되었습니다." + "대기번호는 " + "[" + waiting + " ]"
                    + " 번 입니다.\n" + "(3초후 메뉴판으로 돌아갑니다.)");
        } else if (click == 2) {

            mainMenu("[ 카페에 오신 걸 환영합니다. ]");

        }

        }
        public void Cancel(int cancelClick){
            System.out.println("진행하던 주문을 취소하겠습니까?");
            if(cancelClick == 1) {
                System.out.println("주문이 취소되었습니다.");
                mainMenu("[ 카페에 오신 걸 환영합니다 ]");

            } else if (cancelClick == 2) {

            }


        }

    }










