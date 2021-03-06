package com.hamish.strategy.dungeons.characters;

import com.hamish.strategy.dungeons.behaviors.KnifeBehavior;

import java.lang.*;

/**
 * Created by hamishdickson on 10/11/14.
 */
public class Queen extends Character {
    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I am the Queen and now I fight!");
        weapon.useWeapon();
    }
}
