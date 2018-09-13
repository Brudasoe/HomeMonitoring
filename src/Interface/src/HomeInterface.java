package Interface.src;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HomeInterface extends Remote{
    public String openGarage() throws  RemoteException;

    public String closeGarage() throws  RemoteException;

    public String turnOffLights() throws RemoteException;

    public String turnOnLights() throws RemoteException;

    public String closeDoors() throws RemoteException;

    public String frontDoorOpenClose() throws RemoteException;

    public String checkAGD() throws RemoteException;

    public Double checkTemp() throws RemoteException;
}
