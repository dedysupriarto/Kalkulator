/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.NotBoundException;

/**
 *
 * @author Dedy-PC
 */
public class KalkulatorServer {
    public static void main(String[] args) throws RemoteException,NotBoundException
    {
        try
        {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1091);
            r.rebind("Kalkulator", new Kalkulator());
            System.out.println("server is running");
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }
    
}
