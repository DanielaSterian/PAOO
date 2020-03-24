import java.io.File;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("asdfg");
		File fisierIn = new File("input.txt");
		File fisierOut = new File("encoded.bin");
		
		GestionareFisier manager = new GestionareFisier();
		
		manager.CreareFisier(fisierIn);
		manager.CreareFisier(fisierOut);
		
		Scanner input = new Scanner(System.in);
		String mesaj;
		
		System.out.println("Introduceti textul: ");
		mesaj = input.nextLine();
		
		manager.ScriereInFisier(fisierIn.getName(), mesaj);

		TextStreamEncoder obj = new TextStreamEncoder();
		System.out.println("Numarul generat random este: " + obj.getValRandom());
		obj.citireMesaj(fisierIn);
		obj.codificareMesaj(fisierOut.getName());
	}
}
