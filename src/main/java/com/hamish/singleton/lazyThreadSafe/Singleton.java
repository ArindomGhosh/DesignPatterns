package com.hamish.singleton.lazyThreadSafe;

/**
 * Created by hamishdickson on 07/12/14.
 *
 * The go-to thread safe singleton - good interview material. It is slow like this, but
 * it should be used when you don't know if your singleton is going to be used or not.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    /**
     * synchronized does the hard work here.
     *
     * However, there is a problem - synchronization is SLOW (roughly 100 times slower) and
     * it's called multiple times, when the problem with thread safety only really happens
     * before the first singleton is created.
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}
