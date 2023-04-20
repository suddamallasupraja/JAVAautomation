package oops_concepts;

import java.util.ArrayList;
import java.util.HashSet;

public class Collections {

	public static void main(String[] args) {
		//Array list
/*		ArrayList as=new ArrayList();
		//List as=new ArrayList();  //ArrayList is a class which implements the list interface
	//	ArrayList<Integer> as=new ArrayList<Integer>(); //if u want to store homogeneous data
		as.add(10);
		as.add("supraja");
		as.add("null");
		as.add("null");
		as.add(true);
		as.add('s');
		as.add(12.5);
		System.out.println(as.size());
		System.out.println(as);
		as.add(20);
		System.out.println(as);
		System.out.println(as.size());
		System.out.println(as.get(1));
		System.out.println(as.remove(3));
		as.add(3,"hii");
		System.out.println(as);
		for(Object x:as)
		{
			System.out.println(x);
		}     */
		
		//Hash set
		HashSet az=new HashSet();
		az.add(10);
		az.add("supraja");
		az.add("null");
		az.add("null");
		az.add(true);
		az.add('s');
		az.add(12.5);
		System.out.println(az);
		System.out.println(az.size());
		az.remove(10);
		System.out.println(az);
		for(Object x:az)
		{
			System.out.println(x);
		}
		
		
	}

}
