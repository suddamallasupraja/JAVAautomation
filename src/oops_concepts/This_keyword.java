package oops_concepts;

public class This_keyword {
int a;
int b;
void display(int a, int b)
{
	a=a;
	b=b;
}
/*  void display(int a, int b)
{
	this.a=a;
	this.b=b;
}  */
void disco()
{
	System.out.println(a);
	System.out.println(b);
}

	public static void main(String[] args) {
		This_keyword emp=new This_keyword();
emp.display(20,40);
emp.disco();

 }
}
