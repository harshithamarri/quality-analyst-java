
public class Employee {
    public int empId;
    public String empName;
    public  static String companyName;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.companyName = "Infosys";
		
		Employee Ramu = new Employee();
		Ramu.empId = 1000;
		Ramu.empName = "Ramu";
		//Ramu.companyName = "Infosys";
		
		System.out.println(Ramu.empId );
		System.out.println(Ramu.empName );
		System.out.println(Employee.companyName);
		
		
		Employee Raju = new Employee();
		Raju.empId = 2000;
		Raju.empName = "Raju";
		//Raju.companyName = "Infosys";
		
		System.out.println(Raju.empId );
		System.out.println(Raju.empName );
		System.out.println(Employee.companyName);
		
		Employee Rakesh = new Employee();
		
		System.out.println(Rakesh.empId );
		System.out.println(Rakesh.empName );
		System.out.println(Employee.companyName);
		
	}

}
