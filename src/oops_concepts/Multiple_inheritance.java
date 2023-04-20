package oops_concepts;
interface y1
{
	void james();
}
interface y2
{
	void jimmy();
}
class y3
{
	void dad()
	{
		System.out.println("hiiiiii");
	}
}

public class Multiple_inheritance extends y3 implements y1,y2
{
 public void james()
{
	System.out.println("hola");
}
 public void jimmy()
 {
	 System.out.println("aloha");
 }
	public static void main(String[] args)
	{
		Multiple_inheritance obj=new Multiple_inheritance();
		obj.james();
		obj.jimmy();
		obj.dad();

	}

}
