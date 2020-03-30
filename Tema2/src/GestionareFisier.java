import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class GestionareFisier  {
	public void CreareFisier(File fisier)
	{
		try {
			if (fisier.createNewFile())
			{ // verifica daca fisierul exista deja(false) si in caz ca nu exista il
											// creaza(true)
				System.out.println("S-a creat fisierul " + fisier.getName());
			} else 
			{
				System.out.println("Fisierul e deja creat!");
			}
		} catch (IOException e)
		{ // in caz ca exista erori se intra pe ramura de catch
			System.out.println("Exista o eroare!");
			e.getStackTrace(); // arata linia erorii
		}

	}
	
	public void ScriereInFisier(String numeFisier, String mesaj)
	{
		try {
			FileWriter fisier = new FileWriter(numeFisier, true);
			fisier.write(mesaj);
			fisier.close();
			//System.out.println("S-a introdus textul " + mesaj + " in fisierul " + numeFisier);
		} catch (IOException e) {
			System.out.println("Exista o eroare!");
			e.getStackTrace();
		}
	}
	
	public String CitesteDinFisier(File fisier)
	{
		String aux = null;
		try {
			Scanner input = new Scanner(fisier);
			if(input.hasNextLine())
			{
				aux = input.nextLine();
			}
			input.close();
		} catch (IOException e) {
			System.out.println("Exista o eroare!");
			e.getStackTrace();
		}
		return aux;
	}
}
