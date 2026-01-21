import java.util.Scanner;
class Height {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

   
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

       
        double totalInches = heightInCm / 2.54;

       
        double feet = (totalInches / 12);
        

      
        System.out.println("Your Height in cm is " + heightInCm);
        System.out.println(" while in feet is " + feet );
        System.out.println("and inches is " +totalInches);
        
        
    }
}
