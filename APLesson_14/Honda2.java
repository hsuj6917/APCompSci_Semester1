public class Honda2 extends Car2
{
	public Honda2(double[] locayshun)
	{
		super();
		double[] location = new double[2];
		ID = (int)(Math.random()*999999)+1;
		super.move(locayshun[0], locayshun[1]);
	}
}