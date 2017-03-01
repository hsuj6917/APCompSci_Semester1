import java.util.*;

public class TicketDriver
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		Ticket a = new Walkup();
		System.out.println(a);
		System.out.println();
    
		Ticket b = new Advance(1);
		System.out.println(b);
		System.out.println();
    
		Ticket c = new StudentAdvance(1);
		System.out.println(c);
		System.out.println();
	}
}