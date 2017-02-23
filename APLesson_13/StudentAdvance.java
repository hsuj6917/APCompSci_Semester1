public class StudentAdvance extends Advance
{
  public StudentAdvance()
  {
    super();
  }
  
  public int getPrice()
  {
    if(daysLeft >= 10)
    {
      return 15;
    }
    
    else
    {
      return 20;
    }
  }
  
  public String toString()
  {
    return "Serial #: " + serialNo + "\nPrice: " + price + " (STUDENT ID REQUIRED)";
  }
}
