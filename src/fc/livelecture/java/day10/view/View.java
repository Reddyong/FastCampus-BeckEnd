package fc.livelecture.java.day10.view;

import fc.livelecture.java.day10.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class View {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Item item1 = new Item("img.jpg", "strawberry", 10000, "delicious");
        Item item2 = new Item("img2.jpg", "grape", 20000, "nice");

        Item result1 = controller.saveItem(item1);
        System.out.println(result1.getName() + " saved well!!");

        Item result2 = controller.saveItem(item2);
        System.out.println(result2.getName() + " saved well!!");

        List<Item> items = controller.findAll();
        System.out.println("items = " + items);

        Item find = controller.findByName("strawberry");
        System.out.println("find = " + find);

        Item find1 = controller.findById(1);
        System.out.println("find1 = " + find1);

        Item find2 = controller.findById(2);
        System.out.println("find2 = " + find2);

    }
}

class Controller {
    Logic logic = new Logic();

    public Item saveItem(Item item) {
        Item saveItem = logic.addItem(item);

        return saveItem;
    }

    public List<Item> findAll() {
        return logic.findAllItems();
    }

    public Item findByName(String name) {
        return logic.findItemByName(name);
    }

    public Item findById(int id) {
        return logic.findItemById(id);
    }
}

class Logic {
    private static int key = 0;
    Map<Integer, Item> db = new HashMap<>();

    public Item addItem(Item item) {
        db.put(++key, item);
        Item getItem = db.get(key);

        return getItem;
    }

    public List<Item> findAllItems() {
        return new ArrayList<>(db.values());
    }

    public Item findItemByName(String name) {
        for (Item item : db.values()) {
            if (item.getName().equals(name)) {
                return item;
            }
        }

        return null;
    }

    public Item findItemById(int id) {
        return db.get(id);
    }
}
