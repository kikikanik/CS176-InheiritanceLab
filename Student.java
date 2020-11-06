
public class Student extends Person {
	private String Major;
	private double GPA;
	
	Student(String first, String last, int age, String major, double gPA)
	{
		super(first, last, age);
		Major=major;
		GPA=gPA;
	}
	
	public String getMajor() 
	{
		return Major;
	}
	public void setMajor(String major) 
	{
		Major=major;
	}
	
	public double getGPA() 
	{
		return GPA;
	}
	public void setGPA(double gPA) 
	{
		GPA=gPA;
	}
	
	public String toString() 
	{
		return super.toString()+" Major= "+Major+" GPA="+GPA;
	}
	

}
