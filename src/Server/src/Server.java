package Server.src;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server  {

    public static void main(String[] args) {
        try {
            new Server();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private Server() throws RemoteException {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            Servant servant = new Servant();
            reg.rebind("Server", servant);
            System.out.println("Server READY");
        } catch (RemoteException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
