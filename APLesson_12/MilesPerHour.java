import java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double MPH;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		MPH = 0;
	}
	
	public MilesPerHour(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		MPH = 0;
	}
	
	public void setValues(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
      	MPH = 0;
    }
	
	public double getMPH()
	{
		MPH = Math.round(distance/(hours + (minutes / 60.0)));
      	return MPH;
	}
} 