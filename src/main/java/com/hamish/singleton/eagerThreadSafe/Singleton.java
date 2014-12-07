package com.hamish.singleton.eagerThreadSafe;

/**
 * Created by hamishdickson on 07/12/14.
 *
 * In this example, an instance is created on startup and it is thread safe
 *
 * However, you should only really use this when you know for a fact that your singleton
 * is going to be called at some point.
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
