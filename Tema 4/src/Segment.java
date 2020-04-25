
public class Segment {
	private double distanta;
	
	public Segment(Punct a, Punct b)
	{
		distanta = Math.sqrt(Math.pow(b.getX()-a.getX(), 2) + Math.pow(b.getY()-a.getY(), 2));
	}
	
	public Segment(double x)
	{
		distanta = x;
	}
	
	public double getDistanta()
	{
		return distanta;
	}
}
