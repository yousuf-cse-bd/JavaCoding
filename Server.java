/*****
* Problem: Console based Java RMI geomatric calculator
* @Author: Muhammad Yousuf Ali
* @Since:  13th April 2021
*/


import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server extends ServiceClass{
		
	public static void main(String args[]) throws Exception
	{
		ServiceClass ob=new ServiceClass();
		ServiceInterface p_ob=(ServiceInterface)UnicastRemoteObject.exportObject(ob,0);
		Registry reg=LocateRegistry.getRegistry();
		reg.bind("Service_1",p_ob);
		reg.bind("Service_2",p_ob);
		System.out.println("Server Is Running...");
	}
	
}
