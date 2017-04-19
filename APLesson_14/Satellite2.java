import java.util.ArrayList;
public class Satellite2
{
   public static void main(String[]args)
   {
	   
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));


       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";
   	 	 	
     	for(Location l : locate)
     	{
			double x = (Math.random()*100)+1;
			double y = (Math.random()*100)+1;
          
			System.out.println("After " + l.getID() + " Moved (" +getLocation(l.getLoc())+")");
          
			l.move(x,y);
          
			System.out.println("\nNew Location: (" + getLocation(l.getLoc()) + ")\n\n");
		}


       for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           System.out.println("\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")");
       }
   }


   public static double getDistance(double[] Car2, double[] home)
   {
       return Math.sqrt((Math.pow(Car2[0] - home[0], 2)+ Math.pow(Car2[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}