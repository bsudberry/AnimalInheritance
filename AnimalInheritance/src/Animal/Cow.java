package Animal;
public  class Cow extends Animal implements FlightBehavior
	{
		@Override
		public void makesNoise()
			{
			name = "Cow";
			System.out.println("The "+name + " moo's.");
			}		
		@Override
		public void eats()
			{
			System.out.println("The "+ name + ", eats grass.");
			}	
		
		@Override
		public void bearsYoung()
			{
			System.out.println("The "+ name + " has a cute baby cow.");
			}
		@Override
		public void canFly()
			{
			System.out.println("The "+ name + " wishes he could fly.");
			}
	}
