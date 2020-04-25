
public class Patrat extends FormaGeometrica 
{
	private Punct p1;
	private Punct p2;
	
	public Patrat(Punct p1, Punct p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}

	public void afisareForma()
	{
		if(Math.abs(p1.getX() - p2.getX()) == Math.abs(p1.getY() - p2.getY()))
		{
			Segment diagonala = new Segment(p1, p2);
			
			int latura = (int) Math.round((diagonala.getDistanta() / Math.sqrt(2)));
			
			char plansa[][] = new char[latura][latura];
			
			for(int i = 0 ; i < latura; i++)
			{
				for(int j = 0; j < latura; j++)
				{
					if(i == 0 || j == 0 || i == latura - 1 || j == latura -1)
					{
						plansa[i][j] = '#';
					}
					else
					{
						plansa[i][j] = ' ';
					}
					System.out.print(plansa[i][j] + " ");
					
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Punctele date nu formeaza un patrat.");
		}
	}
	
}
      