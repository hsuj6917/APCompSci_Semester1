import java.util.Scanner;

public class Graph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = kb.nextInt();
		System.out.println("Please enter a table size");
		int size = kb.nextInt();
		
		for(int i = 1; i <= size; i++)
		{
			System.out.println(i + " | " + ((num*i)+1));
		}
		
	}
}