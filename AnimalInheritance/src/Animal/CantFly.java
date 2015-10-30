package Animal;

public class CantFly implements FlightBehavior
{
protected  String canFly;
	
	public CantFly(String c)
	{
		canFly = c;
	}
	@Override
	public void canFly()
		{
		System.out.println("Darn I wish I could fly!!!");
		}
}
