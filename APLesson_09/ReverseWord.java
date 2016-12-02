import java.util.Scanner;

public class ReverseWord
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.print("In order. . . ");
		
		for(String word :words)
		{
			System.out.print(word + " ");
		}
		
		System.out.print("\nIn reverse order. . . ");
		reverse(words);
	}
	public static void reverse(String [] words)
	{
		for(int i = words.length-1; i >= 0; i--){
			System.out.print(words[i] + " ");
		}
	}
		
}

