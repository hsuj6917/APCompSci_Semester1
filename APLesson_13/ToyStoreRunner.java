public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore comfortobject = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println("List . . .\n" + comfortobject);
		System.out.println("Most Frequent Toy: " + comfortobject.getMostFrequentToy());
		System.out.println("Most Frequent Type: " + comfortobject.getMostFrequentType());
	}
}