
public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 100;
		int y = 200;
		int z = 300;
		
		if(x>y && x>z)
		{
			System.out.println(x+" is bigger");
		}
		else if(y>x && y>z)
		{
			System.out.println(y+" is bigger");
		}
		else
		{
			System.out.println(z+" is bigger");
		}

	}

}
