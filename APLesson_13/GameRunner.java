public class GameRunner
{
	public static void main(String[]args)
	{
		Console a = new XBox("XBox One");
		System.out.println(a);
		System.out.println();
		
		Console b = new PlayStation("PlayStation 4");
		System.out.println(b);
		System.out.println();
		
		GameSystem c = new PC("Alienware");
		System.out.println(c);
	}
}