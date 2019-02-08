package tringularHipotenus;
import java.util.Scanner;

public class triangle {
	public static void main(String[] args)
	{
		Scanner triangle = new Scanner(System.in);
		System.out.print("Input First Number: ");
		double Side1= triangle.nextDouble();
		System.out.print("Input Second Number: ");
		double Side2= triangle.nextDouble();
		double hipotenus= Math.sqrt((Side1* Side1) + (Side2*Side2)) ;
		System.out.println("Third side dimension is: "+ hipotenus);
		
		

		
	}

}
