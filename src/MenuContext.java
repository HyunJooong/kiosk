import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuContext {

    private Map<String, List<Menu>> menus;
    private Map<String, List<Item>> items;
    private List<Item> cart;

    //생성자 생성
    public MenuContext(){
        menus = new HashMap<>();
        items = new HashMap<>();
        cart = new ArrayList<>();

        List<Menu> mainMenus = new ArrayList<>();
        Menu menu1 = new Menu();
        mainMenus.add(new Menu());
    }




}
