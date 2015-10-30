package Animal;
public  class Bat extends Animal
	{
		@Override
		public void makesNoise()
			{
			name = "Bat";
			System.out.println("The " +name + " screaches.");
			}		
		@Override
		public void eats()
			{
			System.out.println("The "+ name + ", eats rats.");
			}	
		@Override
		public void bearsYoung()
			{
			System.out.println("The "+ name + " has a cute baby bat.");
			}
		@Override
		public void canFly()
			{
			System.out.println("The "+ name + " loves that he can fly.");
			}
	}

