package oops_concepts;
//Method overloading
public class Polymorphismoverloading {
	int x,y;
	double z;
	void display()
	{
		System.out.println("aaaaa");
	}
void display(int a, int b)
{
	x=a;
	y=b;
	System.out.println(x+"  "+y);
}
void display(int a,double b)
{
	y=a;
	z=b;
	System.out.println(y+"  "+z);
}
 void display(double a, int b)
 {
	 z=a;
	 x=b;
	 System.out.println(z+"  "+x);
 }
}
