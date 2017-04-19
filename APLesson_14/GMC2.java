public class GMC2 extends Car2
{
	public GMC2(double ecks, double why)
	{
		super();
		ID = (int)(Math.random()*999999)+1;
		super.move(ecks, why);
	}	
}