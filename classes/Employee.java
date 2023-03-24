package classes;

import java.lang.*;

public class Employee
{
	private String empId;
	private String name;
	private double salary;
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmpId()
	{
		return empId;
	} 
	
	public double getSalary()
	{
		return salary;
	} 
}