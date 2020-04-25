
public class Cerc extends FormaGeometrica 
{
	private Segment raza;
	private Punct centru;
	
	public Cerc(Segment r, Punct c)
	{
		raza = r;
		centru = c;
	}

	public void afisareForma() 
	{
		int radius = (int)Math.round(raza.getDistanta());
		int posX = centru.getX();
		int posY = centru.getY();
		
		for (int i = 0;i <= posX + radius; i++) 
		{
		       for (int j = 1;j <=posY + radius; j++) 
		       {
		            int xSquared = (i - posX)*(i - posX);
		            int ySquared = (j - posY)*(j - posY);
		            if (Math.abs(xSquared + ySquared - radius * radius) < radius) 
		            {
		                System.out.print("o");
		            } else 
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    }
	}
	
}