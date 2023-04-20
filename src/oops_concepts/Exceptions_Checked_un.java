package oops_concepts;

import java.util.Scanner;

//unchecked exceptions
public class Exceptions_Checked_un {


	public static void main(String[] args) {
		
		//Arithmetic exception
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number");
		int x=sc.nextInt();
		System.out.println(100%x);
		System.out.println("Program completed");   
		
		//Number format Exception
/*		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  String");
		String a=sc.next();
		System.out.println(Integer.parseInt(a));
      System.out.println("program was completed");   */
		
		//ArrayIndexOutOfBoundsException
/*		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  value");
		int x=sc.nextInt();
		System.out.println("enter a position");
		int y=sc.nextInt();
		a[y]=x;
		System.out.println("program is successful");   */
		
//NullPointerException		
	//	Scanner sc=new Scanner(System.in);
/*		System.out.println("Enter a  String");
		//String a=sc.next();
		String a=null;
		System.out.println(a.length());
		System.out.println("program was successful");  */
	}

}
