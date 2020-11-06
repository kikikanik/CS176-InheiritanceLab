
public class Person {

	private String First;  
	private String Last;
	private int Age;
	 
	public Person(String first, String last, int age) 
	{
	    First = first;  
	    Last = last; 
	    Age = age;
	}
	public void setFirstName(String first) 
	{ 
		First = first;
	}  
	public String getFirstName() 
	{ 
		return First; 
	}
	public void setLastName(String last) 
	{ 
		Last = last; 
	}  
	public String getLastName() 
	{ 
		return Last; 
	}
	public void setAge(int age) 
	{
		Age=age;
	}
	public int getAge() 
	{
		return Age;
	}

	public String toString() {
		return "First= "+First+" Last= "+Last+" Age= "+Age;
	}
}
