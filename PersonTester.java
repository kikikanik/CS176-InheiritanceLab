
public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*one way
		Person[] ps=new Person[5];
		ps[0]=new Person("Nina", "Masters",25);
		ps[1]=new Student("John","Smith",18,"CS",4.0);
		ps[2]=new Employee("Kate","Brooklyn", 35, "1234",40000.0);
		ps[3]=new Faculty("Cay","Horstmann", 50, "9876",90000.0, "Associate Professor");
		ps[4]=new Staff ("Jay","Halper", 65, "0001",100000.0,"President");

		for(Person p: ps)
			System.out.println(p);
		Faculty temp=(Faculty)ps[3];
		temp.setSalary(10000);
		temp.setRank("Professor");
		System.out.println("New info for the faculty object: "+ps[3]);
		*/
		//the second way
		Person p=new Person("Nina", "Masters",25);
		Student stu=new Student("John","Smith",18,"CS",4.0);
		Employee e=new Employee("Kate","Brooklyn", 35, "1234",40000.0);
		Faculty f=new Faculty("Cay","Horstmann", 50, "9876",90000.0, "Associate Professor");
		Staff sta=new Staff ("Jay","Halper", 65, "0001",100000.0,"President");


		System.out.println(p);
		System.out.println(stu);
		System.out.println(e);
		System.out.println(f);
		System.out.println(sta);
	
		f.setSalary(10000);
		f.setRank("Professor");
		System.out.println("New info for the faculty object: "+f);
		}

}
