import java.util.Scanner;

class PriceCalculator {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter unit price of the item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity to be bought: ");
        int quantity = input.nextInt();

        
        double totalPurchasePrice = unitPrice * quantity;

      
        System.out.println("The total purchase price is INR" + totalPurchasePrice);
        System.out.println("if the quantity =" + quantity);
        System.out.println("and unit price is =INR" + unitPrice);
        
        
    }
}
