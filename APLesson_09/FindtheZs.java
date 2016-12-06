import java.util.Scanner;

public class FindtheZs
{
	static Scanner kb = new Scanner(System.in);
	static String [] words;
	public static void main(String[]args)
	{
		words = new String[5];
		System.out.println("Enter 5 words");
		fillArray();
		printArray();
		System.out.println("\n");
		System.out.println("Only " + hasZs() + "contain(s) the letter z");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < words.length; i++)
			words[i] = kb.next();
	}
	
	public static void printArray()
	{
		System.out.print("For the words ");
		for(String word : words)
			System.out.print(word + " ");
	}
	
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") > 0)
			{
				zs = zs + (word + " ");
			}
		}
		return zs;
	}
}