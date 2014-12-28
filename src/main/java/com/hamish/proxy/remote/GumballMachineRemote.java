package com.hamish.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by hamishdickson on 28/12/14.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;

    /**
     * remember the return types have to be serlizable
     * @return
     * @throws RemoteException
     */
    public State getState() throws RemoteException;
}
