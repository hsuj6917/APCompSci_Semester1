
import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Paint: ");
		String paint = kb.nextLine();
      
		System.out.println("Interior: ");
		String interior = kb.nextLine();
      
		System.out.println("Engine: ");
		String engine = kb.nextLine();
      
		System.out.println("Tires: ");
		String tires = kb.nextLine();
		
		Car mycar = new Car(paint, interior, engine, tires);
      
		System.out.println("Your vehicle is ready.....");
		System.out.println("Paint:\t" + mycar.getPaint());
		System.out.println("Interior:\t" + mycar.getInterior());
		System.out.println("Engine:\t" + mycar.getEngine());
		System.out.println("Tires:\t" + mycar.getTires());
		
		mycar.setCustom("red w/gold fleck", "Corinthian leather (Brown)", "5 litre v8 507hp", "20\" Priellis");
      
		System.out.println("Your vehicle is ready.....");
		System.out.println("Paint:\t" + mycar.getPaint());
		System.out.println("Interior:\t" + mycar.getInterior());
		System.out.println("Engine:\t" + mycar.getEngine());
		System.out.println("Tires:\t" + mycar.getTires());
	}
}
