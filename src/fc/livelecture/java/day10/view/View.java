package fc.livelecture.java.day10.view;

import fc.livelecture.java.day10.model.Item;

import java.util.HashMap;
import java.util.Map;

public class View {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Item item = new Item("img.jpg", "strawberry", 10000, "delicious");

        Item result = controller.saveItem(item);

        System.out.println("result = " + result);

    }
}

class Controller {
    Logic logic = new Logic();


    public Item saveItem(Item item) {
        Item saveItem = logic.addItem(item);

        return saveItem;
    }
}

class Logic {
    Map<Integer, Item> db = new HashMap<>();

    public Item addItem(Item item) {
        db.put(1, item);
        Item getItem = db.get(1);

        return getItem;
    }
}
