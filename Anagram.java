package Practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String a1="soap";
		String a2="xylo";
		
		if(a1.length()!=a2.length())
		{
			System.out.println("They are not Anagram");
		}
		else
		{
			char c1[]=a1.toCharArray();
			char c2[]=a2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean b1=Arrays.equals(c1, c2);
			   if(b1==true)
			   {
				   System.out.println("Given 2 strings are Anagram");
			   }
			   else
			   {
				   System.out.println("Given 2 strings are not Anagram");
			   }
			
			
			
		}

	}

}
