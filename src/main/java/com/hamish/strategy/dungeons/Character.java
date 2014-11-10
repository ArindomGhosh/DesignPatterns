package com.hamish.strategy.dungeons;

/**
 * Created by hamishdickson on 10/11/14.
 */
public abstract class Character {
    WeaponBehavior weapon;

    public Character() {
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();
}
