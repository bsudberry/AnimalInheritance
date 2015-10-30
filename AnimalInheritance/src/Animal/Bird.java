package Animal;
public  abstract class Bird extends Animal
{
	protected  String bearsYoung;

	public Bird(String b)
	{
		bearsYoung = b;
	}
	@Override
	public void bearsYoung()
		{
		System.out.println("A mammal bears this many young..");
		}
}
