package com.hamish.singleton.doubleCheckedThread;

/**
 * Created by hamishdickson on 07/12/14.
 *
 * Note: doesn't work in java 1.4 or earlier
 *
 * idea is to check if there is an instance and if not, then create a synchonized block
 * which will do the creation. This has the advantage that it will only be slow the first
 * time, but it is thread safe.
 *
 * disadvantage: only for java 1.4 or greater.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}
