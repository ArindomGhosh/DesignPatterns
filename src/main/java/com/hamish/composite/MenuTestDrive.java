package com.hamish.composite;

/**
 * Created by hamishdickson on 21/12/14.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta",
                "Spaghetti with Marinara Sauce and a slice of sourdough bread",
                true,
                3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

        cafeMenu.add(new MenuItem("Veggie Burger with Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato and fries",
                true,
                3.99));

        cafeMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of salad",
                false,
                3.69));

        cafeMenu.add(new MenuItem("Burrito",
                "A large burrito, with whole pinto beans, salsa and guacamole",
                false,
                4.29));

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99));

        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));

        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));

        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin) Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));

        dinerMenu.add(new MenuItem("BLT",
                "Bacon with telluce * tomato on whole wheat",
                false,
                2.99));

        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29));
        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with surkraut, relish, onions, topped with cheese",
                false,
                3.05));
        
        // some more items

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
