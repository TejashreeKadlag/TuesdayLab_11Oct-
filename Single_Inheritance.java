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
  package TuesdayLab_11Oct;

public class Fibonacci_Series
{
public void fibo()
{
int num1=0,num2=1,num3,count=10;    
System.out.print(num1+" "+num2);   
for(int i=2;i<=count;i++)
{    
 num3=num1+num2;    
 System.out.print(" "+num3);    
 num1=num2;    
 num2=num3;    
}    
 
}
}
