package basicjava;

import java.util.Scanner;

public class Day_4conditional {

	public static void main(String[] args) {
	int i=24;
	//If condition
	if(i>=25)
	{
		System.out.println("pass");
	}
//if else condition
	else
	{
		System.out.println("fail");
	}
	//if else ladder
	//greatest of three numbers
	int a=25, b=50, c=75;
	if(a>b & a>c)
	{
		System.out.println("a is greater");
	}
	else if(b>a & b>c)
	{
		System.out.println("b is greater");
	}
	else
	{
		System.out.println("c is greater");
	}
	//nested if else 
	int x=10,y=20;
	if(x>y)
	{
		System.out.println("bag");
		if(true)
		{
			System.out.println("sup");
		}
	}
	else
	{
		System.out.println("kis");
	}
	//Switch case
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter weekno:");
	int weekno=sc.nextInt();
	//String weekno=sc.next();
	switch(weekno)
	{
	case 1 : System.out.println("Sunday");break;
	case 2: System.out.println("Monday");break;
	case 3 :System.out.println("Tuesday");break;
	case 4 :System.out.println("Wednesday");break;
	case 5 :System.out.println("Thursday");break;
	case 6 :System.out.println("friday");break;
	case 7 :System.out.println("saturday");break;
	default : System.out.println("invalid week number");break;
	}
	}

}
