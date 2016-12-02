import java.util.Scanner;

public class Receipt
{
	static double discount = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first item");
		String i1 = kb.next();
		System.out.println("Enter the price");
		double p1 = kb.nextDouble();
		
		System.out.println("Enter the second item");
		String i2 = kb.next();
		System.out.println("Enter the price");
		double p2 = kb.nextDouble();
		
		System.out.println("Enter the third item");
		String i3 = kb.next();
		System.out.println("Enter the price");
		double p3 = kb.nextDouble();
		
		System.out.println("Enter the fourth item");
		String i4 = kb.next();
		System.out.println("Enter the price");
		double p4 = kb.nextDouble();
		
		double subtotal = p1 + p2 + p3 + p4;
		Discount(subtotal);
		double tax = .08 * subtotal;
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<RECEIPT>>>>>>>>>>");
		format(i1,p1);
		format(i2,p2);
		format(i3,p3);
		format(i4,p4);
		System.out.println("\n---------------------------------");
		format("Subtotal",subtotal);
		format("Discount",discount);
		format("Tax",tax);
		format("Total",total);
		System.out.println("\n_________________________________");
		System.out.println("     Thank you for shopping");
	}
	
	public static void Discount(double sub)
	{
		if(sub >= 2000)
		{
			discount = .15 * sub;
		}
		
		if(sub < 2000)
		{
			discount = 0;
		}
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n%10s. . . . . . . $%5.2f",item,price);
	}
}