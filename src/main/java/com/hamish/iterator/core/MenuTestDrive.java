package com.hamish.iterator.core;

/**
 * Created by hamishdickson on 18/12/14.
 *
 * So, manual uses a manually implemented version of iterator. Here, we use the core version
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
