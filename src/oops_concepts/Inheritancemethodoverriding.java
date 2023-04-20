package oops_concepts;
//super keyword
class d1
{
	int a=100;
	void m1()
	{
		
		System.out.println(a);
	}
}
class d2 extends d1
{
	int a=300;
	void m1()
	{
		
		System.out.println(a+a);
		System.out.println(super.a);
		super.m1();
	}
}
public class Inheritancemethodoverriding {

	public static void main(String[] args) {
	d2 ob=new d2();
	ob.m1();

	}

}
