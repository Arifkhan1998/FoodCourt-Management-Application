package classes;

import java.lang.*;

public class MainDish extends FoodItem
{
	
	private String category;
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public String getCategory( )

	{
		return category;
	}
	 public void showInfo()
	{
	    System.out.println(" FoodItem id is : "+ getFid());
	    System.out.println(" FoodItem name is : "+ getName());
		System.out.println(" FoodItem available quantity is : "+ getAvailableQuantity());
		System.out.println(" FoodItem price is : "+ getPrice());
		System.out.println(" FoodItem category is : "+ getCategory());
	}
}
	