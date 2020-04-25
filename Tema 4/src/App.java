import java.util.ArrayList;

public class App {

	private static Segment sgm = new Segment(2);
	private static Punct pct1 = new Punct(5,-4);
	private static Punct pct2 = new Punct(9,0);
	private static Punct pct3 = new Punct(3,10);
	
	//private static FormaGeometrica p1 = new Patrat(pct,pct2);
	//private static FormaGeometrica c1 = new Cerc(sgm, pct3);
	private static FormaGeometrica plansa = new FormaGeometrica();
	
	public static void main(String[] args) 
	{
		System.out.println(" **** ADD/REMOVE/MODIFY/VIEW SHAPES ****");
		Menu mainMenu = InitializeMainMenu();
		mainMenu.execute();
	}
	
	public static Menu InitializeMainMenu()
	{
		ArrayList<IMenuItem> mainMenuItems = new ArrayList<IMenuItem>();
		ArrayList<IMenuItem> addMenuItems = new ArrayList<IMenuItem>();
		ArrayList<IMenuItem> removeMenuItems = new ArrayList<IMenuItem>();
		ArrayList<IMenuItem> modifyMenuItems = new ArrayList<IMenuItem>();
		
		addMenuItems.add(new MenuItem("Patrat", 1, (parameters) ->  {
			adaugaPatrat(pct1,pct2);
		}));
		addMenuItems.add(new MenuItem("Cerc", 2, (parameters) ->  {
			adaugaCerc(pct3,sgm);
		}));
		
		removeMenuItems.add(new MenuItem("Patrat", 1, (parameters) ->  {
			stergeForma(new Patrat(pct1,pct2));
		}));
		removeMenuItems.add(new MenuItem("Cerc", 2, (parameters) ->  {
			stergeForma(new Cerc(sgm,pct3));
		}));
		
		modifyMenuItems.add(new MenuItem("Patrat", 1, (parameters) ->  {}));
		modifyMenuItems.add(new MenuItem("Cerc", 2, (parameters) ->  {}));
		
		mainMenuItems.add(new Menu("Adauga", 1, addMenuItems));
		mainMenuItems.add(new Menu("Sterge", 2, removeMenuItems));
		mainMenuItems.add(new Menu("Modificare", 3, modifyMenuItems));
		mainMenuItems.add(new MenuItem("Vizualizare Plansa", 4, (parameters) -> {
			plansa.afisareForma();
		}));
		
		return new Menu("Main Menu", 0, mainMenuItems);
	}

	private static void adaugaPatrat(Punct a, Punct b)
	{
		IFormaGeometrica patrat = new Patrat(a,b);
		plansa.adaugaForma(patrat);
	}
	
	private static void adaugaCerc(Punct o, Segment r)
	{
		IFormaGeometrica cerc = new Cerc(r,o);
		plansa.adaugaForma(cerc);
	}
	
	private static void stergeForma(IFormaGeometrica forma)
	{
		if(plansa.getSize() > 0)
		{
			for(int i = 0; i < plansa.getSize(); i++)
			{
				if(plansa.getForma(i).equals(forma))
				{
					plansa.stergereForma(forma);
				}
			}
		}
	}
}
