public abstract class Ticket
{
	static int serialNo;
	static int price;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() * 9999999) + 999999;
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 9999999) + 999999;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}