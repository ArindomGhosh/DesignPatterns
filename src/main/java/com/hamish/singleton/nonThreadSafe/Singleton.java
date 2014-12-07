package com.hamish.singleton.nonThreadSafe;

/**
 * Created by hamishdickson on 07/12/14.
 *
 * Basically, you shouldn't use this - it's just not thread safe.
 *
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) uniqueInstance = new Singleton();

        return uniqueInstance;
    }
}
