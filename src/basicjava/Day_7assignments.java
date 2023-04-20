package basicjava;

public class Day_7assignments {

	public static void main(String[] args) {
		//reverse a string s= "abc" op "cba"
		String s1="abc";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		//check string palindrome or not s="madam" op "madam"
		if(s1.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		//check string presence in an array
		String s3="supraja";
		String s4="raja";
	if(s3.contains(s4))
		{
			System.out.println(" substring found");
		}
		else
		{
			System.out.println("substring not found");
		}
		
		//swap two strings x="john" y="david"
	String x="john";
	String y="david";
	String z="";
	z=x;
	x=y;
	y=z;
	System.out.println(x);
	System.out.println(y);

	}

}
