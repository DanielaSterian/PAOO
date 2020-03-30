package tema3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestionareFisier {
	
	private File fisier;
	
	public GestionareFisier(File x)
	{
		fisier = x;
	}
	
	public void setFisier(File x)
	{
		fisier = x;
	}
	
	public void CreareFisier()
	{
		try
		{
			if(fisier.createNewFile())
			{
				System.out.println("Fisierul " + fisier.getName() +" a fost creat!");
			}else {
				System.out.println("Fisierul deja exista!");
			}
		}catch(IOException e){
			System.out.println("Exista o eroare!");
			e.getStackTrace();
		}
	}
	
	public void ScriereInFisier(String mesaj)
	{
		FileWriter writer = null;
		try {
			writer = new FileWriter(fisier.getName(), true);
			writer.write(mesaj);
		} catch (IOException e) {
			System.out.println("Exista o eroare!");
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				System.out.println("Exista o eroare la inchiderea writer-ului!");
				e.printStackTrace();
			}
		}
	}
	
	public String CitireFisier()
	{
		Scanner scan = null;
		String aux = null;
		try {
			scan = new Scanner(fisier);
			if(scan.hasNextLine())
			{
				aux = scan.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fisierul nu a fost gasit!");
			e.printStackTrace();
		}finally {
			if(scan != null)
			{
				scan.close();
			}
		}
		return aux;
	}
	
	//Sir de numere intregi
	public Integer[] CitireFisierInt()
	{
		Scanner scan = null;
		ArrayList<Integer> fileArray = new ArrayList<Integer>();
		String caracter;
		try {
			scan = new Scanner(fisier);
			while(scan.hasNext())
			{
				caracter = scan.next();
				fileArray.add(Integer.parseInt(caracter));	
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fisierul nu a fost gasit!");
			e.printStackTrace();
		}finally {
			if(scan != null)
			{
				scan.close();
			}
		}
		Integer aux[] = new Integer[fileArray.size()];
		aux = fileArray.toArray(aux);
		fileArray.clear();
		return aux;
	}
}