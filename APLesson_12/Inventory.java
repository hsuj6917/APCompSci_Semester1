import java.lang.Math.*;
public class Inventory
{
	private String Manufacturer;
	private String Name;
	private String Category;
	private int UPC;
	private double Price;
	
	public Inventory(String m, String n)
	{
		Manufacturer = m;
		Name = n;
		UPC = (int)(Math.random() * 1000000000) + 1;
		Category = "N/A";
		Price = 0;
	}
	
	public Inventory(String m, String n, String c, double p)
	{
		Manufacturer = m;
		Name = n;
		UPC = (int)(Math.random() * 1000000000) + 1;
		Category = c;
		Price = p;
	}
	
	public String toString()
	{
		return "Item Info ... \nItem Manufacturer: " + Manufacturer +
							 "\nItem Name: " + Name +
							 "\nItem Category: " + Category  +
							 "\nItem Price: $" + Price +
							 "\nUPC#: " + UPC;
	}
}
