package exceptionhandling;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.out.println("Hi");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");

	}

}
