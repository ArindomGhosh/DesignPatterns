package com.hamish.iterator.core;

/**
 * Created by hamishdickson on 17/12/14.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin) Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);

        addItem("BLT",
                "Bacon with telluce * tomato on whole wheat",
                false,
                2.99);

        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29);

        addItem("Hotdog",
                "A hot dog, with surkraut, relish, onions, topped with cheese",
                false,
                3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add more items");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }


    /**
     * no longer need this with the iterator
     * @return
     */
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    /**
     * we return the iterator interface. The client doesn't need to know how the menuItems
     * are maintained - it uses the iterator to step through the elements
     * @return
     */
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    // other menu methods here
}
