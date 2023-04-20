package oops_concepts;

public class Wrapper_Classes {

	public static void main(String[] args) {
		/*
int z=100;  //a is primitive -- int is a built in method of Integer class
Integer ze=200; // b is object -Integer is a class and b can access methods of integer class

byte a=10;  //Byte class
short b=20; //Short class
int c=30;  //Integer class
long d=40;  //Long class
boolean e=true;  //Boolean class
char f='a';  //Character class
float g=10.5f;  //Float class
double h=11.7; //Double class

//Primitive to object :auto boxing

Byte i=a;
Short j= b;
Integer k=c;
Long l=d;
Boolean m= e;
Character n=f;
Float o =g;
Double p=h;

//object to primitive  : unboxing
byte q=i;
short r=j;
int s=k;
long t=l;
boolean u=m;
char v=f;
float w=o;
double x1=p;   */

//data conversions ---string to character not possible
String s="10";
System.out.println(s+s);
int a=Integer.parseInt(s);
System.out.println(a+a);

int b=20;
System.out.println(b+b);
String s1=String.valueOf(b);
System.out.println(s1+s1);

	}

}
