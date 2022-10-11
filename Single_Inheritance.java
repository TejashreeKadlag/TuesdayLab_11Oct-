//
package TuesdayLab_11Oct;

import java.util.Scanner;

public class Single_Inheritance extends Fibonacci_Series
{

	public static void main(String[] args) 
	{
		Single_Inheritance obj= new Single_Inheritance();
		obj.GrtNo();
		obj.fibo();
	}
  public void GrtNo()
   {
	  int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("The Greater Number is "+num1);
		}
		else
		{
			System.out.println("The Greater Number is "+num2);
	
		}
		sc.close();
   }
 }
  
