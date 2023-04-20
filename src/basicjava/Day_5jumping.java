package basicjava;

public class Day_5jumping {

	public static void main(String[] args) {
		//break
		int a=1;
	/*	while(a<=10)
		{
			
			if(a==8)
			{
				break;
			}
			System.out.println(a);
			a++;
		}*/
		//continue
		while(a<=10)
		{
			
			if(a==7 || a==8)
			{
				a++;
				continue;
	
			}
			System.out.println(a);
			a++;
		}
		
//for loop
		/*for(int b=1;b<=10;b++)
		{
			if(b==6)
			{
				continue;
			}
			System.out.println(b);
		}*/
	}

}
