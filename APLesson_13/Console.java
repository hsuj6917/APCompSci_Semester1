public abstract class Console extends GameSystem
{
	static String controller;
	
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + this.getController();
	}
}