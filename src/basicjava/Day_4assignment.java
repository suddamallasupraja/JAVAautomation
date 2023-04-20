package basicjava;

public class Day_4assignment {

	public static void main(String[] args) {
		//largest of 2 numbers(if else and ternary)
		int a= 20, b=40;
		/*if(a>b)
		{
			System.out.println("a is greater");
		}
		else 
		{
			System.out.println("b is greater");
		}*/
		String s=(a>b) ? "a is greater" : "b is greater";
		System.out.println(s);
		//smallest of 3 numbers(if else)
		int x=10,y=20,z=30;
		if(x<y & x<z)
		{
			System.out.println("x is smaller");
		}
		else if(y<x & y<z)
		{
			System.out.println("y is smaller");
		}
		else 
		{
			System.out.println("z is smaller");
		}
		//print month name by taking month number(1-12) using switch case
int monthno=13;
switch(monthno)
{
case 1:System.out.println("january");break;
case 2:System.out.println("february");break;
case 3:System.out.println("march");break;
case 4:System.out.println("april");break;
case 5:System.out.println("may");break;
case 6:System.out.println("june");break;
case 7:System.out.println("july");break;
case 8:System.out.println("august");break;
case 9:System.out.println("september");break;
case 10:System.out.println("october");break;
case 11:System.out.println("november");break;
case 12:System.out.println("december");break;
default: System.out.println("invalid");
}
	}

}
