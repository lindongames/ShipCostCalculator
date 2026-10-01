import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        //Asking the cost
        System.out.println( "Please enter the price of your item.");
        double itemPrice = inputScanner.nextDouble();

        //IF statement for cost
               if(itemPrice >= 100) { System.out.println("There is no shipping cost, your total cost is " + "$" + itemPrice);
                // Free Shipping

               }
               else {
                   // 2% shipping

                   double shippingCost = itemPrice * 0.02;
                  double totalPrice = shippingCost + itemPrice;

                  System.out.println("Your total shipping cost is " + shippingCost);
                  System.out.println("Your total is $" + totalPrice);
               }
    }
}
