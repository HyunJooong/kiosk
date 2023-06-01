package starbucks;

import java.util.*;

public class Customer {
    public static void main(String[] args) {
        System.out.println("[ 스타벅스에 오신걸 환영합니다. ]");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        //Scanner 함수
        Scanner sc = new Scanner(System.in);

        //order클래스 초기화
        Order order = new Order();
        //메뉴클래스 초기화
        //String.format
        Menu menu1 = new Menu("Coffee", " | 카페인이 들어간 음료입니다.");
        Menu menu2 = new Menu("Tea", " | 티 종류의 음료입니다.");
        Menu menu3 = new Menu("Bread", " | 빵 종류입니다.");
        // 커피 세부 메뉴 초기화
        Item americano = new Item("1. 아메리카노", "물 + 샷2", 3.500);
        Item latte = new Item("2. 카페라뗴", "우유 + 2샷", 4.500);
        Item banila = new Item("3. 바닐라라뗴", "우유 + 2샷 + 바닐라시럽 2펌프", 5.500);
        Item caramel = new Item("4. 카라멜마끼아또", "우유 + 2샷 + 카라멜소스 + 설탕시럽", 5.500);

        // 티 세부 메뉴 초기화
        Item earl = new Item("1. 얼그레이티", "물 + 얼그레이 티백", 4.000);
        Item english = new Item("2. 잉글리쉬블랙퍼스트", "물 + 잉글리쉬블랙퍼스트 티백", 4.0);
        Item mint = new Item("3. 페퍼민트", "물 + 페페민트 티백", 4.000);
        Item grenn = new Item("4. 그린티", "물 + 녹차 티백", 4.000);

        // 빵 세부 메뉴 초기화
        Item pizza = new Item("1. 피자빵", "피자빵입니다.", 5500);
        Item onion = new Item("2. 마늘빵", "마늘빵입니다.", 5.000);
        Item goro = new Item("3. 고로케", "고로케입니다.", 5.500);
        Item salt = new Item("4. 소금빵", "소금빵입니다.", 5.500);

        ArrayList<Item> al = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();


        // linkedhashmap을 이용해 순서대로 출력
        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        //hashmap에 메뉴 입력
        hm.put(menu1.name, menu1.description);
        hm.put(menu2.name, menu2.description);
        hm.put(menu3.name, menu3.description);


        int select = 0;

        //while 문으로 전체 돌리기
        while (select != 5) {
            System.out.println("[ 스타벅스 ]");
            int cnt = 1;
            //hashmap에 넣은 메뉴들 entry 이용해 for문으로 하나씩 출력
            for (Map.Entry<String, String> entry : hm.entrySet()) {
                System.out.println(cnt++ + ". " + entry.getKey() + " | " + entry.getValue());
            }

            System.out.println("[ ORDER MENU ]");
            System.out.println(cnt++ + ". Order " + " | " + " 장바구니를 확인 후 주문합니다.");
            System.out.println(cnt + ". Cancel " + " | " + " 진행중인 주문을 취소합니다.");
            System.out.println();
            // 고객의 선택에 따라 달라지도록 sitch문으로 나누기
            // 메뉴 선정 페이지
            System.out.print("메뉴 번호를 눌러주세요 >>> ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println(americano);
                    System.out.println(latte);
                    System.out.println(banila);
                    System.out.println(caramel);
                    break;
                case 2:
                    System.out.println(earl);
                    System.out.println(english);
                    System.out.println(mint);
                    System.out.println(grenn);
                    break;
                case 3:
                    System.out.println(pizza);
                    System.out.println(onion);
                    System.out.println(goro);
                    System.out.println(salt);
                    break;
                default:

            }
            if (select == 5) {
                break;
            } else {
                System.out.print("번호 입력 >>>> : ");
                int menuSelect = sc.nextInt();

                switch (select) {
                    case 1:
                        switch (menuSelect) {
                            case 1:

                                al.add(americano);
                                break;
                            case 2:

                                al.add(latte);
                                break;
                            case 3:

                                al.add(banila);
                                break;
                            case 4:

                                al.add(caramel);
                                break;
                            default:
                                System.out.println("없는 메뉴입니다.");
                                break;
                        }
                        break;
                    case 2:
                        switch (menuSelect) {
                            case 1:

                                al.add(earl);
                                break;
                            case 2:

                                al.add(english);
                                break;
                            case 3:

                                al.add(mint);
                                break;
                            case 4:

                                al.add(grenn);
                                break;
                            default:
                                System.out.println("없는 메뉴입니다.");
                                break;
                        }
                        break;
                    case 3:
                        switch (menuSelect) {
                            case 1:

                                al.add(pizza);
                                break;
                            case 2:

                                al.add(onion);

                                break;
                            case 3:

                                al.add(goro);
                                break;
                            case 4:

                                al.add(salt);
                                break;
                            default:
                                System.out.println("없는 메뉴입니다.");
                                break;
                        }

                        break;
                    default:
                }

            }
            System.out.print(al + "가 장바구니에 담겼습니다." + "\n");
            arrayList.add(al.toString());
            al.clear();

        }


        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println();
        System.out.println("[ ORDER ]");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("[ TOTAL ]");
        int sum = 0;
        for (String plusCost : arrayList) {
            int startIndex = plusCost.lastIndexOf("|") + 1;
            int endIndext = plusCost.lastIndexOf("]");
            String priceStr = plusCost.substring(startIndex, endIndext).trim();
            double price = Double.parseDouble(priceStr);
            sum += price;
        }
        System.out.println("total: " + "w " + sum);

        System.out.println("1. 주문 " + "  " + " 메뉴판");
        int yseClick = sc.nextInt();
        //주문번호
        int orderNUm = 1;
        if (yseClick == 1) {
            System.out.println("주문이 완료되었습니다.");
            System.out.println("대기번호는 " + orderNUm + "번 입니다.");
            System.out.println("3초 후 메뉴판으로 돌아갑니다.");
            try {
                Thread.sleep(3000); // 3초(3000ms) 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            orderNUm++;
        } else if (yseClick == 2) {
            System.out.println("진행하던 주문을 취소하겠습니까?");
            System.out.println("1. 확인" + "    " + " 2. 취소");
            int cancelClick = sc.nextInt();
            if (cancelClick == 1) {
                arrayList.clear();
                System.out.println("진행하던 주문이 취소되었습니다.");
            } else System.out.println("나중에 다시 돌아오겠습니다.");

        }

        System.out.println("[ 스타벅스에 오신걸 환영합니다. ]");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        int cnt = 1;

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            System.out.println(cnt++ + ". " + entry.getKey() + " | " + entry.getValue());
        }

        System.out.print("메뉴 번호를 눌러주세요 >>> ");
        select = sc.nextInt();


        switch (select) {
            case 1:
                System.out.println(americano);
                System.out.println(latte);
                System.out.println(banila);
                System.out.println(caramel);
                break;
            case 2:
                System.out.println(earl);
                System.out.println(english);
                System.out.println(mint);
                System.out.println(grenn);
                break;
            case 3:
                System.out.println(pizza);
                System.out.println(onion);
                System.out.println(goro);
                System.out.println(salt);
                break;
            default:

        }
    }
}
