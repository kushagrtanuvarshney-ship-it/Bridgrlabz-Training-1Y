
class fees
{
	public static void main(String args[])
	{
		
		
		int fees=125000;
		System.out.println("fees="+fees);
		double discount=0.10;
		double discountamount=fees*discount;
		System.out.println("discountamount="+discountamount);
		double discountprice=discountamount-fees; 
	    System.out.println("discountprice"+discountprice);
	}
}