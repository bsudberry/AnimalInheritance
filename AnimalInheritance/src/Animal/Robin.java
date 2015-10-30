package Animal;
public class Robin extends Animal
	{
		@Override
		public void makesNoise()
			{
			name = "Robin";
			System.out.println("The "+name + " chirps..");
			}		
		@Override
		public void eats()
			{
			System.out.println("The "+ name + ", eats worms.");
			}		
		@Override
		public void bearsYoung()
			{
			System.out.println("The "+ name + " has a egg laying in its' nest.");
			}
		@Override
		public void canFly()
			{
			System.out.println("The "+ name + " loves the view when he flies.");
			}
	}
