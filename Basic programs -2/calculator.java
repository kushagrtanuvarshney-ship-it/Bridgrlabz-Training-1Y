import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("num1=");
		double num1=input.nextDouble();
		System.out.println("num2=");
		double num2=input.nextDouble();	
		double Addition=num1+num2;
		double Subtraction=num1-num2;
		double Multiplication=num1*num2;
		double Division=num1/num2;
		System.out.println("The Addition,Subtraction,Multiplication,Division of two number is="+Addition  +Subtraction  +Multiplication  +Division);
		
		
	}
	
	
	
	
	
}