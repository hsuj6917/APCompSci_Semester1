import java.util.Scanner;

public class Underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = kb.nextLine();
		System.out.println(replace(sentence));
	}
	public static String replace(String sent)
	{
		if(sent.indexOf(" ")<0)
			return sent;
		else
			sent = sent.substring(0, sent.indexOf(" ")) + "_" + sent.substring(sent.indexOf(" ")+1);
			return replace(sent);
	}
}