import java.util.ArrayList;

public class FormaGeometrica implements IFormaGeometrica {

	private ArrayList<IFormaGeometrica> listaForme;
	
	public FormaGeometrica()
	{
		listaForme = new ArrayList<IFormaGeometrica>();
	}
	
	public void afisareForma() 
	{
		if (listaForme.isEmpty()) 
		{
			System.out.println("Nu exista forme de afisat.");
		} else 
		{
			for (IFormaGeometrica forma : listaForme) 
			{
				forma.afisareForma();
			}
		}
	}

	public void adaugaForma(IFormaGeometrica obj) 
	{
		listaForme.add(obj);
	}

	public void stergereForma(IFormaGeometrica obj) 
	{
		listaForme.remove(obj);
	}

	public ArrayList<IFormaGeometrica> getForme()
	{
		return listaForme;
	}
	
	public int getSize()
	{
		return listaForme.size();
	}
	
	public IFormaGeometrica getForma(int position)
	{
		return listaForme.get(position);
	}
	
}
