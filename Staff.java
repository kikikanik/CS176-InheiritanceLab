
public class Staff extends Employee {

	private String Title;
	
	public Staff(String first, String last, int age,  String ext, double salary,String title)
	{
		super(first, last, age, ext, salary);
		Title=title;
	}

	public void setTitle(String title)
	{
		Title=title;
	}
	
	public String getTitle() 
	{
		return Title;
	}
	
	public String toString() 
	{
		return super.toString()+" Title= "+Title;
	}

}
