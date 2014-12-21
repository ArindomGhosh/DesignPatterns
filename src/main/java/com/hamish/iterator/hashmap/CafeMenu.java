package com.hamish.iterator.hashmap;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by hamishdickson on 21/12/14.
 */
public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {
        addItem("Veggie Burger with Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato and fries",
                true,
                3.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of salad",
                false,
                3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa and guacamole",
                false,
                4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    /**
     * no longer need this with createIterator
     * @return
     */
    /*public HashMap<String, MenuItem> getItems() {
        return menuItems;
    }*/

    /**
     * notice, for hashmap, we aren't getting the hashmap but instead it's values!
     *
     * first, fetch the values and then iterator works on that!
     * @return
     */
    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
