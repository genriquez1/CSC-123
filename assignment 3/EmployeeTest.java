
public class EmployeeTest {

	public static void main(String[] args)
	 {
	 Employee[] employees = new Employee[100];
	 	
	 employees[0] = new Employee("65","Rick Honeycut",55, 400000.00, "Third Base Coach", "Coaching Staff");
	 employees[1] = new Employee("42","Jackie Robinson",60, 380000.00, "Player", "Baseball Player");
	 employees[2] = new Employee("300","Clayton Kershaw",31, 460000.00, "Player", "Baseball Player");
	 employees[3] = new Employee("400","Yasiel Puig",26, 140000.00, "Player", "Baseball Player");
	 employees[4] = new Executive("10","Jaime Jarrin",55, 250000.00, "Chairman", "Managment",0.15);
	 employees[5] = new Manager("1","Vin Scully",85, 1500000.00, "Manager", "Management");
	
	 
	 ((Manager)(employees[5])).addEmployee(employees[0]);
	 ((Manager)(employees[5])).addEmployee(employees[1]);
	 ((Manager)(employees[5])).addEmployee(employees[2]);
	 
	 
	 //print employee list
	 ((Manager)(employees[5])).printEmployeeList();
	 
	 
	 //change salary
	 
	 employees[2].changeSalary(450000);
	 
	 //print full list of employees
	 System.out.println("\n--- All Employees ---\n");
	
	int i=0;
	
	while (employees[i] !=null)
		employees[i++].print();
		
	 }
	 
	 
	 
	 }
