package oops_concepts;

class b1
{
	int a=10,b=20;
	void v()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class b2 extends b1
{
	int c=30;
	void tae()
	{
		
		System.out.println(c);
	}
}
class b3 extends b2
{
	void taeh()
	{
		System.out.println("heeeeeeeeehaaaaa");
	}
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
	/*	b3 obj=new b3();
				obj.taeh();
				obj.tae();
				obj.v();     */
		b2 ob=new b2();
				ob.tae();
				ob.v();

	}

}
