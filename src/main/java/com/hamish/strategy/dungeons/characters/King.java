package com.hamish.strategy.dungeons.characters;

import com.hamish.strategy.dungeons.behaviors.SwordBehavior;

import java.lang.*;

/**
 * Created by hamishdickson on 10/11/14.
 */
public class King extends Character {
    public King() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("As king I fight");
        weapon.useWeapon();
    }
}
