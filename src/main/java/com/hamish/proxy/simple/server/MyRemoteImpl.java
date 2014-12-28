package com.hamish.proxy.simple.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by hamishdickson on 28/12/14.
 *
 * extending UnicastRemoteObject is the easiest way to make a remote object
 *
 * note, you must implement your remote interface!!!
 *
 * Important:
 * 1) start the rmiregistory first.
 * 2) make args and return types primitives or serializable
 *
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1l;

    /**
     * must create a constructor to throw the RemoteException
     * @throws RemoteException
     */
    protected MyRemoteImpl() throws RemoteException {
    }

    /**
     * here you don't have to throw the exception
     * @return
     */
    @Override
    public String sayHello() {
        return "Server says, 'Hey'";
    }

    /**
     * make the remote object, then 'bind' it to the rmiregistry using the static Naming.rebind().
     * The name you register it under is the name that will be used to do the lookup on the RMI reg
     */
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
