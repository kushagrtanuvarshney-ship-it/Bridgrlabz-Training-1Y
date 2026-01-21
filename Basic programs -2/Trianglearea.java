import java.util.Scanner; 

public class Trianglearea {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); 

        
        System.out.println("Enter the base of the triangle (in inches): ");
        double baseInches = input.nextDouble();

        System.out.println("Enter the height of the triangle (in inches): ");
        double heightInches = input.nextDouble();

        double areaSquareInches = 0.5 * baseInches * heightInches;

        
        double areaSquareCm = areaSquareInches * 2.54 * 2.54;

        
       
        System.out.println("Area of the triangle="  +areaSquareInches);
        System.out.println("Area of the triangle=" +areaSquareCm);

     
    }
}
