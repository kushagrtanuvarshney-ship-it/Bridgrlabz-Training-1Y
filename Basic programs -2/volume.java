import java.util.Scanner;
class volume
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter radius");
		int radius=input.nextInt();
		double p=3.14;
	    double volume=(4*p*radius*radius*radius)/3;
		System.out.println("Volume of earth in cubic kilometer=" +volume);
        double miles=volume*0.621371;
		System.out.println("volume of earth in cubic miles=" +miles); 
        	
		
		
	}
	
	
	
	
}