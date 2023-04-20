package oops_concepts;

public class Class_Object {
/*	int a=50;
	String s="supraja";
	float g=10.5f; */
	int a;
	String s;
	float g;
	//By using methods
	void show(int b,String s1,float gr)
	{
		a=b;
		s=s1;
		g=gr;
	}
	//By using constructors
	Class_Object(/*int c,String s3,float h -- parameterised constructor*/)  //default constructor
	{
	//	a=c;
//		s=s3;
	//	g=h;
		a=200;
		s="bitter";
		g=56.8f;
	}
	void display()
	{
		//System.out.println(a);
		//System.out.println(s);
		//System.out.println(g);
		System.out.println(a+"  "+s+"   "+g);
	}

	

}
