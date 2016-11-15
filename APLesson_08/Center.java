import java.util.Scanner;

public class Center
{
	static String word1, word2, word3;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word");
		word1 = kb.next();
		System.out.println("Enter a second word");
		word2 = kb.next();
		System.out.println("Enter a third word");
		word3 = kb.next();
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	public static String makeCenter(String word)
	{
		if(word.length()>=20)
			return word;
		else
			return makeCenter(" " + word + " ");
	}
}
