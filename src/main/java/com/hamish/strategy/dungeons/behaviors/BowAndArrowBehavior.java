package com.hamish.strategy.dungeons.behaviors;

/**
 * Created by hamishdickson on 10/11/14.
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Ping goes my arrow!");
    }
}
