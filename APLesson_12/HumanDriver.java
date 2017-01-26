
import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Hair color: ");
		String hair = kb.nextLine();
      
		System.out.println("Eye color: ");
		String eyes = kb.nextLine();
      
		System.out.println("Skin color: ");
		String skin = kb.nextLine();
      
		System.out.println("Friend's hair color: ");
		String fhair = kb.nextLine();
      
		System.out.println("Friend's eye color: ");
		String feyes = kb.nextLine();
      
		System.out.println("Friend's skin color: ");
		String fskin = kb.nextLine();
		
		Human features = new Human(hair, eyes, skin);
		
		System.out.println("");
		System.out.println("My info... \nHair: " + features.getHair() + "\nEyes: " + features.getEyes() + "\nSkin: " + features.getSkin());
      
		System.out.println();
      
		features.setHES(fhair,feyes,fskin);
		System.out.println("Friend's info... \nHair: " + features.getHair() + "\nEyes: " + features.getEyes() + "\nSkin: " + features.getSkin());
	}
}