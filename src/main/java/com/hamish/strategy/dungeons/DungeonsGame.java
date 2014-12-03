package com.hamish.strategy.dungeons;

import com.hamish.strategy.dungeons.behaviors.SwordBehavior;
import com.hamish.strategy.dungeons.characters.*;
import com.hamish.strategy.dungeons.characters.Character;

/**
 * Created by hamishdickson on 10/11/14.
 *
 * The Strategy Pattern: defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * clients that use it.
 */
public class DungeonsGame {
    public static void main(String[] args) {
        System.out.println("Starting the Strategy Pattern sim!");

        whoAmI("Queen");
        Character queen = new Queen();
        queen.fight();

        whoAmI("King");
        Character king = new King();
        king.fight();

        whoAmI("Troll");
        Character troll = new Troll();
        troll.fight();

        whoAmI("Kinght");
        Character knight = new Knight();
        knight.fight();
        knight.setWeapon(new SwordBehavior());
        knight.fight();
    }

    private static void whoAmI(String who) {
        System.out.println("\n -- " + who + " -- ");
    }

}
