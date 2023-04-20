package basicjava;

public class Day_6arrays {

	public static void main(String[] args) {
		//Single dimensional array
	//Declare the array
		int a[]=new int[5];  //if there is no need to change the values, size is fixed , we cannot add more 
		// Inserting values into array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//second method
		int b[]= {60,70,80,90}; //we can add whenever we need , size is not fixed
		//size of the array
		System.out.println(a.length);
		System.out.println(b.length);
		//if u want to read single value
		System.out.println(a[0]);
		//to read multiple values
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
//using for each loop
		for(int x:a)  //first 10 will transfer to x then 10 will print, later in the same way loop will continue
		{
			System.out.println(x);
		}     
		//Two dimensional array
		//Declaring and inserting values
		int c[][]=new int[3][2];
		c[0][0]=10;
		c[0][1]=20;
		c[1][0]=30;
		c[1][1]=40;
		c[2][0]=50;
		c[2][1]=60;
		int d[][]= { {12,14}, {16,18}, {20, 22}};
		//size of array
		System.out.println(c.length);
		System.out.println(c[0].length);
		System.out.println(d.length);
		System.out.println(d[1].length);
		//read single value
		System.out.println(c[0][0]);
		System.out.println(d[1][1]);
		//to read multiple values
		for(int r=0;r<c.length;r++)
		{
			for(int cm=0;cm<c[r].length;cm++)
			{
				System.out.print(c[r][cm]+"  ");
			}
			System.out.println();
		}
		//for each loop
		for (int y[]:d)  //first row will transfer to y later loop will continue
		{
			for(int z:y)  //first value will transfer to z later loop will continue
			{
				System.out.print(z+"  ");
			}
			System.out.println();
		}
		
		//object array
		Object e[]=new Object[5];
		e[0]=10;
		e[1]='k';
		e[2]="Suppu";
		e[3]=20.6;
		e[4]=true;
		Object f[]= {10,'k',"suppu",20.5,false};
		System.out.println(e.length);
		System.out.println(e[4]);
		for(Object j:f)
		{
			System.out.println(j);
		}
		for(int l=0;l<e.length;l++)
		{
			System.out.println(e[l]);
		}
		
	}

}
