/*****
* Problem: Console based Java RMI geomatric calculator
* @Author: Muhammad Yousuf Ali
* @Since:  13th April 2021
*/
//Service Interface
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceInterface extends Remote{
	public double get_Circumference(int r) throws RemoteException;
	public double get_Area(int r) throws RemoteException;
}
