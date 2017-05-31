package arrays;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String student[]=new String[100];
		student[0] = "Raju";
		student[1] = "Rahul";
		student[2] = "Rakesh";
		student[3] = "Ria";
		student[4] = "Rizwan";
		student[5] = "Rizwan";
		
		
	
	
		
		System.out.println(student[0] );
		System.out.println(student[1] );
		System.out.println(student[2] );
		System.out.println(student[3] );
		System.out.println(student[4] );
		System.out.println(student.length);
		
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i] );
		}
		
		
	}

}
