public class Honda implements Location
{
	private double x;
	private double y;
	
	public Honda(double[] Loc)
	{
		x=Loc[0];
		y=Loc[1];
	}
	
	public int getID()
	{
		return (int)(Math.Random()*999999)+1;
	}
	
	public void move(double three, double four)
	{
		x+=three;
		y+=four;
	}
	
	public double[] getLoc()
	{
		double[] Loc = new double[2];
		Loc[0]=x;
		Loc[1]=y;
		return Loc;
	}
}