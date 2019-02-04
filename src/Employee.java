public class Employee 
{
  private String FirstName;
  private String LastName;
  private double MonthlySalary;
  
  public Employee (String FirstName, String LastName, double MonthlySalary)
  {
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.MonthlySalary = MonthlySalary;
  }
  
  public void setFirstName (String firstName, String FirstName)
  {
    this.FirstName = FirstName;
  }
  
  public String getFirstName ()
  {
    return FirstName;
  }
  
  public void setLastName (String last, String LastName)
  {
    this.LastName = LastName;
  }
  
  public String getLastName ()
  {
    return LastName;
  }
  
  public void setMonthlySalary (double MonthlySalary)
  {
	if ( MonthlySalary < 0 )
	   this.MonthlySalary = 0;
	else 
	   this.MonthlySalary = MonthlySalary;
  }
  
  public double getMonthlySalary ()
  {
    return MonthlySalary;
  }
}
