import java.util.Scanner;

public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = kb.next();
		int stop = word.length();
		tree(word,0,stop);
	}
	public static void tree(String Word, int Start, int Stop)
	{
		if(Start<=Stop){
			System.out.printf("%20s\n",Word.substring(0,Start));
			Start++;
			tree(Word,Start,Stop);
		}
	}
}