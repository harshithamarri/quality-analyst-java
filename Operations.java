package exceptionhandling;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 100;
		int y = 10;
		
		try{
		int z = x/y;
		
		System.out.println(z);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		 System.out.println(e.getMessage());
		
		}
		
		finally
		{
			System.out.println("ALways executes");
		}
		
		
		System.out.println("Exception occured");
	
		
		
		

	}

}
