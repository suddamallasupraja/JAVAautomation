package oops_concepts;

import java.util.Scanner;

public class Try_catch_finally {

	public static void main(String[] args) {
/*		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number");
		int x=sc.nextInt();
		try
		{
		System.out.println(100+x);
		System.out.println(100%x);
		}
		catch(ArithmeticException  e)
		{
			e.getStackTrace();
			System.out.println(e.getMessage());
			System.out.println("invalid inuput");
		}
		System.out.println("Program completed");   */
		
/*		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  String");
		String a=sc.next();
		try {
		System.out.println(Integer.parseInt(a));}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("invalid input");
		}
      System.out.println("program was completed");  */
		
/*		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  value");
		int x=sc.nextInt();
		System.out.println("enter a position");
		int y=sc.nextInt();
		try {
		a[y]=x;}
		catch(Exception e) {
			System.out.println("invalid input");
		}
		finally {
			System.out.println("program is");
		}
		System.out.println("program is successful"); */

		System.out.println("Enter a  String");
		String a=null;
		try {
		System.out.println(a.length());}
		catch(ArithmeticException e) {
			System.out.println("invalid input");
		}catch(NullPointerException  e){
			System.out.println("invalid");
		}catch(NumberFormatException e) {
			System.out.println("in vaalild");
		}
		System.out.println("program was successful");
	}

}
