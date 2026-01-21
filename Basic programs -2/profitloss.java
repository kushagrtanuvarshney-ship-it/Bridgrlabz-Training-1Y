import java.util.Scanner;
import java.util.Scanner;
class profitloss
{
	public static void main(String args[]){
		
		
	Scanner input=new Scanner(System.in);
	System.out.println("Enter cost price");
	int costprice=input.nextInt();
	System.out.println("Enter sell price");
	int sellprice=input.nextInt();
	int profit=sellprice-costprice;
	System.out.println("profit="+profit);
	double profitpercentage=(profit*100)/costprice;
	System.out.println("profitpercentage="+profitpercentage);
	}
	
	
	
	
	
	
}