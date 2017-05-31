
public class MethodsWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsWithReturnType obj=new MethodsWithReturnType();
		 obj.add(100, 200);
		 int x =obj.add1(200, 400);
		 System.out.println(x);
		 
		int max1 =  obj.max(100, 200, 300);
		int max2 =obj.max(200, 300, 500);
		
		System.out.println(max1+max2);
		
		obj.concatinate("Hai", "Hello");

	}
	public void add(int a, int b)
	{
	int c = a+b;
	System.out.println(c);
	}
	
	
	
	public int add1(int a, int b)
	{
	int c = a+b;
	System.out.println(c);
	return c;
	}
	
	
	public int max(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		
		else if(b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
	
	public String concatinate(String a, String b)
	{
		return a+b;
	}
}
