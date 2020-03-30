package tema3;

import java.io.File;

public class CodificatorText extends Codificator {
	protected String mesaj;
	protected Integer mesajCodificat[];
	
	public CodificatorText(String x)
	{
		mesaj = x;
		mesajCodificat = new Integer[mesaj.length()];
	}
	public void Start(int optiune)
	{
		if(optiune == 1)
		{
			mesajCodificat = Codificare_1(mesaj);
		}else
			if(optiune == 2)
			{
				mesajCodificat = Codificare_2(mesaj);
			}
	}
	public void ScrieMesaj(File fisier)
	{
		GestionareFisier manager = new GestionareFisier(fisier);
		for(int i = 0; i < mesaj.length(); i++)
		{
			manager.ScriereInFisier(mesajCodificat[i].toString());
			manager.ScriereInFisier(" ");
		}
	}
}
