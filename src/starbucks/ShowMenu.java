package starbucks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShowMenu extends Order{

    //생성자
    ShowMenu(){}

    // 메뉴판 보여주기
    public void showMenus(int menuSelect) {

        if (menuSelect == 1) coffeeMenu();
        else if (menuSelect == 2) teaMenu();
        else if (menuSelect == 3) breadMenu();
        else if (menuSelect == 4) System.out.println("Order");
        else if (menuSelect == 5) System.out.println("Cancel");
        else System.out.println();


    }



}
