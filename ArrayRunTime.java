package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRunTime
{

	public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		String[]student=new String[4];
		for(int i=0;i<4;i++)
		{
			System.out.println("enter values----->"+i);
	        student[i]=a1.next();
	        
		}
		System.out.println(Arrays.toString(student));
		a1.close();

		
	


	}

}
