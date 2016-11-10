import java.util.Scanner;

public class ReverseNumber
{
	static int num, number, rev;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		number = kb.nextInt();
		num = number;
		rev = 0;
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse()
	{
		while(num>0)
		{
			rev = 10 * rev;
			rev = (num%10) + rev;
			num = num / 10;
		}
	}
}