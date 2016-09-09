import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = keyboard.next();
		System.out.println("On a scale from 1 to ugly, " + name + " is a disgusting name. How old are you? ");
		int age = keyboard.nextInt();
		System.out.println(age + "? That's almost as gross as your name. What do you do for fun? Don't type any spaces. Please. ");
		String hobby = keyboard.next();
		System.out.println(hobby + " is for nerds. Suits you. What kind of music do you like? ");
		String music = keyboard.next();
		System.out.println("Doesn't Kim Jong Un use " + music + " music to torture people? Anyway, How many siblings do you have? ");
		int sibs = keyboard.nextInt();
		System.out.println("Wow you have " + sibs + " siblings! I don't care. What do you want to be when you grow up? ");
		String career = keyboard.next();
		System.out.println(career + "? Sorry, I think you spelled \"LOSER\" wrong. So, " + name + ", you're a " + age + " year old loser who enjoys " + hobby + " and " + music + " music and wants to be a " + career + ". I can't feel emotions, but I still hate you. ");
	}
}