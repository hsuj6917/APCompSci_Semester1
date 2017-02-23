public abstract class Ticket
{
	static int serialNo;
	static int price;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() * 9999999) + 999999;
		price = 0;
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 9999999) + 999999;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + serialNo + "\nPrice: " + price;
	}
}