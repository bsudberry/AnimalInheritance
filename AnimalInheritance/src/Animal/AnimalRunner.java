package Animal;

import java.util.ArrayList;

public class AnimalRunner
	{

		public static void main(String[] args)
			{
				
				ArrayList<Animal> zoo = new ArrayList <Animal>();
				zoo.add(new Cow());
				zoo.add(new Robin());
				zoo.add(new Bat());
				zoo.add(new Penguin());
				
				for (Animal item : zoo) 
				{
				  item.makesNoise();
				  item.eats();
				  item.bearsYoung();
				  item.canFly();
				  System.out.println(" ");
				}
			}

	}
