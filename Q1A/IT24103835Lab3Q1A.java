import java.util.Scanner;
   
public class IT24103835Lab3Q1A
     {
	public static void main(String[] args) 
         {
	double pricePerkg,quantity,totalAmount;

	Scanner scanner= new Scanner(System.in);

	System.out.print("Enter the price of 1kg of rice:");
	pricePerkg=scanner.nextDouble();

	System.out.print("Enter the number of killograms you want to buy:");
	quantity=scanner.nextDouble();

	totalAmount= pricePerkg*quantity;
	System.out.printf("The total amount is:"+totalAmount);

	scanner.close();

     }
 }