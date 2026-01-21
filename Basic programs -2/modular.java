import java.util.Scanner;
class modular{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the dividend:");
        int m=sc.nextInt();
		System.out.print("Enter the divisor:");
        int n=sc.nextInt();
        int quotient=m/n;
		int remainder=m%n;
        System.out.println("The quotient is:"+quotient);
		System.out.println("The remainder is:"+remainder);
		
    }
}