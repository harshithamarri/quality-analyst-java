package methodoverloading;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operations obj=new Operations();
		obj.add(100, 200);
		obj.add(100,300,400);
		obj.add(100, 200.123);
		obj.add(100.123, 200);
	}
	
	//compile time polymorphism or static polymorphism
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}

	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	public void add(double a, int b)
	{
		System.out.println(a+b);
	}

}
