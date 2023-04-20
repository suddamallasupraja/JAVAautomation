package oops_concepts;

interface door
{
	int a=20;
	int b=30;
	void ab();
	default void abs()
	{
		System.out.println("heello");
	}
	static void abba()
	{
		System.out.println("hiiiiii");
	}
}

public class Abstraction implements door
{
	public void ab()
	{
		System.out.println("suuuuppppp");
	}
	

	public static void main(String[] args) 
	{
		//door.a=40;
		System.out.println(door.a);
		System.out.println(door.b);
		door.abba();
		//door obj=new Abstraction();
		Abstraction obj=new Abstraction();
		obj.ab();
		obj.abs();

	}

}
