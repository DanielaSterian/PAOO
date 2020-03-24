import java.io.File;
import java.util.Random;

public class TextStreamEncoder {
	private String mesaj;
	private int valRandom;
	
	public TextStreamEncoder() 
	{
		Random generator = new Random();
		valRandom = 1 + generator.nextInt(100);
	}
	
	public TextStreamEncoder(String mesaj)
	{
		Random generator = new Random();
		valRandom = 1 + generator.nextInt(100);
		this.mesaj = mesaj;
	}
	
	public int getValRandom()
	{
		return valRandom;
	}
	
	public void citireMesaj(File fisier)
	{
		GestionareFisier manager = new GestionareFisier();
		mesaj = manager.CitesteDinFisier(fisier);
	}
	
	public void codificareMesaj(String nume)
	{	
		GestionareFisier manager = new GestionareFisier();
		Integer[] codCaractere = new Integer[mesaj.length()];
		
		for(int i = 0; i < mesaj.length(); i++)
		{
			codCaractere[i] = (int) mesaj.charAt(i) + valRandom;
		}
		
		for(int i = 0; i < mesaj.length(); i++)
		{
			manager.ScriereInFisier(nume, codCaractere[i].toString());
			manager.ScriereInFisier(nume, " ");
		}
		System.out.println("Datele au fost scrise in fisier!");
	}
}