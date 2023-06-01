import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("[ StarBucks에 오신 걸 환영합니다. ]");

        Menu menu = new Menu();




        Scanner sc = new Scanner(System.in); //Scanner 함수로 입력 받기
//        Menu[] menu = new Menu[3]; // 객체 배열 생성
//        Coffee coffee1 = new Coffee();
//        Tea tea1 = new Tea();
//        Blended blended1 = new Blended();
//        Order order = new Order();
//        Payment payment = new Payment();
//
//        HashMap<String, Integer> hm = new HashMap<String, Integer>();
//
//
//        //menu 객체 생성
//        for (int i = 0; i < menu.length; i++) {
//            menu[i] = new Menu();
//        }
//
//
//        System.out.println("[ StarBucks 에 오신 것을 환영합니다. ]");
//        System.out.println("아래 메뉴판을 보시고 선택해주세요.");
//        System.out.println();
//
//
//        menu[0].name = "Coffee";
//        menu[0].index = "카페인이 들어간 음료입니다.";
//        menu[1].name = "Tea";
//        menu[1].index = "티 종류의 음료입니다.";
//        menu[2].name = "Blended";
//        menu[2].index = "얼음을 블랜딩 해 시원하게 마시는 음료입니다.";
//
//        System.out.println("[ STARBUCKS MENU ]");
//        System.out.println();
//
//        // 메뉴판 생성
//        int cnt = 0;
//        for (int i = 0; i < menu.length; i++) {
//            cnt++;
//            System.out.print(cnt + ". ");
//            menu[i].showMenu();
//
//        }
//        System.out.println();
//        System.out.println("[ ORDER MENU ]");
//        System.out.println("5. Order ");
//        System.out.println("6. Cancel ");
//
//        // 세부내용 입력
//        Coffee[] coffees = new Coffee[]{
//                new Coffee("아메리카노", 3000,
//                        "샷 2 + 물"),
//                new Coffee("카페라떼", 4000,
//                        "샷 2 + 우유 "),
//                new Coffee("카라멜 마끼아또", 4500,
//                        "샷2 + 우유 + 카라멜 소스 2펌프"),
//                new Coffee("바닐라 라떼", 45000,
//                        "샷2 + 우유 + 바닐라 시럽 3펌프 + 설탕시럽 1펌프")
//        };
//
//        coffee1.setCoffee(coffees);
//
//        Tea[] teas = new Tea[]{
//                new Tea("캐모마일", 4500,
//                        "물 + 캐모마일 티백"),
//                new Tea("얼그레이", 4500,
//                        "물 + 얼그레이 티백"),
//                new Tea("잉글리시 블랙퍼스트", 4500,
//                        "물 + 잉글리시 블랙퍼스트 티백"),
//                new Tea("그린티", 4500,
//                        "물 + 녹차 티백")
//        };
//
//        tea1.setTea(teas);
//
//        Blended[] blendeds = new Blended[]{
//                new Blended("자바칩", 6300,
//                        "초코시럽 2펌프 + 우유 + 초코소스 + 초코칩"),
//                new Blended("화이트 초코 모카", 6000,
//                        "초코시럽 2펌픔 + 우유 + 모카시럽 + 거품+ 화이트 초코칩"),
//                new Blended("민트 초콜릿 칩", 6300,
//                        "민트시럽 2펌픔 + 우유 + 초코시럽 2펌픔 + 휘핑크림"),
//                new Blended("딸기 딜라이트 요거트", 6300,
//                        "딸기시럽 2펌픔 + 우유 + 요거트 파우더 + 딸기")
//        };
//
//        blended1.setBlended(blendeds);
//
//
//        System.out.println();
//        System.out.print("Order Number: ");
//        int select = sc.nextInt();
//
//        int cnt2 = 1;
//
//        if (select == order.coffeeOrder) {
//            System.out.println("[ Coffee ]");
//            for (Coffee coffee : coffee1.coffees) {
//                System.out.print(cnt2++ + ".");
//                System.out.print(coffee.coffee + ": ");
//                System.out.print(coffee.price + " | ");
//                System.out.println(coffee.index);
//            }
//        } else if (select == order.teaOrder) {
//            System.out.println("[ Tea ]");
//            for (Tea tea : tea1.teas) {
//                System.out.print(cnt2++ + ".");
//                System.out.print(tea.tea + ": ");
//                System.out.print(tea.price + " | ");
//                System.out.println(tea.index);
//            }
//        } else if (select == order.blendedOrder) {
//            System.out.println("[ Blended ]");
//            for (Blended blended : blended1.blendeds) {
//                System.out.print(cnt2++ + ".");
//                System.out.print(blended.blended + ": ");
//                System.out.print(blended.price + " | ");
//                System.out.println(blended.index);
//            }
//
//        }
//
//        System.out.println();
//        System.out.print("메뉴를 선택해주세요. : ");
//        int select2 = sc.nextInt();
//        System.out.println();
//
//        switch (select) {
//            case 1:
//                System.out.println("[ COFFEE ]");
//                switch (select2) {
//                    case 1:
//
//                        System.out.println(coffee1.coffees[0].coffee + ": " + coffee1.coffees[0].price);
//                        payment.coffeeCart = coffee1.coffees[0].coffee;
//                        payment.coffeePay = coffee1.coffees[0].price;
//                        hm.put(payment.coffeeCart, payment.coffeePay);
//                        break;
//                    case 2:
//                        System.out.println(coffee1.coffees[1].coffee + ": " + coffee1.coffees[1].price);
//                        payment.coffeeCart = coffee1.coffees[1].coffee;
//                        payment.coffeePay = coffee1.coffees[1].price;
//                        hm.put(payment.coffeeCart, payment.coffeePay);
//                        break;
//                    case 3:
//                        System.out.println(coffee1.coffees[2].coffee + ": " + coffee1.coffees[2].price);
//                        payment.coffeeCart = coffee1.coffees[2].coffee;
//                        payment.coffeePay = coffee1.coffees[2].price;
//                        hm.put(payment.coffeeCart, payment.coffeePay);
//                        break;
//                    case 4:
//                        System.out.println(coffee1.coffees[3].coffee + ": " + coffee1.coffees[3].price);
//                        payment.coffeeCart = coffee1.coffees[3].coffee;
//                        payment.coffeePay = coffee1.coffees[3].price;
//                        hm.put(payment.coffeeCart, payment.coffeePay);
//                        break;
//                    default:
//                        System.out.println("준비중입니다.");
//                        // select2 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                        break;
//                }
//                break;
//            case 2:
//                System.out.println("[ TEA ]");
//                switch (select2) {
//                    case 1:
//                        System.out.println(tea1.teas[0].tea + ": " + tea1.teas[0].price);
//                        payment.teaCart = tea1.teas[0].tea;
//                        payment.teaPay = tea1.teas[0].price;
//                        hm.put(payment.teaCart, payment.teaPay);
//                        break;
//                    case 2:
//                        System.out.println(tea1.teas[1].tea + ": " + tea1.teas[1].price);
//                        payment.teaCart = tea1.teas[1].tea;
//                        payment.teaPay = tea1.teas[1].price;
//
//                        hm.put(payment.teaCart, payment.teaPay);
//                        break;
//                    case 3:
//                        System.out.println(tea1.teas[2].tea + ": " + tea1.teas[2].price);
//                        payment.teaCart = tea1.teas[2].tea;
//                        payment.teaPay = tea1.teas[2].price;
//
//                        hm.put(payment.teaCart, payment.teaPay);
//                        break;
//                    case 4:
//                        System.out.println(tea1.teas[3].tea + ": " + tea1.teas[3].price);
//                        payment.teaCart = tea1.teas[3].tea;
//                        payment.teaPay = tea1.teas[3].price;
//
//                        hm.put(payment.teaCart, payment.teaPay);
//                        break;
//                    default:
//                        System.out.println("준비중입니다.");
//                        // select2 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                        break;
//                }
//                break;
//            case 3:
//                System.out.println("[ BLENDED ]");
//                switch (select2) {
//                    case 1:
//                        System.out.println(blended1.blendeds[0].blended + ": " + blended1.blendeds[0].price);
//                        payment.blendCart = blended1.blendeds[0].blended;
//                        payment.blendPay = blended1.blendeds[0].price;
//                        hm.put(payment.blendCart, payment.blendPay);
//                        break;
//
//                    case 2:
//                        System.out.println(blended1.blendeds[1].blended + ": " + blended1.blendeds[1].price);
//                        payment.blendCart = blended1.blendeds[1].blended;
//                        payment.blendPay = blended1.blendeds[1].price;
//                        hm.put(payment.blendCart, payment.blendPay);
//                        break;
//                    case 3:
//                        System.out.println(blended1.blendeds[2].blended + ": " + blended1.blendeds[2].price);
//                        payment.blendCart = blended1.blendeds[2].blended;
//                        payment.blendPay = blended1.blendeds[2].price;
//                        hm.put(payment.blendCart, payment.blendPay);
//                        break;
//                    case 4:
//                        System.out.println(blended1.blendeds[3].blended + ": " + blended1.blendeds[3].price);
//                        payment.blendCart = blended1.blendeds[3].blended;
//                        payment.blendPay = blended1.blendeds[3].price;
//                        hm.put(payment.blendCart, payment.blendPay);
//                        break;
//
//                    default:
//                        System.out.println("준비중입니다.");
//                        break;
//                }
//                break;
//            default:
//                // select 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                break;
//        }
//        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
//
//        order.getYesOrder(select);
//        order.getYesOrder(select2);
//        order.setYesOrder();



//        while (true) {
//
//            int cnt = 0;
//            for (int i = 0; i < menu.length; i++) {
//                cnt++;
//                System.out.print(cnt + ". ");
//                menu[i].showMenu();
//
//            }
//            System.out.println();
//            System.out.println("[ ORDER MENU ]");
//            System.out.println("5. Order ");
//            System.out.println("6. Cancel ");
////
//
//            Coffee[] coffees = new Coffee[]{
//                    new Coffee("아메리카노", 3000,
//                            "샷 2 + 물"),
//                    new Coffee("카페라떼", 4000,
//                            "샷 2 + 우유 "),
//                    new Coffee("카라멜 마끼아또", 4500,
//                            "샷2 + 우유 + 카라멜 소스 2펌프"),
//                    new Coffee("바닐라 라떼", 45000,
//                            "샷2 + 우유 + 바닐라 시럽 3펌프 + 설탕시럽 1펌프")
//            };
//
//            coffee1.setCoffee(coffees);
//
//            Tea[] teas = new Tea[]{
//                    new Tea("캐모마일", 4500,
//                            "물 + 캐모마일 티백"),
//                    new Tea("얼그레이", 4500,
//                            "물 + 얼그레이 티백"),
//                    new Tea("잉글리시 블랙퍼스트", 4500,
//                            "물 + 잉글리시 블랙퍼스트 티백"),
//                    new Tea("그린티", 4500,
//                            "물 + 녹차 티백")
//            };
//
//            tea1.setTea(teas);
//
//            Blended[] blendeds = new Blended[]{
//                    new Blended("자바칩", 6300,
//                            "초코시럽 2펌프 + 우유 + 초코소스 + 초코칩"),
//                    new Blended("화이트 초코 모카", 6000,
//                            "초코시럽 2펌픔 + 우유 + 모카시럽 + 거품+ 화이트 초코칩"),
//                    new Blended("민트 초콜릿 칩", 6300,
//                            "민트시럽 2펌픔 + 우유 + 초코시럽 2펌픔 + 휘핑크림"),
//                    new Blended("딸기 딜라이트 요거트", 6300,
//                            "딸기시럽 2펌픔 + 우유 + 요거트 파우더 + 딸기")
//            };
//
//            blended1.setBlended(blendeds);
//
//
//            System.out.println();
//            System.out.print("Order Number: ");
//            int select = sc.nextInt();
//
//
//            int cnt2 = 1;
//
//            if (select == order.coffeeOrder) {
//                System.out.println("[ Coffee ]");
//                for (Coffee coffee : coffee1.coffees) {
//                    System.out.print(cnt2++ + ".");
//                    System.out.print(coffee.coffee + ": ");
//                    System.out.print(coffee.price + " | ");
//                    System.out.println(coffee.index);
//                }
//            } else if (select == order.teaOrder) {
//                System.out.println("[ Tea ]");
//                for (Tea tea : tea1.teas) {
//                    System.out.print(cnt2++ + ".");
//                    System.out.print(tea.tea + ": ");
//                    System.out.print(tea.price + " | ");
//                    System.out.println(tea.index);
//                }
//            } else if (select == order.blendedOrder) {
//                System.out.println("[ Blended ]");
//                for (Blended blended : blended1.blendeds) {
//                    System.out.print(cnt2++ + ".");
//                    System.out.print(blended.blended + ": ");
//                    System.out.print(blended.price + " | ");
//                    System.out.println(blended.index);
//                }
//
//            }
//            System.out.println();
//            System.out.print("메뉴를 선택해주세요. : ");
//            int select2 = sc.nextInt();
//
//            switch (select) {
//                case 1:
//                    System.out.println("[ COFFEE ]");
//                    switch (select2) {
//                        case 1:
//
//                            System.out.println(coffee1.coffees[0].coffee + ": " + coffee1.coffees[0].price);
//                            payment.coffeeCart = coffee1.coffees[0].coffee;
//                            payment.coffeePay = coffee1.coffees[0].price;
//                            hm.put(payment.coffeeCart, payment.coffeePay);
//                            break;
//                        case 2:
//                            System.out.println(coffee1.coffees[1].coffee + ": " + coffee1.coffees[1].price);
//                            payment.coffeeCart = coffee1.coffees[1].coffee;
//                            payment.coffeePay = coffee1.coffees[1].price;
//                            hm.put(payment.coffeeCart, payment.coffeePay);
//                            break;
//                        case 3:
//                            System.out.println(coffee1.coffees[2].coffee + ": " + coffee1.coffees[2].price);
//                            payment.coffeeCart = coffee1.coffees[2].coffee;
//                            payment.coffeePay = coffee1.coffees[2].price;
//                            hm.put(payment.coffeeCart, payment.coffeePay);
//                            break;
//                        case 4:
//                            System.out.println(coffee1.coffees[3].coffee + ": " + coffee1.coffees[3].price);
//                            payment.coffeeCart = coffee1.coffees[3].coffee;
//                            payment.coffeePay = coffee1.coffees[3].price;
//                            hm.put(payment.coffeeCart, payment.coffeePay);
//                            break;
//                        default:
//                            System.out.println("준비중입니다.");
//                            // select2 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                            break;
//                    }
//                    break;
//                case 2:
//                    System.out.println("[ TEA ]");
//                    switch (select2) {
//                        case 1:
//                            System.out.println(tea1.teas[0].tea + ": " + tea1.teas[0].price);
//                            payment.teaCart = tea1.teas[0].tea;
//                            payment.teaPay = tea1.teas[0].price;
//                            hm.put(payment.teaCart, payment.teaPay);
//                            break;
//                        case 2:
//                            System.out.println(tea1.teas[1].tea + ": " + tea1.teas[1].price);
//                            payment.teaCart = tea1.teas[1].tea;
//                            payment.teaPay = tea1.teas[1].price;
//
//                            hm.put(payment.teaCart, payment.teaPay);
//                            break;
//                        case 3:
//                            System.out.println(tea1.teas[2].tea + ": " + tea1.teas[2].price);
//                            payment.teaCart = tea1.teas[2].tea;
//                            payment.teaPay = tea1.teas[2].price;
//
//                            hm.put(payment.teaCart, payment.teaPay);
//                            break;
//                        case 4:
//                            System.out.println(tea1.teas[3].tea + ": " + tea1.teas[3].price);
//                            payment.teaCart = tea1.teas[3].tea;
//                            payment.teaPay = tea1.teas[3].price;
//
//                            hm.put(payment.teaCart, payment.teaPay);
//                            break;
//                        default:
//                            System.out.println("준비중입니다.");
//                            // select2 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                            break;
//                    }
//                    break;
//                case 3:
//                    System.out.println("[ BLENDED ]");
//                    switch (select2) {
//                        case 1:
//                            System.out.println(blended1.blendeds[0].blended + ": " + blended1.blendeds[0].price);
//                            payment.blendCart = blended1.blendeds[0].blended;
//                            payment.blendPay = blended1.blendeds[0].price;
//                            hm.put(payment.blendCart, payment.blendPay);
//                            break;
//
//                        case 2:
//                            System.out.println(blended1.blendeds[1].blended + ": " + blended1.blendeds[1].price);
//                            payment.blendCart = blended1.blendeds[1].blended;
//                            payment.blendPay = blended1.blendeds[1].price;
//                            hm.put(payment.blendCart, payment.blendPay);
//                            break;
//                        case 3:
//                            System.out.println(blended1.blendeds[2].blended + ": " + blended1.blendeds[2].price);
//                            payment.blendCart = blended1.blendeds[2].blended;
//                            payment.blendPay = blended1.blendeds[2].price;
//                            hm.put(payment.blendCart, payment.blendPay);
//                            break;
//                        case 4:
//                            System.out.println(blended1.blendeds[3].blended + ": " + blended1.blendeds[3].price);
//                            payment.blendCart = blended1.blendeds[3].blended;
//                            payment.blendPay = blended1.blendeds[3].price;
//                            hm.put(payment.blendCart, payment.blendPay);
//                            break;
//
//                        default:
//                            System.out.println("준비중입니다.");
//                            break;
//                    }
//                    break;
//                default:
//                    // select 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                    break;
//            }
//            if (select == 5) {
//                break;
//            }
//        }


//
//        int select_1 = 0;
//        int select2_1 = 0;
//
//        while (true) {
//
//            int cnt2 = 1;
//            int select = sc.nextInt();
//
//
//            if (select == order.coffeeOrder) {
//                System.out.println("[ Coffee ]");
//                for (Coffee coffee : coffee1.coffees) {
//                    System.out.print(cnt2++ + ".");
//                    System.out.print(coffee.coffee + ": ");
//                    System.out.print(coffee.price + " | ");
//                    System.out.println(coffee.index);
//                }
//            } else if (select == order.teaOrder) {
//                System.out.println("[ Tea ]");
//                for (Tea tea : tea1.teas) {
//                    System.out.print(cnt2++ + ".");
//                    System.out.print(tea.tea + ": ");
//                    System.out.print(tea.price + " | ");
//                    System.out.println(tea.index);
//                }
//            } else if (select == order.blendedOrder) {
//                System.out.println("[ Blended ]");
//                for (Blended blended : blended1.blendeds) {
//                    System.out.print(cnt2++ + ".");
//                    System.out.print(blended.blended + ": ");
//                    System.out.print(blended.price + " | ");
//                    System.out.println(blended.index);
//                }
//
//            }
//
//            System.out.println();
//            System.out.print("메뉴를 선택해주세요. : ");
//            int select2 = sc.nextInt();
//
//            switch (select) {
//                case 1:
//                    System.out.println("[ COFFEE ]");
//                    switch (select2) {
//                        case 1:
//
//                            System.out.println(coffee1.coffees[0].coffee + ": " + coffee1.coffees[0].price);
//                            payment.coffeeCart = coffee1.coffees[0].coffee;
//                            payment.coffeePay = coffee1.coffees[0].price;
//                            hm.put(payment.coffeeCart, payment.coffeePay);
//                            break;
//                        case 2:
//                            System.out.println(coffee1.coffees[1].coffee + ": " + coffee1.coffees[1].price);
//                            payment.coffeeCart = coffee1.coffees[1].coffee;
//                            payment.coffeePay = coffee1.coffees[1].price;
//                            hm.put(payment.coffeeCart, payment.coffeePay);
//                            break;
//                        case 3:
//                            System.out.println(coffee1.coffees[2].coffee + ": " + coffee1.coffees[2].price);
//                            payment.coffeeCart = coffee1.coffees[2].coffee;
//                            payment.coffeePay = coffee1.coffees[2].price;
//                            hm.put(payment.coffeeCart, payment.coffeePay);
//                            break;
//                        case 4:
//                            System.out.println(coffee1.coffees[3].coffee + ": " + coffee1.coffees[3].price);
//                            payment.coffeeCart = coffee1.coffees[3].coffee;
//                            payment.coffeePay = coffee1.coffees[3].price;
//                            hm.put(payment.coffeeCart, payment.coffeePay);
//                            break;
//                        default:
//                            System.out.println("준비중입니다.");
//                            // select2 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                            break;
//                    }
//                    break;
//                case 2:
//                    System.out.println("[ TEA ]");
//                    switch (select2) {
//                        case 1:
//                            System.out.println(tea1.teas[0].tea + ": " + tea1.teas[0].price);
//                            payment.teaCart = tea1.teas[0].tea;
//                            payment.teaPay = tea1.teas[0].price;
//                            hm.put(payment.teaCart, payment.teaPay);
//                            break;
//                        case 2:
//                            System.out.println(tea1.teas[1].tea + ": " + tea1.teas[1].price);
//                            payment.teaCart = tea1.teas[1].tea;
//                            payment.teaPay = tea1.teas[1].price;
//
//                            hm.put(payment.teaCart, payment.teaPay);
//                            break;
//                        case 3:
//                            System.out.println(tea1.teas[2].tea + ": " + tea1.teas[2].price);
//                            payment.teaCart = tea1.teas[2].tea;
//                            payment.teaPay = tea1.teas[2].price;
//
//                            hm.put(payment.teaCart, payment.teaPay);
//                            break;
//                        case 4:
//                            System.out.println(tea1.teas[3].tea + ": " + tea1.teas[3].price);
//                            payment.teaCart = tea1.teas[3].tea;
//                            payment.teaPay = tea1.teas[3].price;
//
//                            hm.put(payment.teaCart, payment.teaPay);
//                            break;
//                        default:
//                            System.out.println("준비중입니다.");
//                            // select2 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                            break;
//                    }
//                    break;
//                case 3:
//                    System.out.println("[ BLENDED ]");
//                    switch (select2) {
//                        case 1:
//                            System.out.println(blended1.blendeds[0].blended + ": " + blended1.blendeds[0].price);
//                            payment.blendCart = blended1.blendeds[0].blended;
//                            payment.blendPay = blended1.blendeds[0].price;
//                            hm.put(payment.blendCart, payment.blendPay);
//                            break;
//
//                        case 2:
//                            System.out.println(blended1.blendeds[1].blended + ": " + blended1.blendeds[1].price);
//                            payment.blendCart = blended1.blendeds[1].blended;
//                            payment.blendPay = blended1.blendeds[1].price;
//                            hm.put(payment.blendCart, payment.blendPay);
//                            break;
//                        case 3:
//                            System.out.println(blended1.blendeds[2].blended + ": " + blended1.blendeds[2].price);
//                            payment.blendCart = blended1.blendeds[2].blended;
//                            payment.blendPay = blended1.blendeds[2].price;
//                            hm.put(payment.blendCart, payment.blendPay);
//                            break;
//                        case 4:
//                            System.out.println(blended1.blendeds[3].blended + ": " + blended1.blendeds[3].price);
//                            payment.blendCart = blended1.blendeds[3].blended;
//                            payment.blendPay = blended1.blendeds[3].price;
//                            hm.put(payment.blendCart, payment.blendPay);
//                            break;
//
//                        default:
//                            System.out.println("준비중입니다.");
//                            break;
//                    }
//                    break;
//                default:
//                    // select 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                    break;
//            }

//
//        System.out.println("위 메뉴를 장바구니에 추가하시겠습니끼?");
//        System.out.println("1.확인" + "       " + "2.취소");
//
//        int select3 = sc.nextInt();
//
//        cnt = 1;
//
//        if (select3 == 1) {
//            menu[0].name = "Coffee";
//            menu[0].index = "카페인이 들어간 음료입니다.";
//            menu[1].name = "Tea";
//            menu[1].index = "티 종류의 음료입니다.";
//            menu[2].name = "Blended";
//            menu[2].index = "얼음을 블랜딩 해 시원하게 마시는 음료입니다.";
//
//
//            switch (select) {
//                case 1:
//                    System.out.println("[ COFFEE ]");
//                    switch (select2) {
//                        case 1:
//                            System.out.println(coffee1.coffees[0].coffee + "가 장바구니에 추가되었습니다.");
//                            break;
//                        case 2:
//                            System.out.println(coffee1.coffees[1].coffee + "가 장바구니에 추가되었습니다.");
//                            break;
//                        case 3:
//                            System.out.println(coffee1.coffees[2].coffee + "가 장바구니에 추가되었습니다.");
//                            break;
//                        case 4:
//                            System.out.println(coffee1.coffees[3].coffee + "가 장바구니에 추가되었습니다.");
//                            break;
//                        default:
//                            System.out.println("준비중입니다.");
//                            // select2 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                            break;
//                    }
//                    break;
//                case 2:
//                    System.out.println("[ TEA ]");
//                    switch (select2) {
//                        case 1:
//                            System.out.println(tea1.teas[0].tea + "가 장바구니에 추가되었습니다.");
//                            break;
//                        case 2:
//                            System.out.println(tea1.teas[1].tea + "가 장바구니에 추가되었습니다.");
//                            break;
//                        case 3:
//                            System.out.println(tea1.teas[2].tea + "가 장바구니에 추가되었습니다.");
//                            break;
//                        case 4:
//                            System.out.println(tea1.teas[3].tea + "가 장바구니에 추가되었습니다.");
//                            break;
//                        default:
//                            System.out.println("준비중입니다.");
//                            // select2 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                            break;
//                    }
//                    break;
//                case 3:
//                    System.out.println("[ BLENDED ]");
//                    switch (select2) {
//                        case 1:
//                            System.out.println(blended1.blendeds[0].blended + "가 장바구니에 추가되었습니다.");
//                            break;
//                        case 2:
//                            System.out.println(blended1.blendeds[1].blended + "가 장바구니에 추가되었습니다.");
//                            break;
//                        case 3:
//                            System.out.println(blended1.blendeds[2].blended + "가 장바구니에 추가되었습니다.");
//                            break;
//                        case 4:
//                            System.out.println(blended1.blendeds[3].blended + "가 장바구니에 추가되었습니다.");
//                            break;
//                        default:
//                            System.out.println("준비중입니다.");
//                            break;
//                    }
//                    break;
//                default:
//                    // select 값이 주어진 case에 맞지 않을 경우 처리할 로직을 작성합니다.
//                    break;
//            }
//
//
//            for (int i = 0; i < menu.length; i++) {
//
//                System.out.print(cnt++ + ". ");
//                menu[i].showMenu();
//
//            }
//            System.out.println("[ ORDER MENU ]");
//            System.out.println(cnt++ + ". Order" + " | " + "장바구니를 확인 후 주문합니다.");
//            System.out.println(cnt++ + ". Cancel" + " | " + "진행중인 주문을 취소합니다.");
//        }
//
//
//
//
//
//        int select4 = sc.nextInt();
//        if(select4 == 4) {
//            for (String cart : hm.keySet()) {
//                System.out.println(cart);
//                for (int cost : hm.values()) {
//                    System.out.println(cost);
//                }
//            }
//        }


    }
}





