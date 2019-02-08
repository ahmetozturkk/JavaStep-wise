package replaceOfnumbers;

import java.util.Scanner;

public class ReplaceOfNumberss 
{
	public static void main(String[] args)
	{
		Scanner twoNumber= new Scanner(System.in);
		double number_one;
		double number_two;
		System.out.println("Input the first number");
		double numberOne= twoNumber.nextDouble();
		System.out.println("Input the second number");
		double numberTwo= twoNumber.nextDouble();
		double temporaryNumber= numberOne;
		number_one= numberTwo;
		number_two= temporaryNumber;
		System.out.println("New Value of numberone: " +number_one);
		System.out.println("New Value of numbertwo:"+number_two);
	}

}
