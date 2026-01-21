import java.util.Scanner;
class fees
{
	public static void main(String args[])
	{
   		Scanner input=new Scanner(System.in);
		System.out.println("enter the fee");
		int fees=input.nextInt();
		System.out.println("enter the discount");
		double discount=input.nextDouble();
		int discountamount=fees/10;
		System.out.println("fees after discount="+discountamount);
		int finalfees=fees-discountamount;
		System.out.println("final fees to pay="+finalfees);
	}
}