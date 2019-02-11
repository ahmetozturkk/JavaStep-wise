package FinalandVisaNote;

import java.util.Scanner;

// vize1 ve vize2 nin etki deðeri %20 final in ise %60 olacak.
public class CalculateNote 
{
	public static void main(String[] args)
	{
		Scanner calculatenote = new Scanner(System.in);
		
		System.out.println("Input your three exams grade: ");
		
		System.out.println("Input your first visa note: ");
		
		double examResult1= calculatenote.nextDouble();
		
		System.out.println("Input your first visa note: ");
		
		double examResult2=calculatenote.nextDouble();		
		
		System.out.println("Input your Final  note: ");
		
		double finalNote= calculatenote.nextDouble();
		
		double result= ((examResult1 * 0.2) + (examResult2*0.2)) + (finalNote*0.6);
		System.out.println("The term's result is: "+ result);
		if(result<50)
		{
			System.out.println(" you are fail the class... ");
		}
		else if(result<57)
		{
			System.out.println("Your grade point is CC");
		}
		else if(result<65)
		{
			System.out.println("Your grade point is BB ");
		}
		else if(result<75)
		{
			System.out.println("Your grade point is BA ");
		}
		else if(result<85)
		{
			System.out.println("You are perfect man: Your grade point is AA ");
		}
	}
	

}
