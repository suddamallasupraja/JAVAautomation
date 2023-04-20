package oops_concepts;
//private visibility only with in the class
public class Accessmodifiers {
	private int a=20;
	private void ac()
	{
		System.out.println("supraja");
	}  
 public static void main(String  []args)
 {
	 Accessmodifiers  ob=new Accessmodifiers ();
	 ob.ac();
	 System.out.println(ob.a); 
 }
}
