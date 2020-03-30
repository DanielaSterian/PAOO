package tema3;

import java.util.Random;

public class Codificator {
	private static int random;
	
	public Codificator()
	{
		Random rand = new Random();
		random = 1 + rand.nextInt(100);
	}
	
	public static int getRandom()
	{
		return random;
	}
	
	public Integer[] Codificare_1(String mesaj)
	{
		Integer v[] = new Integer[mesaj.length()];
		for(int i = 0; i < mesaj.length(); i++)
		{
			v[i] = (int) mesaj.charAt(i) + random;
		}
		return v;
 	}	
	
	public Integer[] Codificare_2(String mesaj)
	{
		Integer v[] = new Integer[mesaj.length()];
		for(int i = 0; i < mesaj.length(); i++)
		{
			v[i] = (int) mesaj.charAt(i) - random;
		}
		return v;	
	}
}
