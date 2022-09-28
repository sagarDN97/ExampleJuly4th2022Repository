package com.sgtesting.interfaceDemo;
interface Bike
{
	default void displayBikeNames(String name[])
	{
		System.out.println("Bike Names!!!!!");
		for (int i = 0; i < name.length; i++) 
		{
			System.out.println(name[i]);
		}
	}
	void displayCompanyName(String companyName);
}
class Sample implements Bike
{
	 public void displayCompanyName(String companyName)
	 {
		 System.out.println("CompanyName:"+companyName);
	 }
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.displayCompanyName("YAMAHA");
		String s[]= {"RX","R15","CRUX"};
		obj.displayBikeNames(s);
	}

}
