import java.util.*;

public class ToyStore
{
	ArrayList<Toy> toyList = new ArrayList<>();
	
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	
	public ToyStore(String list)
	{
		loadToys(list);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy comfortobject = getThatToy(name);
			
			if(comfortobject == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			
			else
			{
				comfortobject.setCount(comfortobject.getCount() + 1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy comfortobject : toyList)
		{
			if(comfortobject.getName().equals(nm))
			{
				return comfortobject;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy comfortobject : toyList)
		{
			if(max < comfortobject.getCount())
			{
				max = comfortobject.getCount();
				name = comfortobject.getName();
			}
			
			
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy comfortobject : toyList)
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
		return "" + toyList;
	}
}