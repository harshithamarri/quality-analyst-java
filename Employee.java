package constructor;

public class Employee {
	
	public int empId;
	public String empName;
	
	public Employee()//default constructor
	{
		System.out.println("I am in default constructor");
	}
	
	public Employee(int id, String name)
	{
		empId = id;
		empName = name;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Ramu=new Employee();
		Ramu.empId = 1000;
		Ramu.empName = "Ramu";
		System.out.println(Ramu.empId);
		System.out.println(Ramu.empName);
		
		Employee Raju=new Employee(2000,"Raju");
		System.out.println(Raju.empId);
		System.out.println(Raju.empName);
		
		
	}

}
