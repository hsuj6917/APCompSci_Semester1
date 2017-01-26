import java.util.Scanner;
public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Item Manufacturer: ");
		String m = kb.next();
      
		System.out.println("Item name: ");
		String n = kb.next();
      
		System.out.println("Will you be entering category and price information? (y or n)");
		String info = kb.next();
		
		if(info.equals("y"))
		{
			System.out.println("Item category: ");
			String c = kb.next();
          
			System.out.println("Item price: ");
			double p = kb.nextDouble();
          
			Inventory item1 = new Inventory(m, n, c, p);
			System.out.println(item1);
		}
      
		else
		{
			Inventory item1 = new Inventory(m, n);
			System.out.println(item1);
		}
	}
}