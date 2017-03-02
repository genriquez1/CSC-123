//Gerardo Enriquez
//CSC 123
//Assignment 3

public class Manager extends Employee

{

	public Manager()
	{
		super();
	}

	public Manager(String Nname, String NidNum, int Nage, double Nsalary, String Ntitle, String NdepName)
	{
	
		super(Nname, NidNum, Nage, Nsalary, Ntitle, NdepName);
	
	}

	public void addEmployee(Employee supervise)
	{
	
		myEmployees[i] = supervise;
		i++;
	
	}

	public void printEmployeeList()
	{
		
		System.out.println("Employees reporting to " +super.getName());
			for(int x=0; x<i; x++)
				myEmployees[x].print();
		
	}

	private int i=0;
	private Employee[] myEmployees = new Employee[100];

}