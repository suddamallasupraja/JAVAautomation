package basicjava;

public class Day_3 {

	public static void main(String[] args) {
		//Arithmetic operators
		int a=20, b=10;
		System.out.println("output: "+(a+b));
		System.out.println("output: "+(a-b));
		System.out.println("output: "+(a*b));
		System.out.println("output: "+(a/b)); //[quotient]
		System.out.println("output: "+(a%b));// [remainder]
		//Relational operators
		 a=40; b=50;
		 System.out.println("output: "+(a>b));
		 System.out.println("output: "+(a>=b));
		 System.out.println("output: "+(a<b));
		 System.out.println("output: "+(a<=b));
		 System.out.println("output: "+(a!=b));
		 System.out.println(a==b);
		//Logical operators
		 boolean c=true, d=false;
		 System.out.println("output: "+(c && d));
		 System.out.println("output: "+(c || d));
		 System.out.println("output: "+(!c));
		 System.out.println("output: "+(!d));
		 //increment / decrement operators
		 int x=10;
		// x++;
		// System.out.println(x);
		// ++x;
		//System.out.println(x);
		int res=x++;
	 System.out.println(res);
		// int res=++x;
		 //System.out.println(res);
		 
		 int y=20;
		// y--;
			// System.out.println(y);
			// --y;
			//System.out.println(y);
			//int res=y--;
			//System.out.println(res);
			 int op=--y;
			 System.out.println(op);
			 
			 //Assignment operators
			 a=30; b=60;
			 System.out.println(a+=b);
			 System.out.println(a-=b);
			 System.out.println(a*=b);
			 System.out.println(a/=b);
			 System.out.println(a%=b);
			 
			 //Conditional operator
			 a=10;b=20;
			 int f=(a>b) ? a : b;
			 System.out.println(f);
			 b=25;
			 String s=(b>=18) ? "eligible" : "not egilible";
			 System.out.println(s);
	}

}
