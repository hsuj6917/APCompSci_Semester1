public class Advance extends Ticket
{
  static int daysLeft;
    
  public Advance(int daysLeft)
  {
    this.daysLeft = daysLeft;
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

