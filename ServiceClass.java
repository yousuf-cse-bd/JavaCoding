
/*****
* Problem: Console based Java RMI geomatric calculator
* @Author: Muhammad Yousuf Ali
* @Since:  13th April 2021
*/

public class ServiceClass implements ServiceInterface{
	
	public double get_Circumference(int r)
	{
		double circumference = 2*Math.PI*r;
		return circumference;
	}
	public double get_Area(int r){
		double area = Math.PI*r*r;
		return area;
	}
}
