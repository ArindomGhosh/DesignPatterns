package com.hamish.proxy.simple.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by hamishdickson on 28/12/14.
 *
 * interface must extend rmi.Remote
 */
public interface MyRemote extends Remote {
    /**
     * must declare exception here
     * @return
     * @throws RemoteException
     */
    public String sayHello() throws RemoteException;
}
