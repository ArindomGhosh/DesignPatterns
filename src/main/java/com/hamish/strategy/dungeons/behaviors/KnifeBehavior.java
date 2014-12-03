package com.hamish.strategy.dungeons.behaviors;

/**
 * Created by hamishdickson on 10/11/14.
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I use my knife at thee!");
    }
}
