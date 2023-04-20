package basicjava;

public class Day_6assignments {

	public static void main(String[] args) {
		//Find sum of elements in array a={1,2,3,4,5,6} sum=15
		int a[]= {1,2,3,4,5,6}; int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
		}
		System.out.println(count);
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		//print even and odd numbers from array a={1,2,3,4,5,6} even=3 odd=3
		int b[]={1,2,3,4,5,6}; int even=0;int odd=0;
		for(int i=0;i<b.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
		}
		System.out.println(even);
		System.out.println(odd);
		//search an element in array a={10,20,30,40,50} num=30
		int c[]={10,20,30,40,50};
		int num=60;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==60)
			{
				System.out.println("Present");
				break;
			}
		}
		System.out.println(" not Present");
		//sort the elments a={50,20,40,10,100} after sorting 10 20 40 50 1000	
	int	d[]={50,20,40,10,100}; int j;
	for(int i=0;i<d.length;i++)
	{
		for( j=i+1;j<d.length;j++)
		{
			if(d[i]>d[j])
			{
			int temp=d[i];
			d[i]=d[j];
			d[j]=temp;
			}
		}
	}
	for(int i=0;i<d.length;i++)
	{
		System.out.println(d[i]);
	}
	}

}
