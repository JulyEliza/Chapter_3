public class EmplyeeTest//Begins public class EmployeeTest
{
	public static void main (String [] args)
	{
		Employee employee1 = new Employee ( " Bruce ", " Wayne ", 30000.00 );//Creates employee object for three instance variables
		Employee employee2 = new Employee ( " Clark ", " Kent ", 20000.00);//Creates employee object for three instance variables
		
		
		
		System.out.println( "Employee1:   " + employee1.getFirstName() + employee1.getLastName()  );//Displays employee1 name
		System.out.println( "Initial Salary: $ " + employee1.getMonthlySalary ()  );//Displays initial yearly salary
	
		System.out.println( "Employee2:  " + employee2.getFirstName () + employee2.getLastName()  );//Displays employee2 name
		System.out.println( "Initial Salary: $ " + employee2.getMonthlySalary ()  );//Displays initial yearly salary	
		
		System.out.println( "\n\t\t\t********Salary After 10% Raise********\n\t\t\t");//Banner to separate initial salary from 10% raised salary
		
		employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10);//Calculates salary after the %10 raise
		employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10);//Calculates salary after the %10 raise
		
		
		
		System.out.println( "Employee1:  " + employee1.getFirstName() +employee1.getLastName()  );//Displays employee1 name
		System.out.println( "Salary After 10% Raise:  " + employee1.getMonthlySalary()  );//Displays yearly salary after the 10% increase
		
		System.out.println( "Employee2:  " + employee2.getFirstName() +employee2.getLastName()  );//Displays employee2 name
		System.out.println( "Salary After 10% Raise:  " +  employee2.getMonthlySalary() );//Displays yearly salary after the 10% increase
	}
}//Ends public class EmployeeTest