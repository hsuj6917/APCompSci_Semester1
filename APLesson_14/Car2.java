public abstract class Car2 implements Location
{
	public int ID ;
	double[] Loc;

	public Car2()
	{
      	ID = (int)(Math.random() * 999999) + 1;
		Loc = new double[2];
	}
	
	public int getID()
	{
		return ID;
	}	
	
	public void move(double x, double y)
	{
		Loc[0] = x;
		Loc[1] = y;
	}
	
	public double[] getLoc()
	{
		return Loc;
	}
	
}