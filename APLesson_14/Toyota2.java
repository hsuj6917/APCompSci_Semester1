public class Toyota2 extends Car2
{
	public Toyota2(String lctn)
	{
		super();
		ID = (int)(Math.random()*999999)+1;
	
		Double x = Double.parseDouble(lctn.split(", ")[0]);
		Double y = Double.parseDouble(lctn.split)(", ")[1]);

		super.move(x, y);
	}	
}