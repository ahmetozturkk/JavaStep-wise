package miniCalculator;
import java.util.Scanner;

public class miniCalculator {
	public static void main(String[] args)
	{
		Scanner calculatorInfo= new Scanner(System.in);
		System.out.print("Input number1: ");
		double number1= calculatorInfo.nextDouble();
		System.out.print("Input number2: ");
		double number2=calculatorInfo.nextDouble();
		
		System.out.println("press a alphabet ONE of these A,S,M,D");
		char operator = calculatorInfo.next().charAt(0);
		switch (operator)
		{
		case 'A' :
		double addition=	number1 + number2;	
		System.out.println("The addition of two number: "+addition);
			break;
		case 'S':
			double subtraction= number1-number2;
			System.out.println("The addition of two number: "+subtraction);
			break;
		case 'M':
			double multiplication= number1*number2;
			System.out.println("The addition of two number: "+multiplication);
			break;
		case 'D':
			double division= number1/number2;
			System.out.println("The addition of two number: "+division);
			break;
		default:
			System.out.println("no value");
			break;
		}
	}

}
