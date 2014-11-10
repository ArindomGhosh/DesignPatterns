package com.hamish.strategy.dungeons;

/**
 * Created by hamishdickson on 10/11/14.
 * 
 */
public class Knight extends Character {
    public Knight() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("My name is Inigo Montoya, you killed my father, prepare to die!");
        weapon.useWeapon();
    }
}
