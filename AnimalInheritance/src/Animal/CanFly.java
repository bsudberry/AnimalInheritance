package Animal;

public class CanFly implements FlightBehavior
	{
	protected  String canFly;
		
		public CanFly(String c)
		{
			canFly = c;
		}
		@Override
		public void canFly()
			{
			System.out.println("I love being able to fly");
			}
	}
