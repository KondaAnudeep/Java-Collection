package Practice;

public class Palindrom_HW {

	public static void main(String[] args) 
	{
		String a="LIRIL";
		String output="";
		for(int c1=a.length()-1;c1>=0;c1--)
		{
		char a1=a.charAt(c1);
		output=output+a1;
		
			
		
		}
		
		System.out.println("Reversed-------->"+output);	
		if(a.equals(output)==true)
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is not Palindrom");
		}


	}

}
