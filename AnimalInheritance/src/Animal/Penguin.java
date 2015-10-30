package Animal;
public  class Penguin extends Animal
	{
		@Override
		public void makesNoise()
			{
			name = "penguin";
			System.out.println("The "+ name + " honks.");
			}	
		@Override
		public void eats()
			{
			System.out.println("The "+ name + ", eats fish.");
			}		
		@Override
		public void bearsYoung()
			{
			System.out.println("The "+ name + " is sitting on an egg.");
			}
		@Override
		public void canFly()
			{
			System.out.println("The "+ name + " wishes that he could fly from his cold home in Antartica.");
			}
	}
