public class Advance extends Ticket
{
  public static int daysLeft = TicketDriver.keyboard.nextInt();
    
  public Advance()
  {
    super();
  }
  
  public int getPrice()
  {
    if(daysLeft >= 10)
    {
      return 30;
    }
    
    else
    {
      return 40;
    }
  }
}

