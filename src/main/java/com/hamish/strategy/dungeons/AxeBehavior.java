package com.hamish.strategy.dungeons;

/**
 * Created by hamishdickson on 10/11/14.
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Smash! Me use axe!");
    }
}
