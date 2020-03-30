package tema3;

import java.io.File;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Declararea fisierelor
		File inputT = new File("input.txt");
		File inputB = new File("input.bin");
		File codificatT = new File("codificat.txt");
		File codificatB = new File("codificat.bin");
		File decodificatT = new File("decodificat.txt");
		File decodificatB = new File("decodificat.bin");
		
		//Gestionare fisier input text + instanta codificator text
		GestionareFisier manager = new GestionareFisier(inputT);
		manager.CreareFisier();
		manager.ScriereInFisier("Abra");
		
		CodificatorText codText = new CodificatorText(manager.CitireFisier());
		
		//Gestionare fisier input binar + instanta codificator binar
		manager.setFisier(inputB);
		manager.CreareFisier();
		manager.ScriereInFisier("cadabra");
		
		CodificatorBinar codBinar = new CodificatorBinar(manager.CitireFisier());
		
		//Gestionare setare fisier + creare fisiere output pt mesajul codificat text + binar
		manager.setFisier(codificatT);
		manager.CreareFisier();
		
		manager.setFisier(codificatB);
		manager.CreareFisier();
		
		
		int x;
		
		//Meniu pentru codificare ------------------------------------------------------------
		System.out.println("\nIntrodu 1 pentru a codifica fisierul text.\n"
				+ "Introdu 2 pentru a codifica fisierul binar.\n"
				+ "Introdu 3 pentru a codifica ambele tipuri de fisier.\n"
				+ "Introdu 0 pentru a iesi.");
			
		x = scan.nextInt();
		
		switch(x)
		{
			case 1:
				System.out.print("Alegeti algoritmul de codificare (1 sau 2): ");
				x = scan.nextInt();
				if(x == 1 || x == 2)
				{
					codText.Start(x);
					codText.ScrieMesaj(codificatT);
				}
				else
				{
					System.out.println("Optiunea introdusa nu este corecta.");
				}
				break;
				
			case 2:
				System.out.print("Alegeti algoritmul de codificare (1 sau 2): ");
				x = scan.nextInt();
				if(x == 1 || x == 2)
				{
					codBinar.Start(x);
					codBinar.ScrieMesaj(codificatB);
				}
				else
				{
					System.out.println("Optiunea introdusa nu este corecta.");
				}
				break;
				
			case 3:
				System.out.print("Alegeti algoritmul de codificare pentru fisierul text (1 sau 2): ");
				x = scan.nextInt();
				if(x == 1 || x == 2)
				{
					codText.Start(x);
					codText.ScrieMesaj(codificatT);
				}
				else
				{
					System.out.println("Optiunea introdusa nu este corecta.");
				}
				
				System.out.print("Alegeti algoritmul de codificare pentru fisierul binar (1 sau 2): ");
				x = scan.nextInt();
				if(x == 1 || x == 2)
				{
					codBinar.Start(x);
					codBinar.ScrieMesaj(codificatB);
				}
				else
				{
					System.out.println("Optiunea introdusa nu este corecta.");
				}
				break;
				
			case 0:
				System.out.println("S-a iesit din program.");
				break;
				
			default:
				System.out.println("Optiunea introdusa nu este corecta!");
				break;		
		}
		
		System.out.print("\nApasa '1' pentru a accesa meniul de decodificare si '0' pentru a iesi: ");
		x = scan.nextInt();
		
		//Gestionare fisier output decodificator text + instanta decodificator text
		manager.setFisier(decodificatT);
		manager.CreareFisier();
				
		manager.setFisier(codificatT);

		DecodificatorText decText = new DecodificatorText(manager.CitireFisierInt());
				
		//Gestionare fisier output decodificator binar + instanta decodificator binar
		manager.setFisier(decodificatB);
		manager.CreareFisier();
				
		manager.setFisier(codificatB);
				
		DecodificatorBinar decBinar = new DecodificatorBinar(manager.CitireFisierInt());
		
		//Meniu pentru decodificare ----------------------------------------------------------------
		if(x==1)
		{
			System.out.println("\nIntrodu 1 pentru a decodifica fisierul text.\n"
					+ "Introdu 2 pentru a decodifica fisierul binar.\n"
					+ "Introdu 3 pentru a decodifica ambele tipuri de fisier.\n"
					+ "Introdu 0 pentru a iesi.");
				
			x = scan.nextInt();
			
			switch(x)
			{
				case 1:
					System.out.print("Alegeti algoritmul de decodificare (1 sau 2): ");
					x = scan.nextInt();
					if(x == 1 || x == 2)
					{
						decText.Start(x);
						decText.ScrieMesaj(decodificatT);
					}
					else
					{
						System.out.println("Optiunea introdusa nu este corecta.");
					}
					break;
					
				case 2:
					System.out.print("Alegeti algoritmul de decodificare (1 sau 2): ");
					x = scan.nextInt();
					if(x == 1 || x == 2)
					{
						decBinar.Start(x);
						decBinar.ScrieMesaj(decodificatB);
					}
					else
					{
						System.out.println("Optiunea introdusa nu este corecta.");
					}
					break;
					
				case 3:
					System.out.print("Alegeti algoritmul de decodificare pentru fisierul text (1 sau 2): ");
					x = scan.nextInt();
					if(x == 1 || x == 2)
					{
						decText.Start(x);
						decText.ScrieMesaj(decodificatT);
					}
					else
					{
						System.out.println("Optiunea introdusa nu este corecta.");
					}
					
					System.out.print("Alegeti algoritmul de decodificare pentru fisierul binar (1 sau 2): ");
					x = scan.nextInt();
					if(x == 1 || x == 2)
					{
						decBinar.Start(x);
						decBinar.ScrieMesaj(decodificatB);
					}
					else
					{
						System.out.println("Optiunea introdusa nu este corecta.");
					}
					break;
					
				case 0:
					System.out.println("S-a iesit din program.");
					break;
					
				default:
					System.out.println("Optiunea introdusa nu este corecta!");
					break;		
			}
		}
		
		scan.close();
		
		System.out.println("Numarul generat random pentru codificare este: " + Codificator.getRandom());
	}	
	
}
