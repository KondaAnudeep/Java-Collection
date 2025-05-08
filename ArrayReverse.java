package Practice;
// one array into another in reverse
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse 
{

	public static void main(String[] args) 
	{
		Scanner z1=new Scanner(System.in);
		System.out.println("size of Persons -->"+z1);
		int[]input=new int[z1.nextInt()];
		for(int i=0;i<input.length;i++)
		{
			System.out.println("Roll No.--->"+i);
			input[i]=z1.nextInt();
		}
		int[]output=new int[input.length];
		for(int i=input.length-1,j=0;i>=0;i--,j++)
		{
			output[j]=input[i];
		}
		System.out.println("Input Array is ---> "+Arrays.toString(input));
		System.out.println("Output Array is ---> "+Arrays.toString(output));
		
		z1.close();

		

	}

}
