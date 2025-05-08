package Practice;
//input= output(one array into another) Assign 78.
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputoutput 
{
public static void main(String[] args)
{
	Scanner a1=new Scanner(System.in);
	System.out.println("size of Input----> "+a1);
	String[]input=new String[a1.nextInt()];
	for(int i=0;i<input.length;i++)
	{
	
		System.out.println("Name of Person----> "+i);
	input[i]=a1.next();
	}
	
	String[]output=new String[input.length];
	for(int i=0;i<input.length;i++)
	{
	output[i]=input[i];
	}
	
	System.out.println("Input Array is ---> "+Arrays.toString(input));
	System.out.println("Output Array is ---> "+Arrays.toString(output));

	a1.close();
	
}
}
