import java.util.*;

public class Toyota implements Location
{
	private double x;
	private double y;
	
	public Toyota(String lctn)
	{
		x = Double.parseDouble(lctn.split(", ")[0]);
		y = Double.parseDouble(lctn.split)(", ")[1]);
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