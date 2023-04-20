package basicjava;
//Swapping the two numbers without using third/temporary  variable
public class Day_3swap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
	/*a=a+b;
		b=a-b;
		a=a-b;  */
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a+" "+b+" ");
		
		

	}

}
