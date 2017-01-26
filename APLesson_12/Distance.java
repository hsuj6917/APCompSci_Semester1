import java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int xYi, int yYi, int xEr, int yEr)
	{
		xOne = xYi;
		yOne = yYi;
		xTwo = xEr;
		yTwo = yEr;
		distance = 0;
	}
	
	public void setValues(int xYi, int yYi, int xEr, int yEr)
	{
		xOne = xYi;
		yOne = yYi;
		xTwo = xEr;
		yTwo = yEr;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo - xOne)* (xTwo - xOne)+ (yTwo - yOne)* (yTwo - yOne));
      	return distance;
	}
}