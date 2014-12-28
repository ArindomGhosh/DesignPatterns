package com.hamish.proxy.simple.client;

import com.hamish.proxy.simple.server.MyRemote;

import java.rmi.Naming;

/**
 * Created by hamishdickson on 28/12/14.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            String s = service.sayHello();

            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
