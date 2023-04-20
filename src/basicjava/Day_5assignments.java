package basicjava;

public class Day_5assignments {

	public static void main(String[] args) {
//Reverse a number ip 1234 op 4321
		int a=1234, rev=0,r=0;
		int x=a;
		while(a!=0)
		{
			r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		System.out.println(rev);
//Palindrome number ip 121 op 121
		if(rev==x)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
//count no of digits in a number ip 123456 op 6
		int b=123456; int count=0;
		while(b!=0)
		{
			count++;
			b=b/10;
		}
		System.out.println(count);
//count no of even and odd digits in a number ip 23456 op 3 even 2 odd
		int c=23456, even=0,odd=0;
		while(c!=0)
		{
			if(c%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			c=c/10;
		}
		System.out.println("even count  " + even);
		System.out.println("odd count  " + odd);
//find sum of digits in a number ip 1234 op 10		
		int d=1234,sum=0,s=0;
		while(d!=0)
		{
			s=d%10;
			sum=sum+s;
			d=d/10;
		}
System.out.println(sum);
	}

}
