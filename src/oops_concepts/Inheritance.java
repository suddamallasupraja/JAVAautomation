package oops_concepts;
//single inheritance
class a1
{
	void su()
	{
	System.out.println("hello people");
	}
}
class a2 extends a1
{
	void sup()
	{
		System.out.println("hello world");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		a2 ob=new a2();
		ob.sup();
		ob.su();

	}

}
