public class StudentAdvance extends Advance
{
	  static int daysLeft;

  public StudentAdvance(int daysLeft)
  {
	  super(daysLeft);
	  this.daysLeft = daysLeft;
    
  }
  
  public int getPrice()
  {
    return super.getPrice()/2;
  }
  
  public String toString()
  {
    return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice() + " (STUDENT ID REQUIRED)";		
  }
}
