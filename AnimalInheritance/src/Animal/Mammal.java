package Animal;
public abstract class Mammal extends Animal
	{
		protected  String bearsYoung;
		
		public Mammal(String b)
		{
			bearsYoung = b;
		}
		@Override
		public void bearsYoung()
			{
			System.out.println("A mammal bears this many young..");
			}
	}