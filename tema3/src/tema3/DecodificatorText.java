package tema3;

import java.io.File;

public class DecodificatorText extends Decodificator {
	protected String mesajDecodificat;
	protected Integer mesajCodificat[];
	
	public DecodificatorText(Integer x[])
	{
		mesajCodificat = x;
	}
	
	public void Start(int optiune)
	{
		if(optiune == 1)
		{
			mesajDecodificat = Decodificare_1(mesajCodificat);
		}
		else
			if(optiune == 2)
		{
			mesajDecodificat = Decodificare_2(mesajCodificat);
		}
	}
	
	public void ScrieMesaj(File fisier)
	{
		GestionareFisier manager = new GestionareFisier(fisier);
		manager.ScriereInFisier(mesajDecodificat);
	}
}
