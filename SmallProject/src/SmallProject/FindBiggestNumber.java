package SmallProject;
import java.util.Scanner;

public class FindBiggestNumber 
{
	public static void main(String[] args)
	{
		Scanner numberInfo = new Scanner(System.in);
		System.out.println("Input three number");
		int number1=numberInfo.nextInt();
		int number2=numberInfo.nextInt();
		int number3=numberInfo.nextInt();
		if(number1>number2)
		{
			System.out.println("First number bigger than others");
		}
		else if(number2 > number3)
		{
			System.out.println("second number bigger than others");
		}
		else
		{
			System.out.println("The last numbers bigger than all");
		}
	}

}
