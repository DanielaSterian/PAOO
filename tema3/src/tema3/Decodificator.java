package tema3;

public class Decodificator {
	private int val;
	
	public Decodificator()
	{
		val = Codificator.getRandom();
	}
	
	public String Decodificare_1(Integer x[])
	{
		String mesaj = "";
		char aux;
		for(int i = 0; i < x.length; i++)
		{
			aux = (char)(x[i] - val);
			mesaj = mesaj + aux;
		}
		return mesaj;
 	}	
	
	public String Decodificare_2(Integer x[])
	{
		String mesaj = "";
		char aux;
		for(int i = 0; i < x.length; i++)
		{
			aux = (char) (x[i] + val);
			mesaj = mesaj + aux;
		}
		return mesaj;	
	}
}
