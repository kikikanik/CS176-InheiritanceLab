
public class Faculty extends Employee {
	
	private String Rank;
	
	public Faculty (String first, String last, int age, String ext, double salary, String rank)
	{
		super(first, last, age,ext,salary);
		Rank=rank;
	}
	
	public void setRank(String rank) 
	{
		Rank=rank;
	}
	public String getRank() 
	{
		return Rank;
	}
	
	public String toString() 
	{
		return super.toString()+" Rank= "+Rank;
	}

}
