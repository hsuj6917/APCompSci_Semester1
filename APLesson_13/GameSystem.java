public class GameSystem
{
	static String platform;
	static int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 9999999) + 999999;
	}
	
	public String getPlatform()
	{
		return this.platform;
	}
	
	public int getSerialNo()
	{
		return this.serialNo;
	}
}