package oops_concepts;

import java.util.HashMap;

public class HashMap_Collections {

	public static void main(String[] args) {
		HashMap<Integer,String> qa=new HashMap<Integer,String>();
		qa.put(1, "supraj");
		qa.put(2, "suraj");
		qa.put(3, "surat");
		qa.put(1, "supraja");
		qa.put(4, "suraj");
		qa.put(5,"sorry");
		System.out.println(qa);
		System.out.println(qa.size());
		System.out.println(qa.get(5));
		System.out.println(qa.remove(1));
		System.out.println(qa);
		System.out.println(qa.keySet());
		for(Object x:qa.keySet())
		{
			System.out.println(x +"    "+qa.get(x));
		}
		

	}

}
