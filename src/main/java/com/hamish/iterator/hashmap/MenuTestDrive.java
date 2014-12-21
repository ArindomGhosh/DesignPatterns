package com.hamish.iterator.hashmap;

/**
 * Created by hamishdickson on 18/12/14.
 *
 * 3rd implementation: hashmap needs values().iterator()
 *
 * The Iterator Pattern: provides a way to access the elements of an aggregate object
 * sequentially without exposing it's underlying representation
 *
 * So, manual uses a manually implemented version of iterator. Here, we use the core version
 *
 * Note: along with the next() and hasNext() methods, the core interface has a remove()
 * method which must be implemented. IF you don't want to use it, then instead it should
 * probably throw an exception.
 *
 * Note 2: we don't need to implement the iterator for pancakemenu anymore - that's because
 * it uses ArrayList and that has already done it for us ... but sadly dinermenus' array
 * has not ... so we still need dinermenuiterator
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
