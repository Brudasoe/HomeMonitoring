package Server.src;

import Interface.src.HomeInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servant extends UnicastRemoteObject implements HomeInterface {
    public boolean garageState = true;
    public boolean lightsState = true;
    public boolean doorsState = true;
    public boolean agdState = true;
    public boolean frontDoorState = true;
    public double temp = 0.5;
    public String message = "";

    protected Servant() throws RemoteException {
    }

    @Override
    public String openGarage() throws RemoteException {
        if (garageState){
            message = "Garage doors already open";
        }
        else{
            message = "Garage doors opened";
            garageState = true;
        }
        return message;
    }

    @Override
    public String closeGarage() throws RemoteException {
        if (garageState){
            message = "Closing garage doors";
            garageState = false;
        }
        else{
            message = "Garage doors already closed";
        }
        return message;
    }

    @Override
    public String turnOffLights() throws RemoteException {
        if (lightsState){
            message = "Lights on, turning them off";
            lightsState = false;
        }
        else{
            message = "Lights already off";
        }
        return message;
    }

    @Override
    public String turnOnLights() throws RemoteException {
        if (lightsState){
            message = "Lights already on";
        }
        else{
            message = "Lights off, turning them on";
            lightsState = false;
        }
        return message;
    }

    @Override
    public String closeDoors() throws RemoteException {
        if (doorsState){
            message = "Doors open, closing them";
            doorsState = false;
        }
        else{
            message = "Doors already closed";
        }
        return message;
    }

    @Override
    public String frontDoorOpenClose() throws RemoteException {
        if (frontDoorState){
            message = "Closing the front door";
            frontDoorState = false;
        }
        else{
            message = "Opening the front door";
            frontDoorState = true;
        }
        return message;
    }

    @Override
    public String checkAGD() throws RemoteException {
        if(agdState){
            message = "Detected home appliances that were turned on, shutting them down";
            agdState = false;
        }
        else {
            message = "Every home appliance is shut down";
        }
        return message;
    }

    @Override
    public Double checkTemp() throws RemoteException {
        return temp = Math.random();
    }
}
