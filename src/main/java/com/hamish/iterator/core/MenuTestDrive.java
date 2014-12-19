package com.hamish.iterator.core;

/**
 * Created by hamishdickson on 18/12/14.
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
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
