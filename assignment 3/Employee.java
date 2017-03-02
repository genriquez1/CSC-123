//Gerardo Enriquez
//CSC 123
//Assignment 3


public class Employee
 
{

	private String name;
	private String idNum;
	private int age;
	private double salary;
	private String title;
	private String DepName;
	
	public Employee()
	{
		idNum = " ";
		age =0;
		salary = 0;
		title = " ";
		DepName ="unassignedDepartment";
		name = " ";
	
	}
	
	public Employee(String NidNum, String Nname, int Nage, double Nsalary, String Ntitle, String NdepName)
	
	{
		idNum = NidNum;
		age = Nage;
		salary = Nsalary;
		title = Ntitle;
		DepName = NdepName;
		name = Nname;
		
	}
	
	public String getID()
	{
		return idNum;
	}
	public String getTitle()
	{
		return title;
	}
	public String getDepName()
	{
		return DepName;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void print()
	{
		System.out.println("  Employees Name: "+ name+",  ");
		System.out.println("  Their Title: "+ title+",  ");
		System.out.println("  ID No.: "+ idNum+",  ");
		System.out.println("  Age: "+ age+",  ");
		System.out.println("  Their Salary Is: "+ salary+",  ");
		System.out.println("  Department: "+ DepName+",  ");
	
	}
	
	public void changeSalary(int increase)
	{
		salary += increase;
		
	}
	
	public void changeSalary(double increase)
	{
		salary *=(1 +increase);
	}
	
	public void changesalary(double increase)
	{ 
	double Nincrease=increase;
		if(Nincrease>=0 && Nincrease<=1)
		{
			salary=salary*(1+Nincrease);
			
		}
		else System.out.println("Percentage of increase cannot exceed one!");
	}
	
	public double getSalary()
	{
		
		return salary;
	}
	
}