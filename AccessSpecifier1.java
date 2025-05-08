package Practice;

public class AccessSpecifier1 
{
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	protected  AccessSpecifier1 (int a,int b)
	{
		System.out.println(a-b);
	}
	static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	private AccessSpecifier1 ()
	{
		System.out.println("MBNR");
	}

	

	public static void main(String[] args) 
	{
		add(100,587);
		new AccessSpecifier1(20,10);
		
		
		mul(16,9);
	new AccessSpecifier1();
		
		

	}
	
		
	}


