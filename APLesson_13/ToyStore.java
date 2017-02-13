import java.util.*;

public class ToyStore
{
	ArrayList<toy> toylist = new ArrayLisxt<>();
	
	public ToyStore()
	{
		toylist = new ArrayLisxt<>();
	}
	
	public ToyStore(String list)
	{
		loadToys(list);
	}
	
	public void loadToys(String ts)
	{
		toylist = new ArrayLisxt<>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i++)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			toy comfortobject = getThatToy(name);
			
			if(comfortobject == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				
				if(type.equals("Action Figure"))
				{
					tyoList.add(new AFigure(name));
				}
			}
			
			else
			{
				count = 1;
			}
		}
	}
	
	public String getThatToy(String nm)
	{
		for(toy comfortobject : toyList)
		{
			if(comfortobject.getName().equals(nm))
			{
				return comfortobject;
			}
			
			else
			{
				return null;
			}
		}
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy comfortobject : toyList)
		{
			if(max < comfortobject.getCount())
			{
				max = comfortobject.getCount();
				name = comfortobject.getName();
			}
			
			return name;
		}
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(toy comfortobject : toyList)
		{
			if(comfortobject.getType().equals("Car"))
			{
				cars++;
			}
			
			if(comfortobject.getType().equals("Action Figure"))
			{
				figures++;
			}
		}
		
		if(cars > figures)
		{
			return "Cars";
		}
		
		if(figures > cars)
		{
			return "Action Figures";
		}
		
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		return toyList;
	}
}