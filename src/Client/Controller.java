package Client;
import java.net.URL;
import java.util.ResourceBundle;

import Interface.src.HomeInterface;
import Server.src.Servant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import sun.management.HotspotMemoryMBean;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Vector;
import java.util.Scanner;

public class Controller implements Initializable {

    @FXML
    private Label templabel;

    @FXML
    private ProgressBar tempbar;

    @FXML
    private Label infofield;

    @FXML
    private void buttonCheckTemperature(ActionEvent event) throws RemoteException, NotBoundException {
        Registry reg;
        reg = LocateRegistry.getRegistry("localhost");
        HomeInterface stub=(HomeInterface) reg.lookup("Server");
        double temp = stub.checkTemp();
        tempbar.setProgress(temp);
        templabel.setText(String.valueOf(Math.round(temp*32)));
    }

    @FXML
    private void buttonOpenGarage(ActionEvent event) throws RemoteException, NotBoundException {
        Registry reg;
        reg = LocateRegistry.getRegistry("localhost");
        HomeInterface stub=(HomeInterface) reg.lookup("Server");
        infofield.setText(stub.openGarage());
    }

    @FXML
    private void buttonCloseGarage(ActionEvent event) throws RemoteException, NotBoundException {
        Registry reg;
        reg = LocateRegistry.getRegistry("localhost");
        HomeInterface stub=(HomeInterface) reg.lookup("Server");
        infofield.setText(stub.closeGarage());
    }

    @FXML
    private void buttonCloseDoors(ActionEvent event) throws RemoteException, NotBoundException {
        Registry reg;
        reg = LocateRegistry.getRegistry("localhost");
        HomeInterface stub=(HomeInterface) reg.lookup("Server");
        infofield.setText(stub.closeDoors());
    }

    @FXML
    private void buttonOpenCloseDoor(ActionEvent event) throws RemoteException, NotBoundException {
        Registry reg;
        reg = LocateRegistry.getRegistry("localhost");
        HomeInterface stub=(HomeInterface) reg.lookup("Server");
        infofield.setText(stub.frontDoorOpenClose());
    }

    @FXML
    private void buttonCheckAGD(ActionEvent event) throws RemoteException, NotBoundException {
        Registry reg;
        reg = LocateRegistry.getRegistry("localhost");
        HomeInterface stub=(HomeInterface) reg.lookup("Server");
        infofield.setText(stub.checkAGD());
    }

    @FXML
    private void buttonTurnOnLights(ActionEvent event) throws RemoteException, NotBoundException {
        Registry reg;
        reg = LocateRegistry.getRegistry("localhost");
        HomeInterface stub=(HomeInterface) reg.lookup("Server");
        infofield.setText(stub.turnOnLights());
    }

    @FXML
    private void buttonTurnOffLights(ActionEvent event) throws RemoteException, NotBoundException {
        Registry reg;
        reg = LocateRegistry.getRegistry("localhost");
        HomeInterface stub=(HomeInterface) reg.lookup("Server");
        infofield.setText(stub.turnOffLights());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}