
public class Employee extends Person {
	
	  private String Ext;
	    
	  private double Salary;

	  //constructor
	  public Employee(String first, String last, int age,  String ext, double salary) 
	  {
	    super(first, last,age);  
	    Ext = ext;
	    Salary=salary;
	  }


	  public void setExt(String ext) 
	  { 
		  Ext = ext; 
	  } 
	  public String getExt() 
	  { 
		  return Ext; 
	  }

	  public void setSalary(double salary) 
	  { 
		  Salary=salary; 
	  } 
	  public double getSalary() 
	  { 
		  return Salary; 
	  }

	  public String toString() 
	  {
	    	return super.toString()+" Telephone Ext= "+Ext +" Salary= "+Salary;
	  }

}
