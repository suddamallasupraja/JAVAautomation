package oops_concepts;
class e
{
	int a=100;
	void m1()
	{
		
		System.out.println(a);
	}
	void m2(int s)
	{
		System.out.println(s);
	}
}
class f extends e
{
	int a=300;
	void m1()
	{
		
		System.out.println(a+a);
	}
	void m2(int s, int q)
	{
		System.out.println(s);
		System.out.println(q);
	}
}
public class Overloading_overriding {

	public static void main(String[] args) {
		f obj=new f();
		obj.m1();
		obj.m2(10);
		obj.m2(20,30);

	}

}
