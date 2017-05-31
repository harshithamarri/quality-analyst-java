package inheritance;

public class Child extends Parent{
	public int c;
	public int d;
	
	public void method3()
	{
		System.out.println("Child:: I am in medhot3");
	}
	
	public void method4()
	{
		System.out.println("Child:: I am in medhot4");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj=new Child();
		obj.c = 100;
		obj.d = 300;
		obj.method3();
		obj.method4();
		
		obj.a = 100;
		obj.b = 200;
		obj.method1();
		obj.method2();
		
		
	}

}
