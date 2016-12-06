public class GetOdds
{
	static int [] Array;
	public static void main(String[]args)
	{
		Array = new int[10];
		fillArray();
		printArray();
		System.out.println("\n");
		System.out.println("The " + getOdds() + " are odd numbers");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < Array.length; i++)
		{
			Array[i] = (int)(Math.random() *100) +1;
		}
	}
	
	public static void printArray()
	{
		System.out.print("For the following numbers... ");
		for(int number : Array)
			System.out.print(number + " ");
	}
	
	public static String getOdds()
	{
		String odds = "";
		for(int number : Array)
		{
			if(number%2 == 1)
				odds = odds + (number + " ");
		}
		return odds;
	}
}