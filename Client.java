/*****
* Problem: Console based Java RMI geomatric calculator
* @Author: Muhammad Yousuf Ali
* @Since:  13th April 2021
*/

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class Client extends ServiceClass{
		
	public static void main(String args[]) throws Exception {
		Registry reg = LocateRegistry.getRegistry(null);
		ServiceInterface l_ob1 = (ServiceInterface)reg.lookup("Service_1");
		ServiceInterface l_ob2 = (ServiceInterface)reg.lookup("Service_2");

		int r;
		char ch;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Radius Value Here: ");
		r = scanner.nextInt();

		System.out.print("Enter C or A: ");
		ch = scanner.next().charAt(0);
		if(ch == 'c' || ch == 'C'){
			System.out.println("Circumference: "+ l_ob1.get_Circumference(r));
		}
		else if(ch == 'a' || ch == 'A'){

			System.out.println("Area: "+ l_ob2.get_Area(r));
		}else{
			System.out.println("It Support Only Between a or c");
		}

        scanner.close();
		
	}
	
}
