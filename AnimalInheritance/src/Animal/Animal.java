package Animal;
public class Animal implements FlightBehavior
	{
protected String name;
protected String food;

	protected String bearsYoung;
	protected String eats;
	protected String makesNoise;
	
	public void makesNoise()
		{
		System.out.println("An animal makes this noise...");
		}
	
	public void bearsYoung ()
		{
		System.out.println("An animal bears this many young...");
		}
	public void eats()
		{
		System.out.println("A animal eats..");
		}
	}
