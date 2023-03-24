package classes;

import java.lang.*;

public class Appitizers extends FoodItem
{
	
	private String size;

	
	public  void setSize(String size)

	{
		this.size = size;
	}
	
	public String getSize( )

	{
		return size;
	}
	
	public void showInfo()
	{
		
		System.out.println(" FoodItem id is : "+ getFid());
	    System.out.println(" FoodItem name is : "+ getName());
		System.out.println(" FoodItem available quantity is : "+ getAvailableQuantity());
		System.out.println(" FoodItem price is : "+ getPrice());
		System.out.println(" FoodItem size is : "+ getSize());
	}
}