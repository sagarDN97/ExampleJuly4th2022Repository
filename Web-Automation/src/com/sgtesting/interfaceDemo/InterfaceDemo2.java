package com.sgtesting.interfaceDemo;
interface Cars
{
	static void displayCarNames(String Carname[])
	{
		System.out.println("Car Names!!!");
		for (int i = 0; i < Carname.length; i++) 
		{
			System.out.println(Carname[i]);
		}
	}
	void displayCompanyName();
}
class pool implements Cars
{
	public void displayCompanyName(String carcomp )
	{
		System.out.println("CAR COMPANY:"+carcomp);
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		pool obj=new pool();
		obj.displayCompanyName("TOYOTA");
		String v[]= {"Innova","Etios","Fortuner"};
		Cars.displayCarNames(v);
	}

}
