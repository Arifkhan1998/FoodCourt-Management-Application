import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		FoodCourt fc = new FoodCourt();
		fileInputOutput frwd = new fileInputOutput();
		
		System.out.println("------------------------");
		System.out.println("Welcome to ABC FoodCourt");
		System.out.println("------------------------");
		
		boolean repeat = true;
		
		while (repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Empolyee Management.");
			System.out.println("\t2. Restaurant Management.");
			System.out.println("\t3. Restaurant FoodItem Management.");
			System.out.println("\t4. FoodItem Quantity Add-sell.");
			System.out.println("\t5. Exit.");
			System.out.println("------------------------");
			
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("------------------------");
					System.out.println("You have chosen Employee Management.");
					System.out.println("------------------------");
					
					System.out.println("You have following options : ");
					System.out.println("\t1. Insert New Employee.");
					System.out.println("\t2. Remove Existing Employee.");
					System.out.println("\t3. Show All Employees.");
					System.out.println("\t4. Search An Employee.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{ 
						case 1:
						    System.out.println("------------------------");
					        System.out.println("You have chosen to Insert New Employee.");
					        System.out.println("------------------------");
					
					        System.out.print("Enter Employee ID : ");
					        String empId1 = sc.next();
					        System.out.print("Enter Employee Name : ");
					        String name1 = sc.next();
					        System.out.print("Enter Employee Salary : ");
					        double salary1 =  sc.nextDouble();
					
					        Employee e1 = new Employee();
					        e1.setEmpId(empId1);
					        e1.setName(name1);
					        e1.setSalary(salary1);
					
					        if(fc.insertEmployee(e1))
					        {
								System.out.println("------------------------");
						        System.out.println("Empolyee Inserted With ID : "+e1.getEmpId());
								System.out.println("------------------------");
					        }
					        else
					        {
						        System.out.println("Cannot Insert  An Empolyee.");
								System.out.println("------------------------");
				            }
					        break; 
						
						case 2:
						    System.out.println("-----------------------------------------------");
					        System.out.println("You have chosen to Remove An Exixting Employee.");
					        System.out.println("------------------------");
					
					        System.out.print("Enter an Employee ID to Remove : ");
							String empId2 = sc.next();
                            
                            Employee e2 = fc.searchEmployee(empId2);
                            
                            if(e2 != null)
							{
								if(fc.removeEmployee(e2))
								{
									System.out.println("Employee Removed with ID : "+e2.getEmpId());
									System.out.println("------------------------");
							    }
								else
								{
									System.out.println("Employee Can Not be Removed.");
									System.out.println("------------------------");
							    }
							}
                            else
						    {
								System.out.println("Employee Does Not Exist.");
								System.out.println("------------------------");
							}	
							break; 
							
						case 3:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to See All Employee");
							System.out.println("------------------------");
							fc.showAllEmployees();
							break;
							
						case 4:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Search An Employee");
							System.out.println("------------------------");
							
							System.out.print("Enter an Employee ID to Search : ");
							String empId3 = sc.next();
							
							Employee e3 = fc.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("------------------------");
								System.out.println("Employee Found.");
								System.out.println("-------------------------");
								System.out.println("Employee ID : "+e3.getEmpId());
								System.out.println("Employee Name : "+e3.getName());
								System.out.println("Employee Salary : "+e3.getSalary());
								System.out.println("------------------------");
							}
							else 
							{
								System.out.println("------------------------");
								System.out.println("Employee Does Not Exist");
								System.out.println("------------------------");
							}
							break;
							
						case 5:
							System.out.println("------------------------");
							System.out.println("You have Chosen to Go Back.");
							System.out.println("------------------------");
							
							break;
					}
					
					break; 
					
				case 2:
					System.out.println("------------------------");
					System.out.println("You Have Chosen Restaurant Management.");
					System.out.println("------------------------");
					
					System.out.println("You have following options : ");
					System.out.println("\t1. Insert New Restaurant.");
					System.out.println("\t2. Remove Existing Restaurant.");
					System.out.println("\t3. Show All Restaurant.");
					System.out.println("\t4. Search A Restaurant.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option2 = sc.nextInt();
					
					switch(option2) 
					{
						case 1:
						    System.out.println("------------------------");
							System.out.println("You Have Chosen to Insert A Restaurant");
							System.out.println("------------------------");
							
							System.out.print("Enter Restaurant ID : ");
						    String rid1 = sc.next();
							System.out.print("Enter Restaurant Name : ");
							String name1 = sc.next();
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
							
							if(fc.insertRestaurant(r1))
							{
								System.out.println("Restaurant Inserted with ID: "+r1.getRid());
								System.out.println("------------------------");
						    }
							else
							{
								System.out.println("Restaurant can not be inserted");
								System.out.println("------------------------");
						    }
							
							break; 
						
						case 2:
						    System.out.println("------------------------");
					        System.out.println("You have chosen to Remove an Existing Restaurant.");
					        System.out.println("------------------------");
					
					        System.out.print("Enter a Restaurant ID to Remove : ");
							String rid2 = sc.next();
                            
                            Restaurant r2 = fc.searchRestaurant(rid2);
                            
                            if(r2 != null)
							{
								if(fc.removeRestaurant(r2))
								{
									System.out.println("Restaurant Removed with ID : "+r2.getRid());
									System.out.println("------------------------");
							    }
								else
								{
									System.out.println("Restaurant Can Not be Removed.");
									System.out.println("------------------------");
								}
							}
                            else
						    {
								System.out.println("Restaurant Does Not Exist.");
							}	
							break; 
							
						case 3:
							System.out.println("------------------------");
							System.out.println("You Have Chosen Show All Restaurant.");
							System.out.println("------------------------");
							fc.showAllRestaurants();
							break;
							
						case 4:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Search Restaurant");
							System.out.println("------------------------");
							
							System.out.print("Enter a Restaurant ID to Search : ");
							String rid3 = sc.next();
							
							Restaurant r3 = fc.searchRestaurant(rid3);
							
							if(r3 != null) 
							{
								System.out.println("Restaurant Found.");
								System.out.println("Restaurant ID : "+r3.getRid());
								System.out.println("Restaurant Name : "+r3.getName());
						
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
								System.out.println("------------------------");
							}
						    break;
							
						case 5:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("------------------------");
							
							break;
					}
					
					break;
				
				case 3:
				    System.out.println("------------------------");
					System.out.println("You have chosen Restaurant FoodItem Management.");
					System.out.println("------------------------");
					
					System.out.println("You have following options : \n");
					System.out.println("\t1. Insert New FoodItem.");
					System.out.println("\t2. Remove Existing FoodItem.");
					System.out.println("\t3. Show All FoodItem.");
					System.out.println("\t4. Search A FoodItem.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1: 
							
							System.out.println("------------------------");
							System.out.println("You have chose to Insert a FoodItem for Restaurant.");
							System.out.println("------------------------");
							
							System.out.print("Enter Restaurant ID : ");
							String rid1 = sc.next();
							
							if(fc.searchRestaurant(rid1)!=null)
							{
								System.out.println("Which type Of FoodItem do you want to insert?");
								System.out.println("\t1. MainDish");
								System.out.println("\t2. Appitizers.");
								System.out.println("\t3. Go Back.");
								
								System.out.print("Enter FoodItem Type: ");
								int foodItemType = sc.nextInt();
								
								if(foodItemType == 1) 
								{
									System.out.print("Enter FoodItem ID : ");
									String fid5 = sc.next();
									System.out.print("Enter FoodItem Name : ");
									String fm1 = sc.next();
									System.out.print("Enter Available Quantity : ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price : ");
									double p1 = sc.nextDouble();
									System.out.print("Enter category : ");
									String ct1 = sc.next();
									
									MainDish md1 = new MainDish();
									md1.setFid(fid5);
									md1.setName(fm1);
									md1.setAvailableQuantity(aq1);
									md1.setPrice(p1);
									md1.setCategory(ct1);
									
									if(fc.searchRestaurant(rid1).insertFoodItem(md1))
									{
										System.out.println("FoodItem name  "+fm1+"  inserted for Restaurant ID  "+rid1);
										System.out.println("------------------------");
									}
									else
									{
										System.out.println("FoodItem Can NOt be inserted");
										System.out.println("------------------------");
									}
								}
								else if(foodItemType == 2) 
								{
			                        System.out.print("Enter FoodItem ID : ");
									String fid6 = sc.next();
									System.out.print("Enter FoodItem Name : ");
									String fm1 = sc.next();
									System.out.print("Enter Availabe Quantity : ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price : ");
									double p2 = sc.nextDouble();
									System.out.print("Enter Size : ");
									String s1 = sc.next();
									
									Appitizers ap1 = new Appitizers();
									ap1.setFid(fid6);
									ap1.setName(fm1);
									ap1.setAvailableQuantity(aq1);
									ap1.setPrice(p2);
									ap1.setSize(s1);
									
									if(fc.searchRestaurant(rid1).insertFoodItem(ap1))
									{
										System.out.println("FoodItem Name  "+fm1+"  inserted for  Restaurant  ID  "+rid1);
										System.out.println("------------------------");
									}
									else
									{
										System.out.println("FoodItem Can NOt be inserted");
										System.out.println("------------------------");
									}
								}
								else if(foodItemType == 3)
								{
									System.out.println("------------------------");
									System.out.println("Going Back.............");
									System.out.println("------------------------");
								}
								else
								{
									System.out.println("------------------------");
									System.out.println("Invalid Type.");
									System.out.println("------------------------");
								}
									
							}
							else
							{
								System.out.println("No Restaurant ID Found.");
								System.out.println("------------------------");
							}
							
							break;
							
							
					    case 2:
						
						    System.out.println("------------------------");
							System.out.println("You Have Chosen to Remove an Existing FoodItem");
							System.out.println("------------------------");
							
							System.out.print("Enter Restaurant ID : ");
							String rid4= sc.next();
							
							if(fc.searchRestaurant(rid4)!=null)
							{
								System.out.print("Enter FoodItem ID : ");
								String fid2=sc.next();
								if(fc.searchRestaurant(rid4).searchFoodItem(fid2)!=null)
								{
									System.out.print("Enter ID to Remove FoodItem");
									String fid3= sc.next();
									
									FoodItem f1 = fc.searchRestaurant(rid4).searchFoodItem(fid2);
									if(fc.searchRestaurant(rid4).removeFoodItem(f1))
									{
										System.out.println("FoodItem ID Removed With ID : "+f1.getFid());
										System.out.println("------------------------");
									}
									else 
									{
										System.out.println(" FoodItem Can not Removed.");
										System.out.println("------------------------");
									}
								}
								else
								{
									System.out.println("No FoodItem ID Found.");
									System.out.println("------------------------");
								}
							}
						    else
							{
								System.out.println("No Restaurant ID Found.");
							}	
					    
						    
					    case 3:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Show All FoodItem");
							System.out.println("------------------------");
							System.out.println("Enetr Restaurant ID : ");
							String rid6=sc.next();
							Restaurant r4 = fc.searchRestaurant(rid6);
							if(r4!=null)
							{
								r4.showAllFoodItems();
							}
							else
							{
								System.out.println("No FoodItem Available.");
								System.out.println("------------------------");
							}
							break; 
							
						case 4:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Search a FoodCourt");
							System.out.println("------------------------");
							
							System.out.print("Enter Restaurant ID : ");
							String rid5=sc.next();
							if(rid5!=null)
							{
							    System.out.print("Enter a FoodItem ID to Search : ");
							    String fid4 = sc.next();
							
							    FoodItem f2 = fc.searchRestaurant(rid5).searchFoodItem(fid4);
							
							 if(f2 != null)
							 { 
								System.out.println("FoodItemt Found.");
								System.out.println("FoodItem Name : "+f2.getName());
								System.out.println("FoodItem Available Quantity : "+f2.getAvailableQuantity());
								System.out.println("FoodItem Price : "+f2.getPrice());
							 }
							 else 
							 {
								System.out.println("FoodItem Does Not Exist");
								System.out.println("------------------------");
							 }
							 
							}
							
							break;
							
						case 5:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("------------------------");
							
							break;
							
					}

					break; 
					
				case 4:
					System.out.println("------------------------");
					System.out.println("You Have Chosen FoodItem Quantity Add-sell.");
					System.out.println("------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add FoodItem.");
					System.out.println("\t2. Sell FoodItem.");
					System.out.println("\t3. Show Add Sell History.");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter Your Option : ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("------------------------");
							System.out.println("You Choose to Add a FoodItem");
							System.out.println("------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							
							if(fc.searchRestaurant(rid1) != null)
							{ 
								System.out.print("Enter  FoodItem ID : ");
								String fid1 = sc.next();
								
								if(fc.searchRestaurant(rid1).searchFoodItem(fid1) != null)
								{
									System.out.print("Enter the Amount you want to Add : ");
									int am1 = sc.nextInt();
									
									if(fc.searchRestaurant(rid1).searchFoodItem(fid1).addQuantity(am1))
									{
										System.out.println("------------------------");
										System.out.println("Added Successfully.");
										frwd.writeInFile("Added :  "+am1+"  in FoodItem ID  "+fid1+"  in Restaurant ID  "+rid1);
										System.out.println("------------------------");
									}
									else
									{
										System.out.println("Can Not Add FoodItem");
										System.out.println("------------------------");
									}
								}
								else
								{
									System.out.println("No FoodItem ID Found.");
									System.out.println("------------------------");
								}
								
							}
							else
							{
								System.out.println("No Restaurant ID Found");
								System.out.println("------------------------");
							}
							
							break; 
							
						case 2:
						    System.out.println("------------------------");
							System.out.println("You Choose to Sell a FoodItem");
							System.out.println("------------------------");
							
							System.out.print("Enter Restaurant ID : ");
							String rid6 = sc.next();
							
							if(fc.searchRestaurant(rid6) != null)
							{
								System.out.print("Enter FoodItem ID : ");
								String fid1 = sc.next();
								
								if(fc.searchRestaurant(rid6).searchFoodItem(fid1) != null)
								{
									System.out.print("Enter the Amount you want to Sell : ");
									int am2 = sc.nextInt();
									
									if(fc.searchRestaurant(rid6).searchFoodItem(fid1).sellQuantity(am2))
									{
										System.out.println("------------------------");
										System.out.println("Sold Successfully.");
										System.out.println("------------------------");
										frwd.writeInFile("Sold :  "+am2+"  in FoodItem ID  "+fid1+"  by Restaurant ID  "+rid6);
									}
									else
									{
										System.out.println("Can Not Sell");
										System.out.println("------------------------");
									}
								}
								else
								{
									System.out.println("No FoodItem ID Found.");
									System.out.println("------------------------");
								}
								
							}
							else
							{
								System.out.println("No Restaurant ID Found.");
								System.out.println("------------------------");
							}
							
			
						
							break; 
							
						case 3:
							
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Show All Sell History.");
							System.out.println("------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						    
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("------------------------");
						
							break;
							
						default:
						    
							System.out.println("----------------------");
							System.out.println("Invalid Option");
							System.out.println("-----------------------");
							break;
					}
						
							break;
					
				
				case 5:
					System.out.println("------------------------");
					System.out.println("You Have Chosen to Exit");
					System.out.println("------------------------");
					repeat = false;
					break;
				
				    default:
					System.out.println("------------------------");
					System.out.println("Invalid Choice.");
					System.out.println("------------------------");
					break;
			
			 
					
				
				    
			}
		}
	}
} 
